package INVENTORY;

/**Class: Weapon.java
 * @author: Kevin Anthony
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Oct 30, 2015
 * Class Description: Weapon child class of Item
 * Purpose: Generate and handle Weapon items
 */
public class Weapon extends Item 
{
	protected int damage;
	
	/**Constructor: Weapon.java
	 * Initializes object with following params.
	 * @param itemIndex
	 * @param name
	 * @param description
	 * @param damage
	 */
	public Weapon(int itemIndex, String name, String description, int damage)
	{
		super(itemIndex, name, description);
		damage = 0;
	}


	/**Method Name: getDamage
	 * @return the damage
	 */
	public int getDamage()
	{
		return damage;
	}

	/** Method Name: equipItem
	 * Description: Override 
	 * @return String representation of object
	 * @see INVENTORY.Item#equipItem()
	 */
	@Override
	public String equipItem()
	{
		return "This weapon increases damage by " + damage;
	}

}
