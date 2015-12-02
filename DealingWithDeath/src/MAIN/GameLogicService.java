/**
 *
 */
package MAIN;

import INVENTORY.Crack;
import INVENTORY.Item;
import NPC.NPC;
import PLAYER.Battle;
import PLAYER.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author jortiz
 *
 */
public class GameLogicService
{

	private final DWD _content;
	private final Scanner _scanner;
	protected Player player;
	protected Random r;
	public boolean isGameOver = false;


	public GameLogicService(DWD content, Scanner scanner)
	{
		this._content = content;
		this._scanner = scanner;
	}

	public DWD getContent()
	{
		return _content;
	}

	public void init(String name)
	{
		this._content.Initialize(name);
	}

	public Boolean setPlayerAction(String actionType, String[] params)
	{
		switch (actionType)
		{
		case "ITEM":
			NPC currentNPC = _content.getCurrentNPC();
			if (currentNPC.isFriendly() || currentNPC.getHealth() <= 0) {
				Item currentItem = _content.getCurrentItem();
				ArrayList<Item> inventory = this._content.getPlayer().getInventory();
				inventory.add(currentItem);
				System.out.println("\nYou found " + currentItem.getName() + ".");
				System.out.println("Item Description: " + currentItem.getDescription() + ".");
				System.out.println("You stuffed the " + currentItem.getName() + " into your backpack.");
				System.out.println("You now have " + inventory.size() + " number of items");
				return true;
			}
			if (currentNPC.getHealth() > 0) {
				System.out.println("The monster is blocking the path to an item. Looks like we need to fight it");
				return true;
			}
			return true;

		case "SELL":
			ArrayList<Item> inventory = this._content.getPlayer().getInventory();
			List<Item> crackItems = inventory.stream().filter(x -> x instanceof Crack).collect(Collectors.toList());
			if (crackItems.size() > 0) {
				System.out.println("\nYou have the following items");
				for (Item item : crackItems) {
					item = (Crack) item;
					String index = item.getItemIndex() + "";
					String name = item.getName();
					System.out.println(item.getItemIndex() + " " + item.getName() + " - " + item.getDescription());
				}
				System.out.println("\n What do you want to sell?");
				// create a scanner so we can read the command-line input
				Scanner scanner = new Scanner(System.in);
				String inputString = scanner.next();
				System.out.println("Please enter an item index value");
				int inputIndex = Integer.parseInt(inputString);
				Crack itemToSell = (Crack) inventory.stream().filter(x -> x.getItemIndex() == inputIndex).findFirst().get();
				int sellValue = itemToSell.getValue();
				System.out.println("Selling your crack for $ " + sellValue + " .");
				int total = this._content.getPlayer().getMoney() + sellValue;
				ArrayList<Item> filteredList = new ArrayList<Item>(this._content.getPlayer().getInventory().stream().filter(x -> x.getItemIndex() != itemToSell.getItemIndex()).collect(Collectors.toList()));
				this._content.getPlayer().setInventory(filteredList);
				this._content.getPlayer().setMoney(total);
				System.out.println("You have a total of $" + total);
			} else {
				System.out.println("You have no items to sell");

			}
			return true;
		case "ATTACK":
			Battle b = new Battle(this._content);
			if (!b.StartBattle()) {
				this.setPlayerAction("DIE");
			}
			;
			return true;
		case "MOVE":
			int currentRoomID = this._content.getRoomID();
			int nextRoomID = currentRoomID + 1;
			this._content.setRoomID(nextRoomID);
			return true;
			case "DIE":
				this._content.getPlayer().setHealth(0);
				this._content.setRoomID(24); // devil room is 24.
				System.out.println("Welcome to Hell.");
				return true;

		default:
			return false;
		}
	}

	public int playerAttack()
	{
		return (int) (_content.getCurrentNPC().getHealth() - Math
				.ceil(_content.getPlayer().getDamage() * (.33) * (r.nextInt(4) + 1) + 1));

	}

	public Boolean setPlayerAction(String actionType)
	{
		return setPlayerAction(actionType, null);
	}
}
