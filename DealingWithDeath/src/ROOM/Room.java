package ROOM;

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

	private String name;
	private boolean isEmpty;
	private String description;
	private Riddle riddle;
	private NPC crack;
	
	public Room(String name, boolean isEmpty, String description, Riddle riddle, NPC crack) 
	{
		super();
		this.name = name;
		this.isEmpty = isEmpty;
		this.description = description;
		this.riddle = riddle;
		this.crack = crack;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Riddle getRiddle() {
		return riddle;
	}

	public void setRiddle(Riddle riddle) {
		this.riddle = riddle;
	}

	public NPC getCrack() {
		return crack;
	}

	public void setCrack(NPC crack) {
		this.crack = crack;
	}

	public NPC initCrack() {
		return null;
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
