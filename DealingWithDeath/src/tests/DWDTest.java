/**Class: DWDTest.java
 * @author: Kevin Anthony
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Nov 15, 2015
 * Class Description: jUnit test for DWD
 * Purpose: To make sure DWD is working as intended
 */
package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import INVENTORY.Item;
import MAIN.DWD;
import MAIN.GameLogicService;
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
		d.setRoomID(0);
		
	}

	/**
	 * Test method for {@link MAIN.DWD#getRoomID()}.
	 */
	@Test
	public final void testGetRoomID()
	{
		int currentRoomId = d.getRoomID();
		System.out.println("Room ID:" + currentRoomId);
		Assert.assertTrue(0 == currentRoomId);
	}

	/**
	 * Test method for {@link MAIN.DWD#getCurrentNPC()}.
	 */
	@Test
	public final void testgetCurrentNPC()
	{
		System.out.println(
				"The Current NPC is " + d.getCurrentNPC());

	}

	/**
	 * Test method for {@link MAIN.DWD#getCurrentItem()}.
	 */
	@Test
	public final void testgetCurrentItem()
	{
		System.out.println(
				"The Current Item is " + d.getCurrentItem());
	}

	/**
	 * Test method for {@link MAIN.DWD#getCurrentRiddle()}.
	 */
	@Test
	public final void testgetCurrentRiddle()
	{
		System.out.println(
				"The Current Riddle is " + d.getCurrentNPC());
	}

	/**
	 * Test method for {@link MAIN.DWD#makeNPC()}.
	 */
	@Test
	public final void testMakeNPC()
	{
		for (NPC n : DWD.getNpcAL())
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
		for (Riddle r : DWD.getRiddleAL())
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
		for (Item it : DWD.getItemAL())
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
		System.out.println("The devil:" + d.devil());
	}

	/**
	 * Test method for {@link MAIN.DWD#makeRoom()}.
	 */
	@Test
	public final void testMakeRoom()
	{
		for (Room r : DWD.getRoomAL())
		{
			System.out.println(r);
		}
	}

	/**
	 * Test method for {@link MAIN.DWD#displayUserStatus()}.
	 */
	@Test
	public final void testDisplayUserStatus()
	{
		d.displayUserStatus();
	}
	
	

}
