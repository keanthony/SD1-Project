package PLAYER;
import java.io.Serializable;
import java.util.ArrayList;

import INVENTORY.Item;
import MAIN.DWD;
import ROOM.Room;


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


	/**
	 * 
	 */
	public Player()
	{
		name = "";
		health = 100;
		damage = 5;
		score = new Score();
		room = new Room();
		inventory = new ArrayList<Item>();
		dwd = new DWD();
		money = 0;
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
		room = new Room();
		inventory = new ArrayList<Item>();
		dwd = new DWD();
		money = 0;
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
		money = 0;
	}

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
	public void setDamage(int damage) {
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
		else
			return "Item not found";
	}

	//Calls the actions to fight the NPC
	public void fight(Battle enemy)
	{
		enemy.playerAttack();
	}
	
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
			
			//Gives options to either fight or trade 
			public void approach(NPC enemy)
			{
			
			}
			
			public static String getName() {
			// TODO Auto-generated method stub
			return null;
			}
			
			
			}
			*/

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Player [name=" + name + ", health=" + health + ", damage="
				+ damage + ", score=" + score + ", room=" + room
				+ ", inventory=" + inventory + ", dwd=" + dwd
				+ ", getInventory()=" + getInventory() + "]";
	}
	
}
