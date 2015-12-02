/**Class: RiddleTest.java
 * @author: Kevin Anthony
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Nov 15, 2015
 * Class Description: jUnit Test for Riddle
 * Purpose: To make sure Riddle is working as intended
 */
package tests;

import MAIN.DWD;
import ROOM.Riddle;
import org.junit.Before;
import org.junit.Test;

public class RiddleTestKevin
{
	protected DWD d = new DWD();
	protected Riddle r = new Riddle();
	/**Method Name: setUp
	 * Description: TODO
	 * @throws java.lang.Exception
	 */

	@Before
	public void setUp() throws Exception
	{
		d.makeNPC();
		d.makeRiddle();
		d.makeItem();
		d.makeRoom();
		d.setRoomID(24);
		r.setCorrect(true);
		r.setBackToRoom(5);
	}

		/**
	 * Test method for {@link ROOM.Riddle#checkAnswer(int)}.
	 */
	@Test
	public final void testCheckAnswer()
	{
		System.out.println(d.getCurrentRiddle().getQuestion());
		System.out.println("The solution is " + d.getCurrentRiddle().getSolution());
		System.out.println(r.checkAnswer(1,24));
		System.out.println(r.checkAnswer(2,24));
		System.out.println(r.checkAnswer(5,40));
	}
}
