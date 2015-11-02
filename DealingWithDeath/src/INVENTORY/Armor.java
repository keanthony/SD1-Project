package INVENTORY;

/**Class: Armor.java
 * @author: Kevin Anthony
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Oct 30, 2015
 * Class Description: Armor child class of Item
 * Purpose: Generate and handle Armor items
 */

public class Armor extends Item 
{
	private static final long serialVersionUID = 1L;
	private int increaseHP;
	
	/**Constructor: Armor.java
	 * Initializes object with following params.
	 * @param location
	 * @param isPresent
	 * @param name
	 * @param description
	 * @param limit
	 * @param quantitiy
	 */
	public Armor(int location, boolean isPresent, String name,
			String description, int limit, int quantitiy, int increaseHP)
	{
		super(location, isPresent, name, description, limit, quantitiy);
		this.increaseHP = increaseHP;
	}
	
	/**Method Name: getIncreaseHP
	 * @return the increaseHP
	 */
	public int getIncreaseHP()
	{
		return increaseHP;
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
