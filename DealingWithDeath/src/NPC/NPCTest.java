package NPC;

import static org.junit.Assert.*;

import org.junit.Test;

public class NPCTest {

	@Test
	public void testNPCIntStringStringIntIntBooleanInt() {
		NPC testNPC = new NPC(0, "The Devil",
				"18ft tall, 4 wings, enormous in size, power and strength", 200,
				30, true, 10000);
	}

	@Test
	public void testNPC() {
		NPC testNPC = new NPC();
	}

	@Test
	public void testGetName() {
		NPC testNPC = new NPC(0, "The Devil",
				"18ft tall, 4 wings, enormous in size, power and strength", 200,
				30, true, 10000);
		String nameTest = testNPC.getName();
		assertEquals("The Devil", nameTest);
	}

	@Test
	public void testGetDescription() {
		NPC testNPC = new NPC(0, "The Devil",
				"18ft tall, 4 wings, enormous in size, power and strength", 200,
				30, true, 10000);
		String desTest = testNPC.getDescription();
		assertEquals("18ft tall, 4 wings, enormous in size, power and strength", desTest);
	}

	@Test
	public void testSetHealth() {
		NPC testNPC = new NPC(0, "The Devil",
				"18ft tall, 4 wings, enormous in size, power and strength", 200,
				30, true, 10000);
		testNPC.setHealth(300);		
		
	}

	@Test
	public void testSetDamage() {
		NPC testNPC = new NPC(0, "The Devil",
				"18ft tall, 4 wings, enormous in size, power and strength", 200,
				30, true, 10000);
		testNPC.setDamage(5);
	}

	@Test
	public void testGetMoney() {
		NPC testNPC = new NPC(0, "The Devil",
				"18ft tall, 4 wings, enormous in size, power and strength", 200,
				30, true, 10000);
		int newM =  testNPC.getMoney();
		assertEquals(10000, newM);
	}

	@Test
	public void testSetMoney() {
		NPC testNPC = new NPC(0, "The Devil",
				"18ft tall, 4 wings, enormous in size, power and strength", 200,
				30, true, 10000);
		testNPC.setMoney(30);
	}

	@Test
	public void testGetDamage() {
		NPC testNPC = new NPC(0, "The Devil",
				"18ft tall, 4 wings, enormous in size, power and strength", 200,
				30, true, 10000);
		int newD = testNPC.getDamage();
		assertEquals(30, newD);
	}

	@Test
	public void testGetHealth() {
		NPC testNPC = new NPC(0, "The Devil",
				"18ft tall, 4 wings, enormous in size, power and strength", 200,
				30, true, 10000);
		int newHealth = testNPC.getHealth();
		assertEquals(200, newHealth);
	}

	@Test
	public void testAttack() {
		NPC testNPC = new NPC(0, "The Devil",
				"18ft tall, 4 wings, enormous in size, power and strength", 200,
				30, true, 10000);
		testNPC.attack();
	}

	@Test
	public void testDie() {
		NPC testNPC = new NPC(0, "The Devil",
				"18ft tall, 4 wings, enormous in size, power and strength", 200,
				30, true, 10000);
		testNPC.die();
	}

	@Test
	public void testToString() {
		NPC testNPC = new NPC(0, "The Devil",
				"18ft tall, 4 wings, enormous in size, power and strength", 200,
				30, true, 10000);
		testNPC.toString();
	}

}
