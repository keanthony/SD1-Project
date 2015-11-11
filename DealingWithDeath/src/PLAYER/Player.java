package PLAYER;
import ROOM.*;

import java.util.ArrayList;

import INVENTORY.*;
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
	private int health;
	private ArrayList<Integer> inventory;
	private Item it;
	private Commands command;
	private Weapon weap;
	private Armor arm;
	private Crack crac;
	Room item = new Room();
	/**Constructor: Player.java
	 * Initializes object with following params.
	 * @param userName 
	 */
	public Player(String userName)
	{
		health = 100;
	}

	/**Constructor: Player.java
	 * Initializes object with following params.
	 * @param health
	 * @param inventory
	 */
	public Player(int health, ArrayList<Integer> inventory)
	{
		this.health = health;
		this.inventory = inventory;
	}

	
	/**Method Name: getWeap
	 * @return the weap
	 */
	public Weapon getWeap(int numItem)
	{

		if(item.isPresent())
		{
			
		inventory.add(numItem);
		
		}
		return weap;
	}

	
	/**Method Name: getInventory
	 * @return the inventory
	 */
	public ArrayList<Integer> getInventory()
	{
		return inventory;
	}

	public void goTo(Room room)
	{
		room.enter();
	}

	public String take(int numItem)
	{
		if(item.isPresent())
		{
			inventory.add(numItem);
		}
		
		return "Item is in your inventory";
	}
	//gives a description of the item
	public String inspect(Item inspectItem)
	{
		if(item.isPresent())
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
		Player player = new Player();
		
		if(health < 1)
		{
			player.goTo(hell);
		}
		//TODO: Once room is created change the hell to the room number since 
		//what's going to be passed is an integer

	}

	public void trade(NPC trade)
	{

	}
//Gives options to ether fight 
	public void approach(NPC enemy)
	{
		

	}

	public static String getName() {
		// TODO Auto-generated method stub
		return null;
	}


}
