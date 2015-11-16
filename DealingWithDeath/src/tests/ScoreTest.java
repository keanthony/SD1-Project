package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import PLAYER.Score;

public class ScoreTest 
{

	@Test
	public void testSale() 
	{
		Score junit = new Score();
		int current = junit.Sale();
		assertEquals(2000, current);
	}

	@Test
	public void testLoseMoney() 
	{
		Score junit = new Score();
		int current = junit.loseMoney();
		assertEquals(0, current);

	}

	@Test
	public void testSaveMoney() 
	{
		Score junit = new Score();
		int current = junit.saveMoney();
		assertEquals(0, current);
		
	}

}
