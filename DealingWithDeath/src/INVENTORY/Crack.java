package INVENTORY;

/**Class: Crack.java
 * @author: Kevin Anthony
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Oct 30, 2015
 * Class Description: Crack child class of Item
 * Purpose: Generate and handle Crack items
 */

public class Crack extends Item
{
	private int value;
	
	/**Constructor: Crack.java
	 * Initializes object with following params.
	 * @param location
	 * @param isPresent
	 * @param name
	 * @param description
	 * @param limit
	 * @param quantitiy
	 */
	public Crack(String name, String description, int itemIndex, int value)
	{
		super(name, description, itemIndex);
		this.value = value;
	}

	/**Method Name: getValue
	 * @return the value
	 */
	public int getValue()
	{
		return value;
	}

	/** Method Name: useItem
	 * Description: Override 
	 * @return String representation of object
	 * @see INVENTORY.Item#useItem()
	 */
	@Override
	public String useItem()
	{
		return null;
	}

}
