package PLAYER;
import static org.junit.Assert.*;

import org.junit.Test;

import PLAYER.Battle;

public class BattleTest 
{

	@Test
	public void testNpcAttack() 
	{
			Battle  junit = new Battle();
			int result = junit.npcAttack();
			assertEquals(80, result);
	}

	@Test
	public void testPlayerAttack() 
	{
		Battle  junit = new Battle();
		int result = junit.playerAttack();
		assertEquals(145, result);
		
	}

}
