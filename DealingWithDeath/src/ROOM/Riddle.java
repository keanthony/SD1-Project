package ROOM;

import PLAYER.Player;

/**Class: Riddle.java
* @author: 
* @collaborator: Kevin Anthony 
* @version: 1.0
* Course : ITEC 3860 Fall 2015 Dr. Johnson
* Date Written: Oct 30, 2015
* Class Description: Riddle class
* Purpose: Set attributes for Riddles
*/
public class Riddle
{
	protected int riddleId;
	protected String question;
	protected int solution;
	protected boolean isCorrect;
	protected Room backToRoom;

	/**Constructor: Riddle.java
	 * Initializes object with following params.
	 */
	public Riddle()
	{
		riddleId = 0;
		question = "";
		solution = 0;
		isCorrect = false;
		backToRoom = null;
	}

	/**Constructor: Riddle.java
	 * Initializes object with following params.
	 * @param riddleId
	 * @param question
	 * @param solution
	 */
	public Riddle(int riddleId, String question, int solution)
	{
		this.riddleId = riddleId;
		this.question = question;
		this.solution = solution;
		isCorrect = false;
		backToRoom = null;
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

	/**Method Name: question
	 * Description: Checks to see if the Riddle was solved correctly
	 * @author Kevin Anthony
	 * @param answer
	 * @return
	 */
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
	}

	/**Method Name: reward
	 * Description: Return Player to their last Room if they solve the Riddle
	 * @author Kevin Anthony
	 * @param lastRoom
	 */
	public void reward(Room lastRoom)
	{
		Player p = new Player();
		if (isCorrect)
		{
			p.goTo(lastRoom);
		}
	}

	@Override
	public String toString()
	{
		return "Riddle [Riddle ID: " + riddleId + ", Riddle: " + question + "]";
	}

}