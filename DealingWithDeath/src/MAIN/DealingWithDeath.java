package MAIN;
import java.util.ArrayList;
import java.util.Scanner;


import INVENTORY.Item;
import NPC.NPC;
import PLAYER.Player;
import ROOM.Riddle;
import ROOM.Room;
/**Class: Weapon.java
 * @author: Kevin Anthony
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Oct 30, 2015
 * Class Description: Main Class
 * Purpose: Creates the game, handles saving and loading, generates Rooms
 * Monsters, and Puzzles
 */


public class DealingWithDeath
{
	protected static ArrayList<Room> roomAL = new ArrayList<Room>();
	protected static ArrayList<NPC> npcAL = new ArrayList<NPC>();
	protected static ArrayList<Riddle> riddleAL = new ArrayList<Riddle>();
	protected static ArrayList<Item> itemAL = new ArrayList<Item>();
	protected ArrayList<String> roomDescriptionsAL = new ArrayList<String>();
	
	protected Player myPlayer;
	protected static DealingWithDeath status;
	private String options;
	private int health;
	private String name;
	private int damage;

	private int money;
	private String tutorial;
	private String listOfPlayers;

	/**Constructor: DealingWithDeath.java
	 * Initializes object with following params.
	 * @param roomAL
	 * @param npcAL
	 * @param riddleAL
	 */
	public DealingWithDeath(ArrayList<Room> roomAL, ArrayList<NPC> npcAL,
			ArrayList<Riddle> riddleAL, ArrayList<Item> itemAL)
	{
		DealingWithDeath.roomAL = roomAL;
		DealingWithDeath.npcAL = npcAL;
		DealingWithDeath.riddleAL = riddleAL;
		DealingWithDeath.itemAL = itemAL;
		status = this;
	}
	public static DealingWithDeath getStatus()
	{
		if(status == null)
		{
			status = new DealingWithDeath(roomAL, npcAL, riddleAL, itemAL);
		}
		return status;
	}
	public void makeNPC()
	{
		//TODO: Generate NPC descriptions/stats
	}
	public void makeRiddle()
	{
		//TODO: Generate Puzzle Data
	}
	public void makeItem()
	{
		//TODO: Generate Item Data
	}
	public void makeRoom()
	{
		//TODO: Generate rooms
	}
	public String newGame()
	{
		return null;
	}

	public void save()
	{

	}

	public String load()
	{
		return null;
	}

	//Adrianna
	public void enterUserName()
	{
		Scanner user_input = new Scanner( System.in );
		
		System.out.print("Who am i?.. ");
		
		String userName = user_input.next( );
		
		System.out.println("You are " + userName);
	}

	public void initPlayer(Player player)
	{

	}

	//Adrianna
	public void help()
	{
		Scanner user_input = new Scanner( System.in );
		String keyword = "help";
		if (!(user_input.next() == keyword))
		{
			System.out.println("List of Commands\n");
			System.out.println("Say -attack- to harm NPC");
			System.out.println("Say -move- to move foward to the next room");
			System.out.println("Say -inventory- to see a list items you are holding");
			System.out.println("Say -equip- to put a wearable item on");
			System.out.println("Say -drop- to release an item from yourself");
			System.out.println("Say -take- to add an item to your inventory");
			System.out.println("Say -deal- to begin a transaction with an NPC");
			System.out.println("Say -sell- to trade money for drugs with an NPC");
		}
		else
		{
			System.out.println("Invalid");
		}
			
	}
	
	

}