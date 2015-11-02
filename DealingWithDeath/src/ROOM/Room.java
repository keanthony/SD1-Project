package ROOM;

import NPC.NPC;

public class Room {

	private String name;
	private boolean isEmpty;
	private String description;
	private Riddle riddle;
	private NPC crack;
	
	public Room(String name, boolean isEmpty, String description, Riddle riddle, NPC crack) {
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

}
