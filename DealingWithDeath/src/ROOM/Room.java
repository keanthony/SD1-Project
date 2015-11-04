package ROOM;

import java.util.Random;
import java.util.Vector;
import INVENTORY.Inventory;
import NPC.NPC;
/**Class: Room.java
 * @author: 
 * @Collaborators:Samuel Medina
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Oct 30, 2015
 * Class Description: Room class
 * Purpose: Generate and handle room and room's items
 */
public class Room {

	private String rName;
	private String rDescription;
	private boolean isREmpty;
	private boolean rRiddle;
	//riddle boolean if room is between 1 thru whatever before the devil's house's rooms
	private NPC crackHeads;
	private boolean Item;
	

	/**
	 * @param rName
	 * @param rDescription
	 * @param isREmpty
	 * @param rExit
	 * @param rRiddle
	 * @param crackHeads
	 */
	
	public Room()
	{
		this.rName = "";
		this.rDescription = "";
		this.isREmpty = false;
		this.rRiddle = false;
		this.crackHeads = crackHeads;
		this.Item = false;

	}

	
	public Room(String rName, String rDescription, boolean isREmpty, 
				boolean rRiddle, NPC crackHeads, boolean Item) 
	{
		this.rName = rName;
		this.rDescription = rDescription;
		this.isREmpty = isREmpty;
		this.rRiddle = rRiddle;
		this.crackHeads = crackHeads;
		this.Item = Item;
	}
	
	
	public String getrName() {
		return rName;
	}


	public void setrName(String rName) {
		this.rName = rName;
	}


	public String getrDescription() {
		return rDescription;
	}


	public void setrDescription(String rDescription) {
		this.rDescription = rDescription;
	}


	public boolean isREmpty() {
		return isREmpty;
	}


	public void setREmpty(boolean isREmpty) {
		this.isREmpty = isREmpty;
	}


	public boolean getrRiddle() {
		return rRiddle;
	}


	public void setrRiddle(boolean rRiddle) {
		this.rRiddle = rRiddle;
	}


	public NPC getCrackHeads() {
		return crackHeads;
	}


	public void setCrackHeads(NPC crackHeads) {
		this.crackHeads = crackHeads;
	}
	
	


	public NPC initCrack() {
		System.out.println("Initializing a Random amount of crackheads in Rooms...");
	    
	    //note a single Random object is reused here
	    Random randomGenerator = new Random();
	    for (int i = 1; i <= 1; ++i){
	      int crackHeads = randomGenerator.nextInt(10);
	      System.out.println("Generated : " + crackHeads + " crackheads.");
	    }
		return crackHeads;
	}
	public String enter() {
		return null;
	}
	//Sam: This method checks if the item you are attempting to put in 
	//your inventory is present in the current room
	
	public boolean isPresent()
	{
		return false;
		//TODO: create a method to check if an item is present in the room
		
	}

}
