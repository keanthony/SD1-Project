<<<<<<< HEAD
package ROOM;

import NPC.NPC;

public class Riddle extends Room {

	private boolean isCorrect;
	
	/**
	 * @param rName
	 * @param rDescription
	 * @param isREmpty
	 * @param rRiddle
	 * @param crackHeads
	 * @param isCorrect
	 */
	public Riddle(String rName, String rDescription, boolean isREmpty, Riddle rRiddle, NPC crackHeads,
			boolean isCorrect) {
		super(rName, rDescription, isREmpty, rRiddle, crackHeads);
		this.isCorrect = isCorrect;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	public String question() {
		return null;
		// if in room [1] riddle is " question 1 "
		// else if in room [2] riddle is " questions 2"
		// etc so on
		// has to be at least 6 rooms, so 6 riddles
	}

	public String answer(int ans) {
		return null;
		// if user selects option [1,2,3,4,5] ... isCorrect or fights the devil
	}

	public Room reward(boolean isCorrect) {
		return null;
		
	}

}
=======
package ROOM;

import NPC.NPC;

public class Riddle extends Room {

	private boolean isCorrect;
	
	/**
	 * @param rName
	 * @param rDescription
	 * @param isREmpty
	 * @param rRiddle
	 * @param crackHeads
	 * @param isCorrect
	 */
	public Riddle(String rName, String rDescription, boolean isREmpty, Riddle rRiddle, NPC crackHeads,
			boolean isCorrect) 
	{
		super();
		this.isCorrect = isCorrect;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	public String question() {
		return null;
		// if in room [1] riddle is " question 1 "
		// else if in room [2] riddle is " questions 2"
		// etc so on
		// has to be at least 6 rooms, so 6 riddles
	}

	public String answer(int ans) {
		return null;
		// if user selects option [1,2,3,4,5] ... isCorrect or fights the devil
	}

	public Room reward(boolean isCorrect) {
		return null;
		
	}

}
>>>>>>> branch 'master' of https://github.com/keanthony/SD1-Project.git
