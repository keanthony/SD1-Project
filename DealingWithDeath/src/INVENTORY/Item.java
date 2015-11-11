package INVENTORY;
/**Class: Item.java
 * @author: Kevin Anthony 100%
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Oct 30, 2015
 * Class Description: Abstract class for Items
 * Purpose: Parent class that provides variables and methods for child classes
 * to inherit
 */

public abstract class Item
{
	protected int itemIndex;
	protected String name;
	protected String description;
		
	/**Constructor: Item.java
	 * Initializes object with following params.
	 * @param name
	 * @param description
	 * @param itemIndex
	 */
	public Item(int itemIndex, String name,String description)
	{
		itemIndex = 0;
		name = "";
		description = "";
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
}