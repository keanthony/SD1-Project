package INVENTORY;
/**Class: Item.java
 * @author: Kevin Anthony
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Oct 30, 2015
 * Class Description: Abstract class for Items
 * Purpose: Parent class that provides variables and methods for child classes
 * to inherit
 */

public abstract class Item
{
	protected String name;
	protected String description;
	protected int itemIndex;

	
	/**Constructor: Item.java
	 * Initializes object with following params.
	 * @param location
	 * @param isPresent
	 * @param name
	 * @param description
	 * @param limit
	 * @param quantitiy
	 */
	public Item(String name,String description, int itemIndex)
	{
		this.name = name;
		this.description = description;
		this.itemIndex = itemIndex;
	}

	public abstract String useItem();
	public String getDescription()
	{
		return description;
	}
	public String getName()
	{
		return name;
	}

	/**Method Name: getItemIndex
	 * @return the itemIndex
	 */
	public int getItemIndex()
	{
		return itemIndex;
	}
	
	
	
	
}
