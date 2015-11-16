package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ROOM.Room;

public class RoomTest {

	@Test
	public void testRoom() {
		Room jUR = new Room();
	}

	@Test
	public void testRoomIntStringRiddleNPCItem() {
		
		Room jUR = new Room(0,
				"A furious rumble resounds in the area as stones come "
						+ "clattering through the doorway, along with a thick cloud of "
						+ "rock dust. The room beyond is filled with rubble.",
				null, null, null);
		
	}

	@Test
	public void testGetrDescription() {
		Room jUR = new Room(0,
				"A furious rumble resounds in the area as stones come "
						+ "clattering through the doorway, along with a thick cloud of "
						+ "rock dust. The room beyond is filled with rubble.",
				null, null, null);
		jUR.getCrackHeads();
	}

	@Test
	public void testGetNpcPresent() {
		Room jUR = new Room(0,
				"A furious rumble resounds in the area as stones come "
						+ "clattering through the doorway, along with a thick cloud of "
						+ "rock dust. The room beyond is filled with rubble.",
				null, null, null);
		jUR.getNpcPresent();
	}

	@Test
	public void testGetrRiddle() {
		Room jUR = new Room(0,
				"A furious rumble resounds in the area as stones come "
						+ "clattering through the doorway, along with a thick cloud of "
						+ "rock dust. The room beyond is filled with rubble.",
				null, null, null);
		jUR.getrRiddle();
	}

	@Test
	public void testGetCrackHeads() {
		Room jUR = new Room(0,
				"A furious rumble resounds in the area as stones come "
						+ "clattering through the doorway, along with a thick cloud of "
						+ "rock dust. The room beyond is filled with rubble.",
				null, null, null);
		jUR.getCrackHeads();
	}

	@Test
	public void testGetItem() {
		Room jUR = new Room(0,
				"A furious rumble resounds in the area as stones come "
						+ "clattering through the doorway, along with a thick cloud of "
						+ "rock dust. The room beyond is filled with rubble.",
				null, null, null);
		jUR.getItem();
	}

	@Test
	public void testIsItemPresent() {
		Room jUR = new Room(0,
				"A furious rumble resounds in the area as stones come "
						+ "clattering through the doorway, along with a thick cloud of "
						+ "rock dust. The room beyond is filled with rubble.",
				null, null, null);
		jUR.isItemPresent();
	}

	@Test
	public void testEnter() {
		Room jUR = new Room(0,
				"A furious rumble resounds in the area as stones come "
						+ "clattering through the doorway, along with a thick cloud of "
						+ "rock dust. The room beyond is filled with rubble.",
				null, null, null);
		jUR.enter(1);
	}

	@Test
	public void testIsPresent() {
		Room jUR = new Room(0,
				"A furious rumble resounds in the area as stones come "
						+ "clattering through the doorway, along with a thick cloud of "
						+ "rock dust. The room beyond is filled with rubble.",
				null, null, null);
		jUR.isItemPresent();
	}

	@Test
	public void testToString() {
		Room jUR = new Room(0,
				"A furious rumble resounds in the area as stones come "
						+ "clattering through the doorway, along with a thick cloud of "
						+ "rock dust. The room beyond is filled with rubble.",
				null, null, null);
		jUR.toString();
	}

}
