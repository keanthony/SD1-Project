package INVENTORY;

import java.io.Serializable;

/**Class: Armor.java
 * @author: Kevin Anthony 100%
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Oct 30, 2015
 * Class Description: Armor child class of Item
 * Purpose: Generate and handle Armor items
 */

public class Armor extends Item implements Serializable
{
	protected int increaseHP;

	/**Constructor: Armor.java
	 * Initializes object with following params.
	 * @param location
	 * @param isPresent
	 * @param name
	 */
	public Armor(int itemIndex, String name, String description, int increaseHP)
	{
		super(itemIndex, name, description);
		increaseHP = 0;
	}

	/**Method Name: getIncreaseHP
	 * @return the increaseHP
	 */
	public int getIncreaseHP()
	{
		return increaseHP;
	}

	/** Method Name: equipItem
	 * Description: Override 
	 * @return String representation of object
	 * @see INVENTORY.Item#equipItem()
	 */
	@Override
	public String equipItem()
	{
		return "This armor increases your health by " + increaseHP;
	}

}
