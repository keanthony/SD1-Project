package ROOM;

import MAIN.DWD;

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
	private int backToRoom;
	protected DWD d;

	/**Constructor: Riddle.java
	 * Initializes object with following params.
	 */
	public Riddle()
	{
		riddleId = 0;
		question = "";
		solution = 0;
		isCorrect = false;
		setBackToRoom(0);
		d = new DWD();
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
		setBackToRoom(0);
		d = new DWD();
	}

	/**Method Name: getQuestion
	 * @return the question
	 */
	public String getQuestion()
	{
		return question;
	}

	public int getSolution()
	{
		return solution;
		// if user selects option [1,2,3,4,5] ... isCorrect or fights the devil
	}

	/**Method Name: getBackToRoom
	 * @return the backToRoom
	 */
	public int getBackToRoom()
	{
		return backToRoom;
	}

	/**Method Name: setBackToRoom
	 * @param backToRoom the backToRoom to set
	 */
	public void setBackToRoom(int backToRoom)
	{
		this.backToRoom = backToRoom;
	}

	public boolean isCorrect()
	{
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect)
	{
		this.isCorrect = isCorrect;
	}

	/**Method Name: checkAnswer
	 * Description: Checks to see if the Riddle was solved correctly
	 * @author Kevin Anthony
	 * @param answer
	 * @return result
	 */
	public String checkAnswer(int answer, int roomID)
	{

		String result = "";
		if (answer == d.getCurrentRiddle().getSolution())
		{
			setCorrect(isCorrect = true);
			result = "You answered the Riddle correctly and will be returned to your Room";
			reward(getBackToRoom());
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
	public void reward(int lastRoom)
	{
		Room r = new Room();
		if (isCorrect)
		{
			r.enter(getBackToRoom());
		}
		System.out.println("You have been returned to Room " + getBackToRoom());
	}

	/** Method Name: toString
	 * Description: Override 
	 * @return String representation of object
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Riddle [riddleId=" + riddleId + ", question=" + question
				+ ", solution=" + solution + "]";
	}
}