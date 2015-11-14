package NPC;

import PLAYER.Score;

/**Class: NPC.java
* @author: 
* @collaborator: Kevin Anthony, Samuel medina 
* @version: 1.0
* Course : ITEC 3860 Fall 2015 Dr. Johnson
* Date Written: Oct 30, 2015
* Class Description: NPC class
* Purpose: Set attributes for NPC's
*/
//Sam: I am going to create a variable for trade. if a player 
//wants to trade or "deal" with an NPC. We still don't have this.
public class NPC
{
	protected int money;
	protected int npcID;
	protected String name;
	protected String description;
	protected int health;
	protected int damage;
	protected boolean attack;

	/**Constructor: NPC.java
	 * Initializes object with following params.
	 * @param npcID
	 * @param name
	 * @param description
	 * @param health
	 * @param damage
	 * @param attack
	 */
	public NPC(int npcID, String name, String description, int health,
			int damage, boolean attack, int money)
	{
		money = 1000;
		npcID = 0;
		name = "";
		description = "";
		health = 150;
		damage = 20;
		attack = false;
	}
	public NPC()
	{
		money = 1000;
		npcID = 0;
		name = "";
		description = "";
		health = 150;
		damage = 20;
		attack = false;
	}


	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) 
	{
		this.health = health;
	}


	/**
	 * @param damage the damage to set
	 */
	public void setDamage(int damage) 
	{
		this.damage = damage;
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


	/**
	 * @return the damage
	 */
	public int getDamage()
	{
		return damage;
	}

	/**
	 * @return the health
	 */
	public int getHealth()
	{
		return health;
	}

	public void attack()
	{

		//this should bring down health points of the main player

	}

	public void die()
	{

	}
}