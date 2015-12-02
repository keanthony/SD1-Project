package PLAYER;
import MAIN.DWD;
import NPC.NPC;
import java.io.Serializable;
import java.util.Random;

/**Class: Player.java
 * @author: Kevin Anthony
 * @collaborator: 
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Oct 30, 2015
 * Class Description: Battle class
 * Purpose: Handles the Player versus NPC battles
 */

public class Battle implements Serializable
{
	protected Player player;
	protected DWD _content;
	protected Random r;
	protected NPC enemy;

	public Battle(DWD content)
	{
		player = new Player(); //TODO: If you try to fight in a friendly room you get a NullPointer
		_content = content;
		r = new Random();
		enemy = _content.getCurrentNPC();
	}

	/**Method Name: npcAttack
	 * Description: this methods handles the way the NPC attacks
	 */
	private void npcAttack()
	{
		double damage = Math.ceil(_content.getCurrentNPC().getDamage()
				* (_content.getRoomID() / 100) * (r.nextInt(4) + 1) + 1);
		int playeHealth = (int) (_content.getPlayer().getHealth() - damage);
		_content.getPlayer().setHealth(playeHealth);
		System.out.println(enemy.getName() + " attacks " + player.getName()
				+ " for " + damage + " damage");
		try
		{
			Thread.sleep(250);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	/**Method Name: playerAttack
	 * Description: this methods handles the way the player attacks 
	 */
	private void playerAttack()
	{
		double damage = Math.ceil(
				_content.getPlayer().getDamage() * (.33) * (r.nextInt(4) + 1)
						+ 1);
		System.out.println(player.getName() + " attacks " + enemy.getName()
				+ " for " + damage + " damage");
		int enemyHealth = (int) (enemy.getHealth() - damage);
		_content.getCurrentNPC().setHealth(enemyHealth);
		try
		{
			Thread.sleep(250);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	/**Method Name: StartBattle
	 * Description: Keeps the battle running until one of the combatants perishes 
	 * @return Boolean stillFighting
	 */
	public boolean StartBattle()
	{
		if (_content.getCurrentNPC().getHealth() == 0)
		{
			System.out.println(
					"The enemy is dead. There is nothing left to do here");
			return true;
		}
		if (_content.getPlayer().getHealth() == 0)
		{
			System.out.println("You can't fight because you are dead");
			return true;
		}
		Boolean stillFighting = true;
		while (stillFighting)
		{
			if (_content.getPlayer().getHealth() <= 0)
			{
				System.out.println("You have died and gone to hell");
				stillFighting = false;
				return false;
			}
			else if (_content.getCurrentNPC().getHealth() <= 0)
			{
				System.out.println("You have defeated the enemy.");
				stillFighting = false;
				return true;
			}
			else
			{
				playerAttack();
				npcAttack();
				System.out.println(
						"Player HP: " + _content.getPlayer().getHealth());
				System.out.println(
						"Enemy HP: " + _content.getCurrentNPC().getHealth());
			}
		}
		System.out.println("The fight is now over");
		return true;
	}
}
