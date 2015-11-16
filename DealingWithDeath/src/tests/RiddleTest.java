package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ROOM.Riddle;

public class RiddleTest {

	@Test
	public void testRiddle() {
		
		Riddle jUnit = new Riddle();

	}

	@Test
	public void testRiddleIntStringInt() {
		Riddle jUnit = new Riddle(0,
				"What has a foot, but no legs?\n1. A Roach\n2. A Turtle\n"
						+ "3. A Snail\n4. A Human",
				3);

	}

	@Test
	public void testGetQuestion() {
		Riddle jUnit = new Riddle(0,
				"What has a foot, but no legs?\n1. A Roach\n2. A Turtle\n"
						+ "3. A Snail\n4. A Human",
				3);
		String question = jUnit.getQuestion();
		assertEquals("What has a foot, but no legs?\n1. A Roach\n2. A Turtle\n", question);
		
	}

	@Test
	public void testGetSolution() {
		Riddle jUnit = new Riddle(0,
				"What has a foot, but no legs?\n1. A Roach\n2. A Turtle\n"
						+ "3. A Snail\n4. A Human",
				3);
		int newS = jUnit.getSolution();
		assertEquals(3, newS);
	}

	@Test
	public void testGetBackToRoom() {
		Riddle jUnit = new Riddle(0,
				"What has a foot, but no legs?\n1. A Roach\n2. A Turtle\n"
						+ "3. A Snail\n4. A Human",
				3);
		jUnit.getBackToRoom();
	}

	@Test
	public void testSetBackToRoom() {
		Riddle jUnit = new Riddle(0,
				"What has a foot, but no legs?\n1. A Roach\n2. A Turtle\n"
						+ "3. A Snail\n4. A Human",
				3);
		jUnit.setBackToRoom(1);
	}

	@Test
	public void testIsCorrect() {
		Riddle jUnit = new Riddle(0,
				"What has a foot, but no legs?\n1. A Roach\n2. A Turtle\n"
						+ "3. A Snail\n4. A Human",
				3);
		jUnit.isCorrect();
	}

	@Test
	public void testSetCorrect() {
		Riddle jUnit = new Riddle(0,
				"What has a foot, but no legs?\n1. A Roach\n2. A Turtle\n"
						+ "3. A Snail\n4. A Human",
				3);
		jUnit.setCorrect(false);
	
	}

	@Test
	public void testCheckAnswer() {
		//Room rJUnit = Room(0, "", null, null, null);
		Riddle jUnit = new Riddle(0,
				"What has a foot, but no legs?\n1. A Roach\n2. A Turtle\n"
						+ "3. A Snail\n4. A Human",
				3);
		jUnit.checkAnswer(0, 3);
	}

	@Test
	public void testReward() {
		
		Riddle jUnit = new Riddle(0,
				"What has a foot, but no legs?\n1. A Roach\n2. A Turtle\n"
						+ "3. A Snail\n4. A Human",
				3);
		jUnit.reward(0);
	}


}
