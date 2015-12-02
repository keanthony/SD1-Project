/**
 *
 */
package MAIN;

import INVENTORY.Crack;
import INVENTORY.Item;
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
	protected Player player;
	protected Random r;
	public boolean isGameOver = false;


	public GameLogicService(DWD content)
	{
		this._content = content;
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
			Item currentItem = _content.getCurrentItem();
			ArrayList<Item> inventory = this._content.getPlayer().getInventory();
			inventory.add(currentItem);
			System.out.println("\nYou found " + currentItem.getName() + ".");
			System.out.println("Item Description: " + currentItem.getDescription() + ".");
			System.out.println("You stuffed the " + currentItem.getName() + " into your backpack.");
			System.out.println("You now have " + inventory.size() + " number of items");
			return true;
		case "SELL":
			inventory = this._content.getPlayer().getInventory();
			List<Item> crackItems = inventory.stream().filter(x -> x instanceof Crack).collect(Collectors.toList());
			if (crackItems.size() > 0) {
				System.out.println("You have the following items");
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
				Crack itemToSell = (Crack) inventory.get(inputIndex);
				while (itemToSell != null) {
					System.out.println("Sorry, please input a valid number");
					inputString = scanner.next();
					itemToSell = (Crack) inventory.get(Integer.parseInt(inputString));
				}
				scanner.close();

				int total = this._content.getPlayer().getMoney() + itemToSell.getValue();
				this._content.getPlayer().getInventory().remove(itemToSell.getItemIndex());
				this._content.getPlayer().setMoney(total);
			} else {
				System.out.println("You have no items to sell");

			}
			return true;
		case "ATTACK":
			// TODO: create attack sequence here
			//TODO: Battle class
			//TODO: get result from Battle Class

			return true;
		case "MOVE":
			int currentRoomID = this._content.getRoomID();
			int nextRoomID = currentRoomID + 1;
			this._content.setRoomID(nextRoomID);
			return true;
			case "DIE":
				this._content.getPlayer().setHealth(0);
				this._content.setRoomID(24); // devil room is 24.
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
