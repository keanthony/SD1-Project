package ROOM;


import ROOM.Room;
//=======
//>>>>>>> branch 'master' of https://github.com/keanthony/SD1-Project.git
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
	private int solution;
	private boolean isCorrect;
	private Room backToRoom;
	

	/**Constructor: Riddle.java
	 * Initializes object with following params.
	 * @param riddleId
	 * @param question
	 * @param solution
	 */
	// NO ARG CONSTRUCTOR NEED TO BE CREATED
	public Riddle(int riddleId, String question, int solution)
	{
		riddleId = 0;
		question = "";
		solution = 0;
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
