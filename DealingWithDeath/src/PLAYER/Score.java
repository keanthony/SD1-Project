package PLAYER;

import java.io.Serializable;

/**Class: Score.java
 * @author: Samuel Medina
 * @collaborator: 
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Oct 30, 2015
 * Class Description: Score class
 * Purpose: Generate and handle Score interactions
 */

public class Score implements Serializable
{

	private int money;

	public Score()
	{
		money = 0;
	}

	/**
	 * @return the money
	 */
	public int getMoney()
	{
		return money;
	}

	/**
	 * @param money the money to set
	 */
	public void setMoney(int money)
	{
		this.money = money;
	}

	public void makeMoney()
	{

	}

	public void loseMoney()
	{

	}

	public void saveMoney()
	{

	}
}
