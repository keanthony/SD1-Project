package ROOM;
import java.util.Scanner;
import INVENTORY.Item;
import MAIN.DWD;
import NPC.NPC;

/**Class: Room.java
 * @author: Adrianna Valdivia
 * @Collaborators:Samuel Medina, Kevin Anthony
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Oct 30, 2015
 * Class Description: Room class
 * Purpose: Generate and handle room and room's items
 */
public class Room
{

	protected int roomID;
	protected String rDescription;
	protected Riddle rRiddle;
	//riddle boolean if room is between 1 thru whatever before the devil's house's rooms
	protected NPC crackHeads;
	protected Item item;
	protected boolean npcPresent;
	protected boolean itemPresent;

	/**
	 * @param rName
	 * @param rDescription
	 * @param npcPresent
	 * @param rExit
	 * @param rRiddle
	 * @param crackHeads
	 */
	public Room()
	{
		roomID = 0;
		rDescription = "";
		npcPresent = false;
		rRiddle = null;
		crackHeads = null;
		item = null;
	}

	/**Constructor: Room.java
	 * Initializes object with following params.
	 * @param roomID
	 * @param rDescription
	 * @param rRiddle
	 * @param crackHeads
	 * @param item
	 */
	public Room(int roomID, String rDescription, Riddle rRiddle, NPC crackHeads,
			Item item)
	{
		roomID = 0;
		rDescription = "";
		rRiddle = null;
		crackHeads = null;
		item = null;
	}

	public String getrDescription()
	{
		return rDescription;
	}

	public boolean getNpcPresent()
	{
		return npcPresent;
	}

	public Riddle getrRiddle()
	{
		return rRiddle;
	}

	public NPC getCrackHeads()
	{
		return crackHeads;
	}

	/**Method Name: getItem
	 * @return the item
	 */
	public Item getItem()
	{
		return item;
	}

	/**Method Name: isItemPresent
	 * @return the itemPresent
	 */
	public boolean isItemPresent()
	{
		return itemPresent;
	}

	public void enter()
	{
		Scanner user_input = new Scanner(System.in);
		String move = "move";
		if (!(user_input.next() == move))
		{
			System.out.println("Room Information");
			System.out.println(getrDescription());
			// what else should i return?
		}
		else
		{
			System.out.println("Invalid");
		}
		user_input.close();
	}

	//Sam: This method checks if the item you are attempting to put in 
	//your inventory is present in the current room
	public boolean isPresent()
	{
		DWD d = new DWD();
		if (d.getRoomAL().get(d.getStatus().getRoomID()).itemPresent)
			return true;
		else
			return false;
	}

	// implement Inpect method? to return 
	//specific information of different objects: room, item, crackhead;
	
}