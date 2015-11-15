/**Class: CrackTest.java
 * @author: Kevin Anthony
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Nov 14, 2015
 * Class Description: jUnit test for Crack
 * Purpose: To make sure Crack is working as intended
 */
package tests;

import org.junit.Before;
import org.junit.Test;

import INVENTORY.Crack;

public class CrackTest
{
	protected Crack cPos;
	//protected Crack cNeg;

	/**Method Name: setUp
	 * Description: TODO 
	 * @throws java.lang.Exception
	 */

	@Before
	public void setUp() 
	{
		cPos = new Crack(1, "test name", "test description", 100);
		int name = 100;
		int desc = 200;
		//cNeg = new Crack(-1, name, desc, "100");
	}

	@Test
	public final void testConstructor()
	{
		System.out.println(cPos);
		//System.out.println(cNeg);
	}

	@Test
	public final void testGetValue()
	{
		System.out.println(cPos.getValue());
		//System.out.println(cNeg.getValue());
	}

	@Test
	public final void testEquipItem()
	{
		System.out.println(cPos.equipItem());
		//System.out.println(cNeg.equipItem());
	}
}
