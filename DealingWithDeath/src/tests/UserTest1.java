package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import MAIN.User;

public class UserTest1 {

	@Test
	public void test() {
		User user=new User();
		user.newGame("Sam");
		assertSame("Sam", "A player with this name already exits.", "A player with this name already exits.");
	}

}
