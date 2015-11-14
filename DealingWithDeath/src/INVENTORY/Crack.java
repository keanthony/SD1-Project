package INVENTORY;

import java.io.Serializable;

/**Class: Crack.java
 * @author: Kevin Anthony 
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Oct 30, 2015
 * Class Description: Crack child class of Item
 * Purpose: Generate and handle Crack items
 */

public class Crack extends Item implements Serializable
{
	protected int value;

	/**Constructor: Crack.java
	 * Initializes object with following params.
	 * @param itemIndex
	 * @param name
	 * @param description
	 * @param value
	 */
	public Crack(int itemIndex, String name, String description, int value)
	{
		super(itemIndex, name, description);
		this.value = value;
	}

	/**Method Name: getValue
	 * @return the value
	 */
	public int getValue()
	{
		return value;
	}

	/** Method Name: equipItem
	 * Description: Crack cannot be equipped
	 * @return String representation of object
	 * @see INVENTORY.Item#equipItem()
	 */
	@Override
	public String equipItem()
	{
		return "Crack cannot be equipped";
	}

	/** Method Name: toString
	 * Description: Override 
	 * @return String representation of object
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Crack [value=" + value + " " + super.toString();
	}

}
