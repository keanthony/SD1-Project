package PLAYER;
import ROOM.Room;

/**Class: Player.java
 * @author: Samuel Medina
 * @collaborator:
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Oct 30, 2015
 * Class Description: Battle class
 * Purpose: Handles attacks from player, NPC and devil 
 */

public class Battle 
{
	protected  Player player;
	protected Room currentNPC;
	
public Battle()
{
	player = new Player();
	currentNPC = new Room();
}

	/**
	 * 
	 * this methods handles the way the NPC attacks
	 * 
	 */
	
	public int npcAttack()
	{	
		int currentHealth = player.getHealth();
		int newhealth = currentHealth - currentNPC.getCrackHeads().getDamage();
		return newhealth;
	}

	/**
	 * 
	 * this methods handles the way the player attacks
	 * 
	 */
	public int playerAttack()
	{
		int currentHealth = currentNPC.getCrackHeads().getHealth();
		currentHealth = currentHealth - player.getDamage();

		return currentHealth;

	}

	public void goToHell()
	{
		if(player.getHealth() < 0)
		{
			player.goTo(null);
		}

		//TODO: Once room is created change the hell to the room number since 
		//what's going to be passed is an integer

	}



}
