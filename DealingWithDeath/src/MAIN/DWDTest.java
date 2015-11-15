/**Class: DWDTest.java
 * @author: Kevin Anthony
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Nov 15, 2015
 * Class Description: jUnit test for DWD
 * Purpose: To make sure DWD is working as intended
 */
package MAIN;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import INVENTORY.Item;
import NPC.NPC;
import ROOM.Riddle;
import ROOM.Room;

public class DWDTest
{
	protected DWD d = new DWD();
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
		d.roomID = 1;
	}

	/**
	 * Test method for {@link MAIN.DWD#getRoomID()}.
	 */
	@Test
	public final void testGetRoomID()
	{
		System.out.println("Room ID:" + d.roomID);
	}

	/**
	 * Test method for {@link MAIN.DWD#makeNPC()}.
	 */
	@Test
	public final void testMakeNPC()
	{
		for (NPC n : DWD.npcAL)
		{
			System.out.println(n);
		}
	}

	/**
	 * Test method for {@link MAIN.DWD#makeRiddle()}.
	 */
	@Test
	public final void testMakeRiddle()
	{
		for (Riddle r : DWD.riddleAL)
		{
			System.out.println(r);
		}
	}

	/**
	 * Test method for {@link MAIN.DWD#makeItem()}.
	 */
	@Test
	public final void testMakeItem()
	{
		for (Item it : DWD.itemAL)
		{
			System.out.println(it);
		}
	}

	/**
	 * Test method for {@link MAIN.DWD#devil()}.
	 */
	@Test
	public final void testDevil()
	{
		System.out.println("The devil:" + d.devil());
	}

	/**
	 * Test method for {@link MAIN.DWD#makeRoom()}.
	 */
	@Test
	public final void testMakeRoom()
	{
		for (Room r : DWD.roomAL)
		{
			System.out.println(r);
		}
	}

	/**
	 * Test method for {@link MAIN.DWD#getUserInput()}.
	 */
	@Test
	public final void testGetUserInput()
	{
		d.getUserInput();
	}

}
