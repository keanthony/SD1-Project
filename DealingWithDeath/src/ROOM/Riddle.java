package ROOM;

import MAIN.DealingWithDeath;
import NPC.NPC;
import PLAYER.Player;

public class Riddle
{
	private int riddleId;
	private String question;
	private boolean isCorrect;
	private String riddleDesc;
	private Room backToRoom;
	private int solution;

	/**Constructor: Riddle.java
	 * Initializes object with following params.
	 * @param riddleId
	 * @param question
	 * @param isCorrect
	 * @param riddleDesc
	 * @param backToRoom
	 * @param solution
	 */
	public Riddle(int riddleId, String question, boolean isCorrect,
			String riddleDesc, Room backToRoom, int solution)
	{
		this.riddleId = riddleId;
		this.question = question;
		this.isCorrect = false;
		this.riddleDesc = riddleDesc;
		this.backToRoom = backToRoom;
		this.solution = solution;
	}

	public int getSolution()
	{
		return solution;
		// if user selects option [1,2,3,4,5] ... isCorrect or fights the devil
	}

	public boolean isCorrect()
	{
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect)
	{
		isCorrect = true;
	}

	public String question(int answer)
	{
		String result = "";
		if (!isCorrect)
		{
			if (answer == getSolution())
			{
				setCorrect(isCorrect = true);
				result = "You answered the Riddle correctly and will be returned to your Room";
				reward(backToRoom);
			}
		}
		else
		{
			result = "Sorry, your answer was incorrect";
		}
		return result;
		// if in room [1] riddle is " question 1 "
		// else if in room [2] riddle is " questions 2"
		// etc so on
		// has to be at least 6 rooms, so 6 riddles
	}

	public void reward(Room lastRoom)
	{
		Player p = new Player();
		if (isCorrect)
		{
			p.goTo(lastRoom);
		}
	}
}