package PLAYER;
import ROOM.Room;
import java.util.ArrayList;
import INVENTORY.Armor;
import INVENTORY.Crack;
import INVENTORY.Item;
import INVENTORY.Weapon;
import NPC.NPC;

/**Class: Player.java
 * @author: Kevin Anthony
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Oct 30, 2015
 * Class Description: Player class
 * Purpose: Generate and handle Player interactions
 */


public class Player
{
	private int health;
	private ArrayList<Item> inventory;
	private Item it;
	private Commands command;
	private Weapon weap;
	private Armor arm;
	private Crack crac;
	
	/**Constructor: Player.java
	 * Initializes object with following params.
	 */
	public Player()
	{
		health = 100;
	}

	/**Constructor: Player.java
	 * Initializes object with following params.
	 * @param health
	 * @param inventory
	 */
	public Player(int health, ArrayList<Item> inventory)
	{
		this.health = health;
		this.inventory = inventory;
	}

	
	/**Method Name: getWeap
	 * @return the weap
	 */
	public Weapon getWeap()
	{
		return weap;
	}

	public void goTo(Room room)
	{

	}

	public Item take(Item item)
	{
		return null;
	}

	public String inspect(Item item)
	{
		return null;
	}

	public void fight(NPC enemy)
	{

	}

	public void goToHell()
	{

	}

	public void trade(NPC trade)
	{

	}

	public void approach(NPC enemy)
	{

	}

}
