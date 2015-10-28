package INVENTORY;

import java.util.ArrayList;

public class Inventory
{
	private ArrayList<Item> iAL;
	private Weapon wep;
	private Armor arm;
	private boolean useable;
	private boolean equipable;

	/**Constructor: Inventory.java
	 * Initializes object with following params.
	 * @param iAL
	 * @param wep
	 * @param arm
	 * @param useable
	 * @param equipable
	 */
	public Inventory(ArrayList<Item> iAL, Weapon wep, Armor arm,
			boolean useable, boolean equipable)
	{
		iAL = new ArrayList<Item>();
		this.wep = wep;
		this.arm = arm;
		this.useable = useable;
		this.equipable = equipable;
	}

	/**Method Name: getiAL
	 * @return the iAL
	 */
	public ArrayList<Item> getiAL()
	{
		return iAL;
	}

	/**Method Name: setiAL
	 * @param iAL the iAL to set
	 */
	public void setiAL(ArrayList<Item> iAL)
	{
		this.iAL = iAL;
	}

	/**Method Name: getWep
	 * @return the wep
	 */
	public Weapon getWep()
	{
		return wep;
	}

	/**Method Name: setWep
	 * @param wep the wep to set
	 */
	public void setWep(Weapon wep)
	{
		this.wep = wep;
	}

	/**Method Name: getArm
	 * @return the arm
	 */
	public Armor getArm()
	{
		return arm;
	}

	/**Method Name: setArm
	 * @param arm the arm to set
	 */
	public void setArm(Armor arm)
	{
		this.arm = arm;
	}

	/**Method Name: isUseable
	 * @return the useable
	 */
	public boolean isUseable()
	{
		return useable;
	}

	/**Method Name: setUseable
	 * @param useable the useable to set
	 */
	public void setUseable(boolean useable)
	{
		this.useable = useable;
	}

	/**Method Name: isEquipable
	 * @return the equipable
	 */
	public boolean isEquipable()
	{
		return equipable;
	}

	/**Method Name: setEquipable
	 * @param equipable the equipable to set
	 */
	public void setEquipable(boolean equipable)
	{
		this.equipable = equipable;
	}

	public String use(Item item)
	{
		return null;
	}

	public void equip(Weapon weapon)
	{

	}

	public void equip(Armor armor)
	{

	}

	public void drop(Item item)
	{

	}

}
