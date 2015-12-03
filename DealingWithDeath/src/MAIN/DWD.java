package MAIN;

import INVENTORY.Armor;
import INVENTORY.Crack;
import INVENTORY.Item;
import INVENTORY.Weapon;
import NPC.NPC;
import PLAYER.Player;
import ROOM.Riddle;
import ROOM.Room;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

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

public class DWD implements Serializable
{
	private static ArrayList<Room> roomAL = new ArrayList<Room>();
	public static final ArrayList<Room> roomHistoryAl = new ArrayList<Room>();
	private static ArrayList<NPC> npcAL;
	private static ArrayList<Riddle> riddleAL;
	private static ArrayList<Item> itemAL;
	private int roomID;
	private final Random r;
	private Player player;

	/**Constructor: DWD.java
	 */
	public DWD()
	{
		roomID = 0;
		r = new Random();

	}

	public DWD(Player currentPlayer)
	{
		roomID = 0;
		r = new Random();
		this.player = currentPlayer;
	}

	/**Method Name: getPlayer
	 * @return the player
	 */
	public Player getPlayer()
	{
		return player;
	}

	/**Method Name: getRoomAL
	 * @return the roomAL
	 */
	public static ArrayList<Room> getRoomAL()
	{
		return roomAL;
	}

	/**Method Name: getNpcAL
	 * @return the npcAL
	 */
	public static ArrayList<NPC> getNpcAL()
	{
		return npcAL;
	}

	/**Method Name: getRiddleAL
	 * @return the riddleAL
	 */
	public static ArrayList<Riddle> getRiddleAL()
	{
		return riddleAL;
	}

	/**Method Name: getItemAL
	 * @return the itemAL
	 */
	public static ArrayList<Item> getItemAL()
	{
		return itemAL;
	}

	/**Method Name: getRoomID
	 * @return the roomID
	 */
	public int getRoomID()
	{
		return roomID;
	}

	/**Method Name: setRoomID
	 * @param roomID the roomID to set
	 */
	public void setRoomID(int roomID)
	{
		if (getRoomAL().size() > 0)
		{
			int oldRoomID = this.roomID;
			Room oldRoom = getRoomAL().get(oldRoomID);
			roomHistoryAl.add(oldRoom);
		}

		if (roomID > 29 || roomID < 0)
		{
			System.out.println("RoomID out of bounds.  Resetting to 0");
			this.roomID = 0;
		}
		else
		{
			this.roomID = roomID;
		}

	}

	/**Method Name: getCurrentItem
	 * Description: Get the Item from the current room
	 * @return Item
	 */
	public Item getCurrentItem()
	{
		Room room = roomAL.get(this.roomID);
		return room.getItem();
	}

	/**Method Name: getCurrentNPC
	 * Description: Get the NPC from the current room
	 * @return NPC
	 */
	public NPC getCurrentNPC()
	{
		return roomAL.get(this.roomID).getCrackHeads();
	}

	/**Method Name: getCurrentRiddle
	 * Description: Get the Riddle from the current room
	 * @return Riddle
	 */
	public Riddle getCurrentRiddle()
	{
		if (this.roomID > 23 && this.roomID < 30)
			return getRoomAL().get(this.roomID).getrRiddle();
		else
		{
			System.out.println("Riddles do not exist for this RoomID.  "
					+ "Defaulting to Room 24.");
			return roomAL.get(24).getrRiddle();
		}
	}

	private void makePlayer(String name)
	{
		player = new Player(name);
	}

	/**Method Name: makeNPC
	 *  @author: Kevin Anthony
	 * Description: Generates all of the NPC objects.  The Devil is a special
	 * NPC that only appears in rooms 24-29
	 */
	public void makeNPC()
	{
		npcAL = new ArrayList<NPC>();
		System.out.println("Populating the rooms with crackheads...");
		NPC npc0 = new NPC(0, "The Devil",
				"18ft tall, 4 wings, enormous in size, power and strength", 200,
				30, true, 10000);
		NPC npc1 = new NPC(1, "Leon in the Sky with Diamonds",
				"Silly clown with rainbows coming out of his mouth. His "
						+ "laughter is freightening!",
				60, 10, r.nextBoolean(), 1000);
		NPC npc2 = new NPC(2, "Suzie Q",
				"Smooth talkin', smooth walkin' witch who uses her mysterious "
						+ "spells as power and strength.",
				50, 10, r.nextBoolean(), 2500);
		NPC npc3 = new NPC(3, "Freaky Freddie",
				"Freak on a leash. You must not let him off this leash!", 80,
				10, r.nextBoolean(), 1500);
		NPC npc4 = new NPC(4, "Furious Fiona",
				"Tall beast who is trying to make you eat her poisonous apples.",
				60, 10, r.nextBoolean(), 2000);
		NPC npc5 = new NPC(5, "Jake The Jester",
				"Running around, making jokes and distracting you from your mission!",
				100, 10, r.nextBoolean(), 6000);
		NPC npc6 = new NPC(6, "Buster Bunny",
				"The giant deranged bunny wearing a smiley face tshirt and "
						+ "bunny slippers is trying to turn you into a carrot and eat you!",
				90, 10, r.nextBoolean(), 8000);
		NPC npc7 = new NPC(7, "Cammie the Chemeleon",
				"Lizard girl who is blending in to her surroundings. Be "
						+ "careful....where did she go?",
				60, 10, r.nextBoolean(), 5000);

		NPC[] npcArray =
		{ npc0, npc1, npc2, npc3, npc4, npc5, npc6, npc7 };

		npcAL.add(npcArray[0]);

		for (int i = 1; i < 30; i++)
		{
			if (r.nextInt(10) < 8)
				npcAL.add(npcArray[r.nextInt(7)]);

		}
	}

	/**Method Name: makeRiddle
	 *  @author: Kevin Anthony
	 * Description: Generates all of the Riddle objects.  The Riddles only
	 * appear in rooms 24-29
	 */
	public void makeRiddle()
	{
		riddleAL = new ArrayList<Riddle>();
		System.out.println("Populating the rooms with riddles...");
		riddleAL.add(new Riddle(0,
				"What has a foot, but no legs?\n1. A Roach\n2. A Turtle\n"
						+ "3. A Snail\n4. A Human",
				3));
		riddleAL.add(
				new Riddle(1,
						"What do you call a deer with no eyes?\n1. A raindeer\n"
								+ "2. A deerblind \n3. A blind deer\n4. No idear!",
						4));
		riddleAL.add(new Riddle(2,
				"Why do programmers confuse Halloween and Christmas?\n"
						+ "1. Oct 31 = Dec 25\n2. Oct 31 == Dec 25\n"
						+ "3. Oct 31 === Dec 25\n4. All of the above",
				4));
		riddleAL.add(new Riddle(3,
				"A programmer's wife asks him to run to the store and pick up a"
						+ " loaf of bread. And if they have eggs, get a dozen."
						+ "The store does have eggs. What does he return with?\n"
						+ "1. 12 loaves of bread\n2. A loaf of bread and a dozen eggs\n"
						+ "3. A dozen eggs\n4. Nothing",
				1));
		riddleAL.add(new Riddle(4,
				"What the object-oriented way to become wealthy?\n"
						+ "1. Become a serializable bank robber \n2. Inheritance\n"
						+ "3. Make your bank account protected\n"
						+ "4. Try to cast all your data to Money type",
				2));
		riddleAL.add(new Riddle(5,
				"How do programmers express joy when they succesfully write a "
						+ "program?\n1. Jump up out of their chair and shout horray!\n"
						+ "2. Smile slightly\n3. [hip, hip]\n4. They brag to all their "
						+ "friends on the internet.",
				3));
		riddleAL.add(new Riddle(6,
				"Imagine you're in a dark room that is perfectly empty with "
						+ "nothing in it. There are no windows or doors. What is the "
						+ "easiest way to escape?"
						+ "\n1. Stop imagining you are in that room\n2. Die\n"
						+ "3. A Wait\n4. Dig a hole through the floor with your "
						+ "bare hands",
				1));
	}

	/**Method Name: makeItem
	 *  @author: Kevin Anthony
	 * Description: Generates all of the Item objects.  There are 3 types of
	 * Items: Armor, Weapon, and Crack.  They all extend Item.  Armor boosts
	 * Health, Weapons boost Damage, Crack has a value and can be sold to NPC's
	 */
	public void makeItem()
	{
		itemAL = new ArrayList<Item>();
		System.out.println("Populating the rooms with items...");
		itemAL.add(new Armor(0, "Breastplate of Lost Dreams",
				"The breastplate is made from one large piece of metal, which "
						+ "sits perfectly just under the shoulderplates. It covers "
						+ "everything from the neck down and ending at the groin, but "
						+ "the shoulder area is fairly exposed to allow for more "
						+ "movement space.",
				10));
		itemAL.add(new Armor(1, "Anti Spell Cloak",
				"Protects you from Suzie Q's mysterious spells. ", 10));
		itemAL.add(new Armor(2, "Earplugs",
				"Protects you from Leon's freightening laughter. ", 10));
		itemAL.add(new Armor(3, "Poison Elixer",
				"Counteracts Furious Fiona's poisonous apples. ", 10));
		itemAL.add(new Armor(4, "Breastplate of Lost Dreams",
				"The breastplate is made from one large piece of metal, which ",
				10));
		itemAL.add(new Weapon(5, "A Satchel of Carrots",
				"To feed Buster the Bunny when he gets hungry so he won't \n"
						+ "turn you into a carrot and eat you!",
				10));
		itemAL.add(new Weapon(6, "A Book of Sad Jokes",
				"To use against Jake the Jester to make him sad and stop\n"
						+ " telling jokes and distracting you from you mission.",
				10));
		itemAL.add(new Weapon(7, "Shock Collar",
				"To put on Freaky Freddie so he has to stay at least 10 feet away from you.",
				10));
		itemAL.add(new Weapon(8, "Glow in the Dark Paint",
				"To throw in Cammie the Chameleon so he camo doesn't work in the light or dark. ",
				10));
		itemAL.add(new Weapon(9, "Collector Gun",
				"Collects all of the enemy's powers and shoots them back at the enemy.",
				30));
		itemAL.add(new Crack(10, "The Heisenberg Crack",
				"The purest and most expensive crack on the market!", 2000));
		itemAL.add(new Crack(11, "Brick", "A kilogram of crack", 1500));
		itemAL.add(new Crack(12, "A Dimebag", "$10 worth of crack", 10));
		itemAL.add(new Crack(12, "A Dimebag", "$10 worth of crack", 10));
		itemAL.add(new Crack(13, "8 Ball", "Small bag of crack", 300));
		itemAL.add(
				new Crack(14, "Half a Football Field", "50 crack rocks", 1000));
	}

	/**Method Name: devil
	 * Description: Random chance for the devil to appear in the Hell rooms
	 * @author: Kevin Anthony
	 * @return n
	 */
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
		roomAL = new ArrayList<Room>();
		
		
		//System.out.println("Populating the rooms...");
		
		
		roomAL.add(new Room(0,"This is your home. There are 5 rooms here. "
				+ "\nThe rooms are numbered 1, 2, 3, 4 and 5, What would you like to do?",  null, npcAL.get(r.nextInt(7) + 1), itemAL.get(r.nextInt(15))));
		
		
		roomAL.add(new Room(1,
				"This is the kitchen of the house ", null,
				npcAL.get(r.nextInt(7) + 1), itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(2,
				"this is your room ", null,
				npcAL.get(r.nextInt(7) + 1), itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(3,
				"Now you are in the living room, What? can't you tell? ", null,
				npcAL.get(r.nextInt(7) + 1), itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(4,
				"Finally, this is your, grandmom's room. ", null,
				npcAL.get(r.nextInt(7) + 1), itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(5,
				"A furious rumble resounds in the area as stones come ", null,
				npcAL.get(r.nextInt(7) + 1), itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(6,
				"A furious rumble resounds in the area as stones come ", null,
				npcAL.get(r.nextInt(7) + 1), itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(7,
				"A furious rumble resounds in the area as stones come ", null,
				npcAL.get(r.nextInt(7) + 1), itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(8,
				"A furious rumble resounds in the area as stones come ", null,
				npcAL.get(r.nextInt(7) + 1), itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(9,
				"A furious rumble resounds in the area as stones come ", null,
				npcAL.get(r.nextInt(7) + 1), itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(10,
				"A furious rumble resounds in the area as stones come ", null,
				npcAL.get(r.nextInt(7) + 1), itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(11,
				"A furious rumble resounds in the area as stones come ", null,
				npcAL.get(r.nextInt(7) + 1), itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(12,
				"A furious rumble resounds in the area as stones come ", null,
				npcAL.get(r.nextInt(7) + 1), itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(13,
				"A furious rumble resounds in the area as stones come ", null,
				npcAL.get(r.nextInt(7) + 1), itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(14,
				"A furious rumble resounds in the area as stones come ", null,
				npcAL.get(r.nextInt(7) + 1), itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(15,
				"A furious rumble resounds in the area as stones come ", null,
				npcAL.get(r.nextInt(7) + 1), itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(16,
				"A furious rumble resounds in the area as stones come ", null,
				npcAL.get(r.nextInt(7) + 1), itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(17,
				"A furious rumble resounds in the area as stones come ", null,
				npcAL.get(r.nextInt(7) + 1), itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(18,
				"A furious rumble resounds in the area as stones come ", null,
				npcAL.get(r.nextInt(7) + 1), itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(19,
				"A furious rumble resounds in the area as stones come ", null,
				npcAL.get(r.nextInt(7) + 1), itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(20,
				"A furious rumble resounds in the area as stones come ", null,
				npcAL.get(r.nextInt(7) + 1), itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(21,
				"A furious rumble resounds in the area as stones come ", null,
				npcAL.get(r.nextInt(7) + 1), itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(22,
				"A furious rumble resounds in the area as stones come ", null,
				npcAL.get(r.nextInt(7) + 1), itemAL.get(r.nextInt(15))));
		roomAL.add(new Room(23,
				"A furious rumble resounds in the area as stones come ", null,
				npcAL.get(r.nextInt(7) + 1), itemAL.get(r.nextInt(15))));
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

	/**Method Name: getUserInput
	 * Description: To give the user a status update when they enter a room
	 * @author: Kevin Anthony
	 */
	public void displayUserStatus()
	{
		System.out.println("You are in room " + this.roomID);
		System.out.println(roomAL.get(this.roomID).getrDescription());
		if (getCurrentNPC() == null)
		{
			System.out.println("\nThere is no monster in the room");
		}

		System.out.println(
				"The item in this room is " + getCurrentItem().getName() + " "
						+ getCurrentItem().getDescription());
		if (getCurrentRiddle() != null)
		{
			System.out.println("There is a Riddle in the room");
			System.out.println(getCurrentRiddle().getQuestion());
		}
		else
			System.out.println("There is no Riddle in the room");
	}

	/**
	 * Method Name: displayEntryRoomInfo
	 * Description: To give the user a status update when they enter a room
	 *
	 * @author: Kevin Anthony
	 */
	public void displayEntryRoomInfo()
	{
		System.out.println("\nRoom info");
		System.out.println("You are in room " + this.roomID);
		System.out.println(roomAL.get(this.roomID).getrDescription() + "\n");
	}

	/** Method Name: toString
	 * Description: Override
	 * @return String representation of object
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "DWD [roomID=" + roomID + ", r=" + r;
	}

	public void Initialize(String name)
	{
		makeNPC();
		makeItem();
		makeRiddle();
		makeRoom();
		setRoomID(0);
		makePlayer(name);
	}

	public boolean isCurrentRoomADevilRoom()
	{
		return this.roomID >= 24 && this.roomID <= 29;
	}
}
