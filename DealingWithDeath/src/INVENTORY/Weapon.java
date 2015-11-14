package INVENTORY;
import java.io.Serializable;

/**Class: Weapon.java
 * @author: Kevin Anthony u
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Oct 30, 2015
 * Class Description: Weapon child class of Item
 * Purpose: Generate and handle Weapon items
 */
public class Weapon extends Item implements Serializable
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
		this.damage = damage;
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

	/** Method Name: toString
	 * Description: Override 
	 * @return String representation of object
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Weapon [damage=" + damage + " " + super.toString();
	}

}
