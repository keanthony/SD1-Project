package PLAYER;

import static org.junit.Assert.*;

import org.junit.Test;
import INVENTORY.Item;
import ROOM.Room;

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
	public void testFight() 
	{
		Battle enemy = new Battle(); 
		Player player = new Player();
		player.fight(enemy);

	}


	@Test
	public void testApproach() 
	{
		Player player = new Player();
		player.approach();
	}

	@Test
	public void testToString() 
	{
		Player player = new Player();
		System.out.println(player.toString());
	}

}
