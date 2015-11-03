package MAIN;
import java.util.ArrayList;

import INVENTORY.Inventory;
import NPC.NPC;
import PLAYER.Player;
import ROOM.Riddle;
import ROOM.Room;
/**Class: Weapon.java
 * @author: Kevin Anthony
 * @version: 1.0
 * Course : ITEC 3860 Fall 2015 Dr. Johnson
 * Date Written: Oct 30, 2015
 * Class Description: Main Class
 * Purpose: Creates the game, handles saving and loading, generates Rooms
 * Monsters, and Puzzles
 */


public class DealingWithDeath
{
	protected ArrayList<Room> roomAL = new ArrayList<Room>();
	protected ArrayList<NPC> npcAL = new ArrayList<NPC>();
	protected ArrayList<Riddle> riddleAL = new ArrayList<Riddle>();
	protected ArrayList<String> roomDescriptionsAL = new ArrayList<String>();
	protected Player myPlayer;
	private String options;
	private int health;
	private String name;
	private int damage;
	private Inventory bag;
	private int money;
	private String tutorial;
	private String listOfPlayers;

	/**Constructor: DealingWithDeath.java
	 * Initializes object with following params.
	 * @param roomAL
	 * @param npcAL
	 * @param riddleAL
	 */
	public DealingWithDeath(ArrayList<Room> roomAL, ArrayList<NPC> npcAL,
			ArrayList<Riddle> riddleAL)
	{
		this.roomAL = roomAL;
		this.npcAL = npcAL;
		this.riddleAL = riddleAL;
	}
	public void makeNPC()
	{
		//TODO: Generate NPC descriptions/stats
	}
	public void makeRiddle()
	{
		//TODO: Generate Puzzle Data
	}
	public void makeItem()
	{
		//TODO: Generate Item Data
	}
	public void makeRoom()
	{
		//TODO: Generate rooms
	}
	public String newGame()
	{
		return null;
	}

	public void save()
	{

	}

	public String load()
	{
		return null;
	}

	public void enterUserName(String userName)
	{

	}

	public void initPlayer(Player player)
	{

	}

	public String help()
	{
		return null;
	}

}
