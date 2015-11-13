package PLAYER;
import MAIN.DWD;
import NPC.NPC;
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
	
	
	/**
	 * 
	 * this methods handles the way the NPC will attack
	 * 
	 */
	public int npcAttack()
	{	
		int currentHealth = player.getHealth();
		currentHealth = currentHealth - currentNPC.getCrackHeads().getDamage();
		
		return currentHealth;
	}
	
	/**
	 * 
	 * this methods handles the way the NPC will attack
	 * 
	 */
	public int playerAttack()
	{
		int currentHealth = currentNPC.getCrackHeads().getHealth();
	//	currentHealth = currentHealth - player.getDamage();
		
		return currentHealth;
		
	}
		
	

}
