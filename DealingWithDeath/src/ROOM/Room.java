package ROOM;

import java.io.Serializable;
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
public class Room implements Serializable
{
	protected int roomID;
	protected String rDescription;
	protected Riddle rRiddle;
	//riddle boolean if room is between 1 thru whatever before the devil's house's rooms
	protected NPC crackHeads;
	protected Item item;
	protected boolean npcPresent;
	protected boolean itemPresent;
	protected DWD d = new DWD();

	public Room()
	{
		roomID = 0;
		rDescription = "";
		npcPresent = true;
		rRiddle = null;
		crackHeads = new NPC();
		item = null;
		npcPresent = true;
		itemPresent = false;
	}

	/**Constructor: Room.java
	 * Initializes object with following params.
	 * @param roomID
	 * @param rDescription
	 * @param rRiddle
	 * @param crackHeads
	 * @param item
	 * @param npcPresent
	 * @param itemPresent
	 */
	public Room(int roomID, String rDescription, Riddle rRiddle, NPC crackHeads,
			Item item)
	{
		this.roomID = roomID;
		this.rDescription = rDescription;
		this.rRiddle = rRiddle;
		this.crackHeads = crackHeads;
		this.item = item;
		npcPresent = false;
		itemPresent = false;
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
	
	public int getRoomId()
	{
		return this.roomID;
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

	/**Method Name: enter
	 @author Kevin Anthony
	 * Description: Moves the user to a different room by updating roomID
	 */
	public void enter(int roomID)
	{
		d.setRoomID(roomID);
	}

	//Sam: This method checks if the item you are attempting to put in 
	//your inventory is present in the current room
	public boolean isPresent(Item item)
	{
		if (DWD.getRoomAL().get(d.getRoomID()).getItem() == item)
		{
			return true;
		}
		else
		{
			return false;
		}

	}

	/** Method Name: toString
	 * Description: Override 
	 * @return String representation of object
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Room [roomID=" + roomID + ", rDescription=" + rDescription
				+ ", rRiddle=" + rRiddle + ", crackHeads=" + crackHeads
				+ ", item=" + item + "]";
	}

	// implement Inpect method? to return 
	//specific information of different objects: room, item, crackhead;
}
