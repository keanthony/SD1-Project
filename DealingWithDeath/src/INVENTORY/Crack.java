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
	private static final long serialVersionUID = 1L;
	private int increaseHealth;
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
	public Crack(int location, boolean isPresent, String name,
			String description, int limit, int quantitiy, int increaseHealth, int value)
	{
		super(location, isPresent, name, description, limit, quantitiy);
		this.increaseHealth = increaseHealth;
		this.value = value;
	}

	

	/**Method Name: getIncreaseHealth
	 * @return the increaseHealth
	 */
	public int getIncreaseHealth()
	{
		return increaseHealth;
	}



	/**Method Name: getValue
	 * @return the value
	 */
	public int getValue()
	{
		return value;
	}



	/** Method Name: usable
	 * Description: Override 
	 * @return String representation of object
	 * @see INVENTORY.Item#usable()
	 */
	@Override
	public String usable()
	{
		return null;
	}

}
