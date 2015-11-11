package PLAYER;

import ROOM.*;
import java.util.ArrayList;
import INVENTORY.*;
import MAIN.DWD;
import NPC.NPC;

/**Class: Player.java
 * @author: Samuel Medina
 * @collaborator: Kevin Anthony
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Oct 30, 2015
 * Class Description: Player class
 * Purpose: Generate and handle Player interactions
 */

public class Player
{
	protected int health;
	protected ArrayList<Integer> inventory;
	private Item it;
	private Commands command;
	private Weapon weap;
	private Armor arm;
	private Crack crac;
	protected Room item;
	protected Player player; 
	protected DWD dwd;
	protected Score score;
	protected int damage;

	/**Constructor: Player.java
	 * Initializes object with following params.
	 */
	public Player(int health)
	{
		health = 100; 
	}
	public Player()
	{
		health = 100;
		player = new Player();
		item  = new Room();
		dwd  = new DWD();
		inventory = new ArrayList<Integer>();
		score = new Score();
		damage = 5;
		crac = new Crack(damage, null, null, damage);
		
	}

	/**Constructor: Player.java
	 * Initializes object with following params.
	 * @param health
	 * @param inventory
	 * @param score
	 * @param damage
	 */
	public Player(int health, ArrayList<Integer> inventory, Score sc, int dm)
	{
		health = 100;
		inventory = new ArrayList<Integer>();
		score = sc;
		damage = dm;
	}
	

	/**
	 * @return the health
	 */
	public int getHealth() 
	{
		return health;
	}

	/**Method Name: getWeap
	 * @return the weap
	 * Checks to see if the weapon is in the room and adds it to the ArrayList
	 */
	public String getWeap(int numItem)
	{
		if (item.isPresent())
		{

			inventory.add(numItem);

		}
		return "Armor is now in your inventory";
	}

	/**Method Name: getInventory
	 * @return the inventory
	 * Checks what's on the inventory and shows it to the user
	 */
	public void  getInventory()
	{
		for (Item item : dwd.getItemAL())
		{
			System.out.println(item);
		}
	}

	public void goTo(Room room)
	{
		room.enter();
	}

	public String take(int numItem)
	{
		if (item.isPresent())
		{
			inventory.add(numItem);
		}

		return "Item is now in your inventory";
	}

	//gives a description of the item
	public String inspect(Item inspectItem)
	{
		if (item.isPresent())
		{
			inspectItem.getDescription();
		}

		return inspectItem.getDescription();
	}

	public void fight(NPC enemy)
	{
		

	}

	public void goToHell(Room hell)
	{
		if (health < 1)
		{
			player.goTo(hell);
		}
		//TODO: Once room is created change the hell to the room number since 
		//what's going to be passed is an integer

	}
	/*//trades crack with the NPC
	*//**
	 * @param trade
	 *//*
	public void trade(NPC trade)
	{
	

	}

	//Gives options to ether fight or trade 
	public void approach(NPC enemy)
	{

	}
*/
}