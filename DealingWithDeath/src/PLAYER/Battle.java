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
	protected Player _player;
	protected DWD _content;
	protected Random r;

	public Battle(DWD content)
	{
		_content = content;
		r = new Random();
	}

	/**
	 *
	 * this methods handles the way the NPC attacks
	 *
	 */

	private void npcAttack()
	{
		double damage = Math.ceil(_content.getCurrentNPC().getDamage() * (_content.getRoomID() / 100) * (r.nextInt(4) + 1) + 1);
		int playeHealth = (int) (_content.getPlayer().getHealth() - damage);
		_content.getPlayer().setHealth(playeHealth);
		System.out.println("The enemy attacked with " + damage + " HP of damage");
	}

	/**
	 *
	 * this methods handles the way the player attacks
	 *
	 */
	private void playerAttack()
	{
		NPC.NPC enemy = _content.getCurrentNPC();
		Player player = _content.getPlayer();
		double damage = Math
				.ceil(_content.getPlayer().getDamage() * (.33) * (r.nextInt(4) + 1) + 1);
		System.out.println("Player attacked " + enemy.getDescription() + " with " + damage + " ammounts of damage");
		int enemyHealth = (int) (enemy.getHealth() - damage);
		_content.getCurrentNPC().setHealth(enemyHealth);
	}

	public boolean StartBattle() {

		//TODO: while the player health  > 0  && monster health > 0then
		// keep fighting
		// npc attack
		// player attack
		if (_content.getCurrentNPC().getHealth() == 0) {
			System.out.println("The enemy is dead. There is nothing left to do here");
			return true;
		}
		if (_content.getPlayer().getHealth() == 0) {
			System.out.println("You can't fight because you are dead");
			return true;
		}
		Boolean stillFighting = true;
		while (stillFighting) {
			if (_content.getPlayer().getHealth() <= 0) {
				System.out.println("You have died and gone to hell");
				stillFighting = false;
				return false;
			} else if (_content.getCurrentNPC().getHealth() <= 0) {
				System.out.println("You have defeated the enemy.");
				stillFighting = false;
				return true;
			} else {
				playerAttack();
				npcAttack();
				System.out.println("Player HP: " + _content.getPlayer().getHealth());
				System.out.println("Enemy HP: " + _content.getCurrentNPC().getHealth());
			}
		}
		System.out.println("The fight is now over");
		return true;
	}
}
