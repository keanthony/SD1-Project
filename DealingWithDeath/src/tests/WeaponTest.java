/**Class: WeaponTest.java
 * @author: Kevin Anthony
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Nov 13, 2015
 * Class Description: jUnit test for Weapon
 * Purpose: To make sure Weapon is working as intended
 */
package tests;
import org.junit.Before;
import org.junit.Test;

import INVENTORY.Weapon;

public class WeaponTest
{
	protected Weapon wPos;
	//protected Weapon wNeg;

	/**Method Name: setUp
	 * Description: TODO 
	 * @throws java.lang.Exception
	 */

	@Before
	public void setUp() 
	{
		wPos = new Weapon(1, "test name", "test description", 100);
		int name = 100;
		int desc = 200;
		//wNeg = new Weapon(-1, name, desc, "100");
	}

	@Test
	public final void testConstructor()
	{
		System.out.println(wPos);
		//System.out.println(wNeg);
	}

	@Test
	public final void testGetValue()
	{
		System.out.println(wPos.getDamage());
		//System.out.println(wNeg.getValue());
	}

	@Test
	public final void testEquipItem()
	{
		System.out.println(wPos.equipItem());
		//System.out.println(wNeg.equipItem());
	}
}