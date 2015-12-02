package PLAYER;

import INVENTORY.Item;
import MAIN.DWD;
import ROOM.Room;

import java.io.Serializable;
import java.util.ArrayList;

/**Class: Player.java
 * @author: Samuel Medina
 * @collaborator: Kevin Anthony
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Oct 30, 2015
 * Class Description: Player class
 * Purpose: Generate and handle Player interactions
 */

public class Player implements Serializable
{
	private String name;
	private int health;
	private int damage;
	private Score score;
	private Room room;
	private ArrayList<Item> inventory;
	private DWD dwd;
	private int money;
	protected Battle enemy;
	private Item it;

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
	public String getWeap()
	{
		if (room.isPresent(it))
		{
			inventory.add(it);
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
	 * @param lastRoom
	 */
	public void goTo(int lastRoom)
	{
		room.enter(lastRoom);
	}

	/**
	 * take
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

	public String getName() {
		return this.name;

	}

	public void setInventory(ArrayList<Item> inventoryList) {
		this.inventory = inventoryList;
	}
}
