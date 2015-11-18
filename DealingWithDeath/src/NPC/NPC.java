package NPC;

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
	protected int npcID;
	protected String name;
	protected String description;
	protected int health;
	protected int damage;
	protected boolean attack;
	protected int money;
	
	
	/**Constructor: NPC.java
	 * Initializes object with following params.
	 * @param npcID
	 * @param name
	 * @param description
	 * @param health
	 * @param damage
	 * @param attack
	 * @param money
	 */
	public NPC(int npcID, String name, String description, int health,
			int damage, boolean attack, int money)
	{
		this.npcID = npcID;
		this.name = name;
		this.description = description;
		this.health = health;
		this.damage = damage;
		this.attack = attack;
		this.money = money;
	}

	public NPC()
	{
		npcID = 0;
		name = "";
		description = "";
		health = 150;
		damage = 20;
		attack = false;
		money = 1000;
	}

	/**Method Name: getName
	 * @return the name
	 */
	public boolean isFriendly()
	{
		return this.attack;
	}
	
	/**Method Name: getName
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**Method Name: getDescription
	 * @return the description
	 */
	public String getDescription()
	{
		return description;
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

	/** Method Name: toString
	 * Description: Override 
	 * @return String representation of object
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "NPC [npcID=" + npcID + ", name=" + name + ", description="
				+ description + ", health=" + health + ", damage=" + damage
				+ ", attack=" + attack + ", money=" + money + "]";
	}

}