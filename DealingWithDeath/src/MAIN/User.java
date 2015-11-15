package MAIN;
/**Class: Interface.java
 * @author: Soheb Samshuddin
 * @collaborator:Jackob from AEC
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: November 11, 2015
 * Class Description: Main Class
 * Purpose: Creates the game, handles saving and loading.
 * 
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import PLAYER.Player;

public class User
{
	protected final String PLAYERLIST = "PlayerList.txt";
	protected boolean passMainMenu = false;
	protected String userName = "";
	protected Player play = new Player();
	protected Scanner input = new Scanner(System.in);
	protected ArrayList<String> userList;

	public void mainMenu()
	{
		System.out.println("Welcome");
		System.out.println("Dealing With Death!!!!!");

		while (!passMainMenu)
		{
			System.out.println("\n\t\t\t     MAIN MENU");
			System.out.println("\t\t\t\t1. Start NEW GAME ");
			System.out.println("\t\t\t\t2. LOAD AN EXISTING GAME");
			System.out.println("\t\t\t\t3. EXIT GAME");
			System.out.println("\n");
			String selection = input.nextLine();

			if (selection.equals("1"))
			{
				System.out.println("\nPlease Enter Your Name:");
				this.userName = input.nextLine().toUpperCase();
				if (userName.length() > 0 && userName != null
						&& !userName.contains(" "))
				{
					this.newGame(userName);
				}
				else
				{
					System.out.println(
							"\nUSER NAME MUST CONTAIN CHARACTERS AND NO SPACES");
					System.out.println("RETURNING TO MAIN MENU");
				}
			}
			else if (selection.equals("2"))
			{
				this.load();
			}
			else if (selection.equals("3"))
			{
				System.out.println(
						"\n\t\t\t THANK YOU FOR PLAYING DEALING WITH DEATH!!");
				System.exit(0);
			}
			else
			{
				System.out.println("\nThat Was Not Valid.");
				System.out.println("Returning To Main Menu.");

			}

		}

	}

	public void newGame(String userName)
	{

		// Declare file reading/writing classes
		FileReader fr = null;
		Scanner fileIn = null;
		PrintWriter pw = null;

		// Build a string of users in PlayerList.txt for rewriting
		String userString = "";
		// Create PlayerList.txt if it doesn't exist

		File playerListFile = new File(PLAYERLIST);
		if (!playerListFile.exists())
		{
			try
			{
				playerListFile.createNewFile();
			}
			catch (IOException e)
			{
				System.out.println("\nERROR: Unable to create PlayerList.txt");
			}
		}
		try
		{
			// Instantiate file reading objects
			fr = new FileReader(PLAYERLIST);
			fileIn = new Scanner(fr);

			// Read through PlayerList.txt in while loop
			while (fileIn.hasNext())
			{
				String nextName = fileIn.nextLine();
				// Check for existing user names
				if (nextName.equals(userName))
				{
					System.out.println(
							"\nA player with this name already exists.");
					System.out.println("Returning to main menu.");
					fr.close();
					fileIn.close();
					return;
				}
				// userString String builder with new line tags
				userString = userString + nextName + "\n";
			}

			// Add new user name to userString for rewriting
			userString = userString + userName;

			// Close file reading objects and instantiate file writing objects
			fr.close();
			fileIn.close();
			pw = new PrintWriter(PLAYERLIST);

			// Write new user list to PlayerList.txt and close file writing
			// objects
			pw.print(userString);
			pw.close();

			new Player(userName);
			this.save();

			this.passMainMenu = true;
		}
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: PlayerList.txt is missing!");
		}
		catch (IOException e)
		{
			System.out.println("ERROR: Something went wrong (fr.close)");
		}

		// TODO finish the following for testing

	}

	public void save()
	{
		System.out.println("\n\tSaving . . . ");

		// Build userFile string based on player name
		String userFile = userName + ".dat";

		// Declare file writing object
		ObjectOutputStream output = null;

		// Initialize file writing objects and write user data to file
		try
		{
			output = new ObjectOutputStream(new FileOutputStream(userFile));
			output.writeObject(play);
			System.out.print("\tComplete!\n");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: Unable to access user save file.");
			System.out.println("ERROR: Please ensure " + userFile
					+ " file is is the correct location.");
		}
		catch (IOException e)
		{
			System.out.println("ERROR: Unable to write user save file.");
			System.out.println("ERROR: Please ensure " + userFile
					+ " file is not being used by another program.");
			e.printStackTrace();
		}

		// Close file writing objects
		try
		{
			output.close();
		}
		catch (IOException e)
		{
			System.out.println(
					"ERROR: ObjectOutputStream was never initialized.");
		}
	}

	public void load()
	{
		// Declare file reading objects
		FileReader fr = null;
		Scanner inputScan = null;
		Scanner userInput = null;
		ObjectInputStream inputStream = null;

		// Initiate load dialog
		System.out.println("\nWho are you? (enter a number)");

		// Initialize file reading objects
		try
		{
			fr = new FileReader(PLAYERLIST);
			inputScan = new Scanner(fr);
			userInput = new Scanner(System.in);
		}
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: Unable to find player list.");
			System.out.println("ERROR: Please ensure " + PLAYERLIST
					+ " is in the correct location.");
		}

		// Output all users available to load and temp store them in userList AL
		userList = new ArrayList<String>();
		int userCount = 1;
		while (inputScan.hasNext())
		{
			String user = inputScan.nextLine();
			System.out.println(userCount + ". " + user);
			userList.add(user);
			userCount += 1;
		}

		// Get user name selection
		int selection;
		try
		{
			selection = userInput.nextInt();
		}
		catch (InputMismatchException e)
		{
			System.out.println("\nThat was not a valid selection.");
			System.out.println("Returning to main menu.");
			return;
		}

		// Load selection from player list or return to main menu
		if (selection <= userList.size() && selection > 0)
		{
			String userFile = userList.get(selection - 1) + ".dat";
			try
			{
				System.out.println("\n\tLoading . . . ");
				inputStream = new ObjectInputStream(
						new FileInputStream(userFile));
				this.play = (Player) inputStream.readObject();
				System.out.print("\tComplete!\n");
				this.passMainMenu = true;
			}
			catch (IOException e)
			{
				System.out.println(
						"ERROR: There was a problem reading " + userFile + ".");
			}
			catch (ClassNotFoundException e)
			{
				System.out.println(
						"ERROR: Cannot read file. Player object is missing or corrupt.");
			}
		}
		else
		{
			System.out.println("\nThat was not a valid selection.");
			System.out.println("Returning to main menu.");
			return;
		}

		// Close file reading objects
		try
		{
			fr.close();
			inputScan.close();
			userInput.close();
			inputStream.close();
		}
		catch (Exception e)
		{
			System.out.println(
					"ERROR: Something went wrong while closing input objects.");
		}

	}

	//Adrianna
	public void help()
	{
		Scanner user_input = new Scanner(System.in);
		String keyword = "help";
		if (!(user_input.next() == keyword))
		{
			System.out.println("List of Commands\n");
			System.out.println("Say -attack- to harm NPC");
			System.out.println("Say -move- to move foward to the next room");
			System.out.println(
					"Say -inventory- to see a list items you are holding");
			System.out.println("Say -equip- to put a wearable item on");
			System.out.println("Say -drop- to release an item from yourself");
			System.out.println("Say -take- to add an item to your inventory");
			System.out.println("Say -deal- to begin a transaction with an NPC");
			System.out
					.println("Say -sell- to trade money for drugs with an NPC");
		}
		else
		{
			System.out.println("Invalid");
		}
		user_input.close();
	}

	public static void main(String[] args)
	{

		User game = new User();

		game.mainMenu();

		System.out.println("\nPerhaps we should start from the begining...\n");
	}
}