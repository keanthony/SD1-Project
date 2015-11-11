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
	protected ArrayList<Item> inventory;
	private Item it;
	private Commands command;
	private Weapon weap;
	private Armor arm;
	private Crack crac;
	protected Room room;
	protected Player player; 
	protected DWD dwd;
	protected Score score;
	protected int damage;

	
	/**
	 * 
	 */
	public Player() 
	{
		health = 100;
		player = new Player(health);
		room  = new Room();
		dwd  = new DWD();
		inventory = new ArrayList<Item>();
		score = new Score();
		damage = 5;
		crac = new Crack(damage, null, null, damage);
	}
	/**Constructor: Player.java
	 * Initializes object with following params.
	 * @param userName 
	 */
	public Player(int health)
	{
		health = 100; 
	}
	
	public Player(String userName, int health, int damage, Score score, 
			Room room, ArrayList<Item> inventory)
	{
		health = 100;
		player = new Player(health);
		room  = new Room();
		dwd  = new DWD();
		inventory = new ArrayList<Item>();
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
	 * Checks what's on the inventory and shows it to the user
	 */
	public void  getInventory()
	{
		for (Item item : dwd.getItemAL())
		{
			System.out.println(item);
		}
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
	public void fight(Battle enemy)
	{
		//enemy.npcAttack();
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

	public static String getName() {
		// TODO Auto-generated method stub
		return null;
	}


}
	  */
}