package INVENTORY;

import java.io.Serializable;

public abstract class Item implements Serializable
{

	private static final long serialVersionUID = 1L;
	private int location;
	private boolean isPresent;
	private String name;
	private String description;
	private int limit;
	private int quantitiy;

	
	/**Constructor: Item.java
	 * Initializes object with following params.
	 * @param location
	 * @param isPresent
	 * @param name
	 * @param description
	 * @param limit
	 * @param quantitiy
	 */
	public Item(int location, boolean isPresent, String name,
			String description, int limit, int quantitiy)
	{
		this.location = location;
		this.isPresent = isPresent;
		this.name = name;
		this.description = description;
		this.limit = limit;
		this.quantitiy = quantitiy;
	}

	public abstract String usable();
	public String getDescription()
	{
		return description;
	}
	public String getName()
	{
		return name;
	}
	public boolean isEquipable(Weapon weapon)
	{
		return false;
	}

	public boolean isEquipable(Armor armor)
	{
		return false;
	}
	
}
