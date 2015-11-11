package MAIN;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import INVENTORY.*;
import NPC.NPC;
import PLAYER.Player;
import ROOM.*;

/**Class: DWD.java
 * @author: Kevin Anthony
 * @collaborator:
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Oct 30, 2015
 * Class Description: Main Class
 * Purpose: Creates the game, handles saving and loading, generates Rooms
 * Monsters, and Puzzles
 */

public class DWD
{
	protected ArrayList<Room> roomAL = new ArrayList<Room>();
	protected ArrayList<NPC> npcAL = new ArrayList<NPC>();
	protected ArrayList<Riddle> riddleAL = new ArrayList<Riddle>();
	protected ArrayList<Item> itemAL = new ArrayList<Item>();
	protected int roomID;
	protected Player myPlayer;
	protected static DWD status;
	protected boolean fight;
	protected Random r;
	private String options;
	private int health;
	private String name;
	private int damage;
	private int money;
	private String tutorial;
	private String listOfPlayers;

	/**Constructor: DWD.java
	 * Initializes object with following params.
	 * @param roomAL
	 * @param npcAL
	 * @param riddleAL
	 */
	public DWD(ArrayList<Room> roomAL, ArrayList<NPC> npcAL,
			ArrayList<Riddle> riddleAL, ArrayList<Item> itemAL)
	{
		myPlayer = new Player();
		health = 100;
		roomAL = null;
		npcAL = null;
		riddleAL = null;
		itemAL = null;
		status = this;
		roomID = -1;
		fight = false;
		r = new Random();
	}

	/**Constructor: DWD.java
	 * Initializes object with following params.
	 */
	public DWD(int damage)
	{
		damage = 20;
	}
	
	public DWD()
	{
		myPlayer = new Player();
		roomAL = null;
		npcAL = null;
		riddleAL = null;
		itemAL = null;
		status = this;
		roomID = -1;
		fight = false;
		r = new Random();
	}

	
	
	/**
	 * @return the health
	 */
	public int getHealth() 
	{
		return health;
	}

	/**
	 * @return the myPlayer
	 */
	public Player getMyPlayer() 
	{
		return myPlayer;
	}

	/**
	 * @return the itemAL
	 */
	public ArrayList<Item> getItemAL() 
	{
		return itemAL;
	}

	/**Method Name: getRoomAL
	 * @return the roomAL
	 */
	public ArrayList<Room> getRoomAL()
	{
		return roomAL;
	}

	/**Method Name: getRoomID
	 * @return the roomID
	 */
	public int getRoomID()
	{
		return roomID;
	}

	public DWD getStatus()
	{
		if (status == null)
		{
			status = new DWD(roomAL, npcAL, riddleAL, itemAL);
		}
		return status;
	}

	/**Method Name: makeNPC
	 *  @author: Kevin Anthony
	 * Description: Generates all of the NPC objects.  The Devil is a special 
	 * NPC that only appears in rooms 24-29
	 */
	public void makeNPC()
	{
		System.out.println("Populating the rooms with crackheads...");
		NPC npc0 = new NPC(0, "The Devil",
				"18ft tall, 4 wings, enormous in size, power and strength", 200,
				10, true);
		NPC npc1 = new NPC(1, "The Devil",
				"18ft tall, 4 wings, enormous in size, power and strength", 200,
				10, r.nextBoolean());
		NPC npc2 = new NPC(2, "The Devil",
				"18ft tall, 4 wings, enormous in size, power and strength", 200,
				10, r.nextBoolean());
		NPC npc3 = new NPC(3, "The Devil",
				"18ft tall, 4 wings, enormous in size, power and strength", 200,
				10, r.nextBoolean());
		NPC npc4 = new NPC(4, "The Devil",
				"18ft tall, 4 wings, enormous in size, power and strength", 200,
				10, r.nextBoolean());
		NPC npc5 = new NPC(5, "The Devil",
				"18ft tall, 4 wings, enormous in size, power and strength", 200,
				10, r.nextBoolean());
		NPC npc6 = new NPC(6, "The Devil",
				"18ft tall, 4 wings, enormous in size, power and strength", 200,
				10, r.nextBoolean());
		NPC npc7 = new NPC(7, "The Devil",
				"18ft tall, 4 wings, enormous in size, power and strength", 200,
				10, r.nextBoolean());
		//TODO: Generate NPC descriptions/stats
		NPC[] npcArray =
		{ npc0, npc1, npc2, npc3, npc4, npc5, npc6, npc7 };

		//note a single Random object is reused here
		for (int i = 0; i < 30; i++)
		{
			if (r.nextInt(10) < 8)
				npcAL.add(npcArray[r.nextInt(8)]);
			else
				npcAL.add(null);
		}
	}

	/**Method Name: makeRiddle
	 *  @author: Kevin Anthony
	 * Description: Generates all of the Riddle objects.  The Riddles only 
	 * appear in rooms 24-29
	 */
	public void makeRiddle()
	{
		System.out.println("Populating the rooms with riddles...");
		riddleAL.add(new Riddle(0,
				"What has a foot, but no legs?\n1. A Roach\n2. A Turtle\n3. A Snail\n4. A Human",
				3));
		riddleAL.add(new Riddle(1,
				"What do you call a deer with no eyes?\n 1. A Roach\n2. A Turtle\n3. A Snail\n4. I have no eye-deer",
				4));
		riddleAL.add(new Riddle(2,
				"What has a foot, but no legs?\n 1. A Roach\n2. A Turtle\n3. A Snail\n4. A Human",
				3));
		riddleAL.add(new Riddle(3,
				"What has a foot, but no legs?\n 1. A Roach\n2. A Turtle\n3. A Snail\n4. A Human",
				3));
		riddleAL.add(new Riddle(4,
				"What has a foot, but no legs?\n 1. A Roach\n2. A Turtle\n3. A Snail\n4. A Human",
				3));
		riddleAL.add(new Riddle(5,
				"What has a foot, but no legs?\n 1. A Roach\n2. A Turtle\n3. A Snail\n4. A Human",
				3));
		riddleAL.add(new Riddle(6,
				"What has a foot, but no legs?\n 1. A Roach\n2. A Turtle\n3. A Snail\n4. A Human",
				3));
		//TODO: Generate Riddle Data
	}

	/**Method Name: makeItem
	 *  @author: Kevin Anthony
	 * Description: Generates all of the Item objects.  There are 3 types of 
	 * Items: Armor, Weapon, and Crack.  They all extend Item.  Armor boosts
	 * Health, Weapons boost Damage, Crack has a value and can be sold to NPC's
	 */
	public void makeItem()
	{
		itemAL.add(new Armor(0, "Breastplate of Lost Dreams",
				"The breastplate is made from one large piece of metal, which "
						+ "sits perfectly just under the shoulderplates. It covers "
						+ "everything from the neck down and ending at the groin, but "
						+ "the shoulder area is fairly exposed to allow for more "
						+ "movement space.",
				10));
		itemAL.add(new Armor(1, "Breastplate of Lost Dreams",
				"The breastplate is made from one large piece of metal, which ",
				10));
		itemAL.add(new Armor(2, "Breastplate of Lost Dreams",
				"The breastplate is made from one large piece of metal, which ",
				10));
		itemAL.add(new Armor(3, "Breastplate of Lost Dreams",
				"The breastplate is made from one large piece of metal, which ",
				10));
		itemAL.add(new Armor(4, "Breastplate of Lost Dreams",
				"The breastplate is made from one large piece of metal, which ",
				10));
		itemAL.add(new Weapon(5, "Breastplate of Lost Dreams",
				"The breastplate is made from one large piece of metal, which ",
				10));
		itemAL.add(new Weapon(6, "Breastplate of Lost Dreams",
				"The breastplate is made from one large piece of metal, which ",
				10));
		itemAL.add(new Weapon(7, "Breastplate of Lost Dreams",
				"The breastplate is made from one large piece of metal, which ",
				10));
		itemAL.add(new Weapon(8, "Breastplate of Lost Dreams",
				"The breastplate is made from one large piece of metal, which ",
				10));
		itemAL.add(new Weapon(9, "Breastplate of Lost Dreams",
				"The breastplate is made from one large piece of metal, which ",
				10));
		itemAL.add(new Crack(10, "Breastplate of Lost Dreams",
				"The breastplate is made from one large piece of metal, which ",
				10));
		itemAL.add(new Crack(11, "Breastplate of Lost Dreams",
				"The breastplate is made from one large piece of metal, which ",
				10));
		itemAL.add(new Crack(12, "Breastplate of Lost Dreams",
				"The breastplate is made from one large piece of metal, which ",
				10));
		itemAL.add(new Crack(13, "Breastplate of Lost Dreams",
				"The breastplate is made from one large piece of metal, which ",
				10));
		itemAL.add(new Crack(14, "Breastplate of Lost Dreams",
				"The breastplate is made from one large piece of metal, which ",
				10));
		//TODO: Generate Item Data
	}

	public NPC devil()
	{
		NPC n = null;
		if (r.nextBoolean())
		{
			n = npcAL.get(0);
		}
		return n;
	}

	/**Method Name: makeRoom
	 * Description: Rooms 0-23 do not get a Riddle or the Devil NPC.  Rooms 24-
	 * 29 get a random Riddle and a random chance of the Devil.
	 */
	public void makeRoom()
	{
		roomAL.add(new Room(0,
			"A furious rumble resounds in the area as stones come "
					+ "clattering through the doorway, along with a thick cloud of "
					+ "rock dust. The room beyond is filled with rubble.",
			null, npcAL.get(r.nextInt(7) + 1),
			itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(1,
				"A furious rumble resounds in the area as stones come ",
				null, npcAL.get(r.nextInt(7) + 1),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(2,
				"A furious rumble resounds in the area as stones come ",
				null, npcAL.get(r.nextInt(7) + 1),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(3,
				"A furious rumble resounds in the area as stones come ",
				null, npcAL.get(r.nextInt(7) + 1),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(4,
				"A furious rumble resounds in the area as stones come ",
				null, npcAL.get(r.nextInt(7) + 1),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(5,
				"A furious rumble resounds in the area as stones come ",
				null, npcAL.get(r.nextInt(7) + 1),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(6,
				"A furious rumble resounds in the area as stones come ",
				null, npcAL.get(r.nextInt(7) + 1),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(7,
				"A furious rumble resounds in the area as stones come ",
				null, npcAL.get(r.nextInt(7) + 1),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(8,
				"A furious rumble resounds in the area as stones come ",
				null, npcAL.get(r.nextInt(7) + 1),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(9,
				"A furious rumble resounds in the area as stones come ",
				null, npcAL.get(r.nextInt(7) + 1),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(10,
				"A furious rumble resounds in the area as stones come ",
				null, npcAL.get(r.nextInt(7) + 1),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(11,
				"A furious rumble resounds in the area as stones come ",
				null, npcAL.get(r.nextInt(7) + 1),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(12,
				"A furious rumble resounds in the area as stones come ",
				null, npcAL.get(r.nextInt(7) + 1),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(13,
				"A furious rumble resounds in the area as stones come ",
				null, npcAL.get(r.nextInt(7) + 1),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(14,
				"A furious rumble resounds in the area as stones come ",
				null, npcAL.get(r.nextInt(7) + 1),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(15,
				"A furious rumble resounds in the area as stones come ",
				null, npcAL.get(r.nextInt(7) + 1),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(16,
				"A furious rumble resounds in the area as stones come ",
				null, npcAL.get(r.nextInt(7) + 1),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(17,
				"A furious rumble resounds in the area as stones come ",
				null, npcAL.get(r.nextInt(7) + 1),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(18,
				"A furious rumble resounds in the area as stones come ",
				null, npcAL.get(r.nextInt(7) + 1),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(19,
				"A furious rumble resounds in the area as stones come ",
				null, npcAL.get(r.nextInt(7) + 1),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(20,
				"A furious rumble resounds in the area as stones come ",
				null, npcAL.get(r.nextInt(7) + 1),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(21,
				"A furious rumble resounds in the area as stones come ",
				null, npcAL.get(r.nextInt(7) + 1),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(22,
				"A furious rumble resounds in the area as stones come ",
				null, npcAL.get(r.nextInt(7) + 1),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(23,
				"A furious rumble resounds in the area as stones come ",
				null, npcAL.get(r.nextInt(7) + 1),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(24,
				"A furious rumble resounds in the area as stones come "
						+ "clattering through the doorway, along with a thick cloud of "
						+ "rock dust. The room beyond is filled with rubble.",
				riddleAL.get(r.nextInt(7)), devil(),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(24,
				"A furious rumble resounds in the area as stones come "
						+ "clattering through the doorway, along with a thick cloud of "
						+ "rock dust. The room beyond is filled with rubble.",
				riddleAL.get(r.nextInt(7)), devil(),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(25,
				"A furious rumble resounds in the area as stones come "
						+ "clattering through the doorway, along with a thick cloud of "
						+ "rock dust. The room beyond is filled with rubble.",
				riddleAL.get(r.nextInt(7)), devil(),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(26,
				"A furious rumble resounds in the area as stones come "
						+ "clattering through the doorway, along with a thick cloud of "
						+ "rock dust. The room beyond is filled with rubble.",
				riddleAL.get(r.nextInt(7)), devil(),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(27,
				"A furious rumble resounds in the area as stones come "
						+ "clattering through the doorway, along with a thick cloud of "
						+ "rock dust. The room beyond is filled with rubble.",
				riddleAL.get(r.nextInt(7)), devil(),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(28,
				"A furious rumble resounds in the area as stones come "
						+ "clattering through the doorway, along with a thick cloud of "
						+ "rock dust. The room beyond is filled with rubble.",
				riddleAL.get(r.nextInt(7)), devil(),
				itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(29,
				"A furious rumble resounds in the area as stones come "
						+ "clattering through the doorway, along with a thick cloud of "
						+ "rock dust. The room beyond is filled with rubble.",
				riddleAL.get(r.nextInt(7)), devil(),
				itemAL.get(r.nextInt(15))));
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
		Scanner user_input = new Scanner(System.in);
		System.out.print("Who am i?.. ");
		String userName = user_input.next();
		System.out.println("You are " + userName);
		user_input.close();
	}

	public void initPlayer(Player player)
	{

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

	public void getUserInput()
	{
		int room = getStatus().roomID;
		//int moveRoom = room + 1;
		System.out.println("You are in room " + room);
		System.out.println("The room is " + roomAL.get(room).getrDescription());
		if (roomAL.get(room).getNpcPresent())
		{
			NPC npc = roomAL.get(room).getCrackHeads();
			System.out.println(roomAL.get(room).getCrackHeads());
		}
	}

	public static void main(String[] args)
	{
		status.enterUserName();
	}

}