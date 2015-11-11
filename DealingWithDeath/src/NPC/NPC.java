package NPC;
/**Class: NPC.java
* @author: 
* @collaborator: Kevin Anthony 
* @version: 1.0
* Course : ITEC 3860 Fall 2015 Dr. Johnson
* Date Written: Oct 30, 2015
* Class Description: NPC class
* Purpose: Set attributes for NPC's
*/
public class NPC
{
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
			int damage, boolean attack)
	{
		npcID = 0;
		name = "";
		description = "";
		health = 100;
		damage = 0;
		attack = false;
	}
	//used to get the health of the current NPC
	public NPC(int health)
	{
		health = 100;
	}

	public void attack()
	{

		//this should bring down health points of the main player

	}

	public void die()
	{

	}

}
