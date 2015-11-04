package ROOM;

import java.util.Random;
import java.util.Vector;

import NPC.NPC;

public class Room {

	private String rName;
	private String rDescription;
	private boolean isREmpty;
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
				Riddle rRiddle, NPC crackHeads) 
	{
		this.rName = rName;
		this.rDescription = rDescription;
		this.isREmpty = isREmpty;
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
		System.out.println("Initializing a Random amount of crackheads in Rooms...");
	    
	    //note a single Random object is reused here
	    Random randomGenerator = new Random();
	    for (int i = 1; i <= 10; ++i){
	      int crackHeads = randomGenerator.nextInt(10);
	      System.out.println("Generated : " + crackHeads + "crackheads.");
	    }
		return crackHeads;
	}
	public String enter() {
		return null;
	}

}
