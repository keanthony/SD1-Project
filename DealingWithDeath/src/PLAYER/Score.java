package PLAYER;




import java.util.ArrayList;

import ROOM.Room;

import java.io.Serializable;


/**Class: Score.java
 * @author: Samuel Medina
 * @collaborator: **
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Oct 30, 2015
 * Class Description: Score class
 * Purpose: Generate and handle Score interactions
 */


/**
 * @author Sam
 *
 */

public class Score implements Serializable

{
	private ArrayList<Integer> moneyAL = new ArrayList<Integer>();
	private int money;
	protected Room room;
	protected Player player;

	
	public Score()
	{
		money = 1000;
		room = new Room();
		player = new Player();

	}

	/**
	 * @param money the money to set
	 */
	public void setMoney(int money)
	{
		this.money = money;
	}

	/**
	 * @return
	 */
	public int Sale()
	{

		//if(room.getNpcPresent())
//		{
		
			int current = player.getMoney() + room.getCrackHeads().getMoney();
			System.out.println(player.getMoney());
	//	}
		return current;
	}
	/**
	 * @return
	 */

	public int loseMoney()
	{
	//	if(player.getHealth() < 1)
		//{
			money = player.getMoney() - player.getMoney();
		//}

		return money;
	}

	/**
	 * @return
	 */
	public int saveMoney()
	{
		if(player.getMoney() > 0)
		{
			money = player.getMoney();
			moneyAL.add(player.getMoney());

			System.out.println("Your money has been saved");
		}
		return money - money;

	}

}
