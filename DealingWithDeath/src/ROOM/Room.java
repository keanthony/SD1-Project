package ROOM;

import java.util.Vector;

import NPC.NPC;

public class Room {

	private String rName;
	private String rDescription;
	private boolean isREmpty;
	private Vector<Exit> rExit;
	private Riddle rRiddle;
	private NPC crackHeads;
	
	/**
	 * @param rName
	 * @param rDescription
	 * @param isREmpty
	 * @param rExit
	 * @param rRiddle
	 * @param crackHeads
	 */
	public Room(String rName, String rDescription, boolean isREmpty, 
				Vector<Exit> rExit, Riddle rRiddle, NPC crackHeads) 
	{
		this.rName = rName;
		this.rDescription = rDescription;
		this.isREmpty = isREmpty;
		this.rExit = rExit;
		this.rRiddle = rRiddle;
		this.crackHeads = crackHeads;
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


	public Vector getrExit() {
		return rExit;
	}


	public void setrExit(Vector rExit) {
		this.rExit = rExit;
	}


	public Riddle getrRiddle() {
		return rRiddle;
	}


	public void setrRiddle(Riddle rRiddle) {
		this.rRiddle = rRiddle;
	}


	public NPC getCrackHeads() {
		return crackHeads;
	}


	public void setCrackHeads(NPC crackHeads) {
		this.crackHeads = crackHeads;
	}


	public NPC initCrack() {
		return null;
	}
	public String enter() {
		return null;
	}

}
