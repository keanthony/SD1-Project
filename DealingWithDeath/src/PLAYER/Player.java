package PLAYER;
import ROOM.*;
import java.util.ArrayList;
import INVENTORY.*;
import MAIN.DWD;

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
	protected String name;
	protected int health;
	protected int damage;
	protected Score score;
	protected Room room;
	protected ArrayList<Item> inventory;
	protected DWD dwd;
	
	/**
	 * 
	 */
	public Player() 
	{
		name = "";
		health = 100;
		damage = 5;
		score = new Score();
		room  = new Room();
		inventory = new ArrayList<Item>();
		dwd  = new DWD();
	}
	
	/**Constructor: Player.java
	 * Initializes object with following params.
	 * @param userName 
	 */
	public Player(int health)
	{
		name = "";
		this.health = health;
		damage = 5;
		score = new Score();
		room  = new Room();
		inventory = new ArrayList<Item>();
		dwd  = new DWD();
	}
	
	/**Constructor: Player.java
	 * Initializes object with following params.
	 * @param name
	 */
	public Player(String name)
	{
		this.name = name;
		health = 100;
		damage = 5;
		score = new Score();
		room  = new Room();
		inventory = new ArrayList<Item>();
		dwd  = new DWD();
	}
	
	public Player(String name, int health, int damage, Score score, 
			Room room, ArrayList<Item> inventory)
	{
		this.name = name;
		this.health = health;
		this.damage = damage;
		this.score = score;
		this.room = room;
		this.inventory = inventory;
		dwd  = new DWD();
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
	public String getWeap(Item item)
	{
		if (room.isPresent(item))
		{
			inventory.add(item);
			return "Item is now in your inventory";
		}
		else return "Item not found";
	}

	/**Method Name: getInventory
	 * @return the inventory
	 */
	public ArrayList<Item> getInventory()
	{
		return inventory;
	}
	
	/**goTo
	 * @param room
	 * lets you enter a new room
	 */
	public void goTo(Room room)
	{
		room.enter();
	}

	/**
	 * take
	 * @param numItem
	 * @return
	 * lets you take an item and put in on your inventory
	 */
	public String take(Item item)
	{
		if (room.isPresent(item))
		{
			inventory.add(item);
		}

		return "Item is now in your inventory";
	}

	//gives a description of the item
	public String inspect(Item item)
	{
		if (room.isPresent(item))
		{
			return item.getDescription();
		}
		else return "Item not found";
	}
	
	//Calls the actions to fight the NPC
	//TODO Where is the Battle class?
	/*public void fight(Battle enemy)
	{
		//enemy.npcAttack();
	}
*/
	public void goToHell(Room hell)
	{
		
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
	public static String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
	  */
}