package PLAYER;

import ROOM.*;

import java.io.Serializable;
import java.util.ArrayList;

import INVENTORY.*;
import MAIN.DWD;
import MAIN.User;

/**Class: Player.java
 * @author: Samuel Medina
 * @collaborator: Kevin Anthony
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Oct 30, 2015
 * Class Description: Player class
 * Purpose: Generate and handle Player interactions
 */

/**
 * @author Sam
 *
 */
public class Player implements Serializable
{
	protected String name;
	protected int health;
	protected int damage;
	protected Score score;
	protected Room room;
	protected ArrayList<Item> inventory;
	protected DWD dwd;
	protected int money;
	protected Battle enemy;
	protected Item it;


	/**
	 * no parameter constructor 
	 */
	public Player()
	{
		name = "";
		health = 100;
		damage = 5;
		room = new Room();
		inventory = new ArrayList<Item>();
		dwd = new DWD();
		money = 1000;
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
		room = new Room();
		inventory = new ArrayList<Item>();
		dwd = new DWD();
		money = 1000;
	}
	/**Constructor: Player.java
	 * @author Samuel
	 * 
	 * @param name
	 * @param health
	 * @param damage
	 * @param score
	 * @param room
	 * @param inventory
	 * @param money
	 */
	public Player(String name, int health, int damage, Score score, Room room,
			ArrayList<Item> inventory, int money)
	{
		this.name = name;
		this.health = health;
		this.damage = damage;
		this.score = score;
		this.room = room;
		this.inventory = inventory;
		dwd = new DWD();
		this.money = money;
	}


	/**
	 * @return the score
	 */
	public Score getScore() 
	{
		return score;
	}


	/**
	 * @param score the score to set
	 */
	public void setScore(Score score) 
	{
		this.score = score;
	}


	/**
	 * @return the room
	 */
	public Room getRoom() 
	{
		return room;
	}


	/**
	 * @param room the room to set
	 */
	public void setRoom(Room room) 
	{
		this.room = room;
	}


	/**
	 * @return the dwd
	 */
	public DWD getDwd() 
	{
		return dwd;
	}


	/**
	 * @param dwd the dwd to set
	 */
	public void setDwd(DWD dwd) 
	{
		this.dwd = dwd;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) 
	{
		this.name = name;
	}


	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) 
	{
		this.health = health;
	}


	/**
	 * @param inventory the inventory to set
	 */
	public void setInventory(ArrayList<Item> inventory) 
	{
		this.inventory = inventory;
	}


	/**
	 * @return the money
	 */
	public int getMoney()
	{
		return money;
	}

	/**
	 * @param money the money to set
	 */
	public void setMoney(int money) 
	{
		this.money = money;
	}

	/**
	 * @return the health
	 */
	public int getHealth()
	{
		return health;
	}


	/**
	 * @return the damage
	 */
	public int getDamage() 
	{
		return damage;
	}

	/**
	 * @param damage the damage to set
	 */
	public void setDamage(int damage)
	{
		this.damage = damage;
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
		else
			return "Item not found";
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
	public String take()
	{
		//if (room.isPresent(it))
		{
			inventory.add(room.getItem());
		}

		return "Item is now in your inventory";
	}

	//gives a description of the item
	public String inspect()
	{
		if (room.isPresent(it))
		{
			return it.getDescription();
		}
		else
			return "Item not found";
	}

	//Calls the actions to fight the NPC
	public void fight(Battle enemy)
	{
		enemy.playerAttack();
	}
//need hell room to be ready to create this method
	public void goToHell(Room hell)
	{

		//TODO: Once room is created change the hell to the room number since 
		//what's going to be passed is an integer

	}

	//Gives options to either fight or trade 
	public void approach()
	{
		int fight = enemy.playerAttack();
		int trade  = score.Sale();

		System.out.println("Would you like to " + fight + " or " + trade );

	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		return "Player [name=" + name + ", health=" + health + ", damage="
				+ damage + ", score=" + score + ", room=" + room
				+ ", inventory=" + inventory + ", dwd=" + dwd
				+ ", getInventory()=" + getInventory() + "]";
	}


}
