package tests;

import PLAYER.Player;
import org.junit.Test;

public class PlayerTest {


	@Test
	public void testTake()
	{
		Player player = new Player();
		player.take();
		System.out.println(player.take());

	}

	@Test
	public void testInspect()
	{
		Player player = new Player();
		player.inspect();
		System.out.println(player.inspect());
	}

	@Test
	public void testToString()
	{
		Player player = new Player();
		System.out.println(player.toString());
	}

}
