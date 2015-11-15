/**Class: ArmorTest.java
 * @author: Kevin Anthony
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Nov 13, 2015
 * Class Description: jUnit test for Armor
 * Purpose: To make sure Armor is working as intended
 */
package tests;
import org.junit.Before;
import org.junit.Test;

import INVENTORY.Armor;

public class ArmorTest
{
	protected Armor aPos;
	//protected Armor aNeg;

	/**Method Name: setUp
	 * Description: TODO 
	 * @throws java.lang.Exception
	 */

	@Before
	public void setUp() 
	{
		aPos = new Armor(1, "test name", "test description", 100);
		int name = 100;
		int desc = 200;
		//aNeg = new Armor(-1, name, desc, "100");
	}

	@Test
	public final void testConstructor()
	{
		System.out.println(aPos);
		//System.out.println(aNeg);
	}

	@Test
	public final void testGetValue()
	{
		System.out.println(aPos.getIncreaseHP());
		//System.out.println(aNeg.getValue());
	}

	@Test
	public final void testEquipItem()
	{
		System.out.println(aPos.equipItem());
		//System.out.println(aNeg.equipItem());
	}
}