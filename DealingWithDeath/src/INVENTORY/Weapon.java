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
	private int damage;
	
	/**Constructor: Weapon.java
	 * Initializes object with following params.
	 * @param location
	 * @param isPresent
	 * @param name
	 * @param description
	 * @param limit
	 * @param quantitiy
	 */
	public Weapon(String name, String description, int itemIndex, int value, int damage)
	{
		super(name, description, itemIndex);
		this.damage = damage;
	}

	/**Method Name: getDamage
	 * @return the damage
	 */
	public int getDamage()
	{
		return damage;
	}

	/** Method Name: usable
	 * Description: Override 
	 * @return String representation of object
	 * @see INVENTORY.Item#usable()
	 */
	@Override
	public String useItem()
	{
		return "" + damage;
	}

}
