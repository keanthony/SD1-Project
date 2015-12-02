package PLAYER;

import MAIN.DWD;

import java.util.Random;

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
	protected Player player;
	protected DWD currentNPC;
	protected Random r;

	public Battle()
	{
		player = new Player();
		currentNPC = new DWD();
		r = new Random();
	}

	/**
	 *
	 * this methods handles the way the NPC attacks
	 *
	 */

	private int npcAttack()
	{
		return (int) (player.getHealth()
				- Math.ceil(currentNPC.getCurrentNPC().getDamage()
						* (currentNPC.getRoomID() / 100) * (r.nextInt(4) + 1)
						+ 1));
	}

	/**
	 *
	 * this methods handles the way the player attacks
	 *
	 */
	private int playerAttack()
	{
		return (int) (currentNPC.getCurrentNPC().getHealth() - Math
				.ceil(player.getDamage() * (.33) * (r.nextInt(4) + 1) + 1));

	}

	public boolean StartBattle() {

		//TODO: while the player health  > 0  && monster health > 0then
		// keep fighting
		// npc attack
		// player attack
		return true;

	}
}
