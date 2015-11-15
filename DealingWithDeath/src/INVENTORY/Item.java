package INVENTORY;

import java.io.Serializable;

/**Class: Item.java
 * @author: Kevin Anthony 
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Oct 30, 2015
 * Class Description: Abstract class for Items
 * Purpose: Parent class that provides variables and methods for child classes
 * to inherit
 */

public abstract class Item implements Serializable
{
	protected int itemIndex;
	protected String name;
	protected String description;

	/**Constructor: Item.java
	 * Initializes object with no params.
	 */
	public Item()
	{
		itemIndex = 0;
		name = "";
		description = "";
	}

	/**Constructor: Item.java
	 * Initializes object with following params.
	 * @param itemIndex
	 * @param name
	 * @param description
	 */
	public Item(int itemIndex, String name, String description)
	{
		this.itemIndex = itemIndex;
		this.name = name;
		this.description = description;
	}

	/**Method Name: getItemIndex
	 * @return the itemIndex
	 */
	public int getItemIndex()
	{
		return itemIndex;
	}

	public String getDescription()
	{
		return description;
	}

	public String getName()
	{
		return name;
	}

	public abstract String equipItem();

	/** Method Name: toString
	 * Description: Override 
	 * @return String representation of object
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Item [itemIndex=" + itemIndex + ", name=" + name
				+ ", description=" + description + "]";
	}
}
