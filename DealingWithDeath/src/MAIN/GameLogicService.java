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
	private Random r;
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
		this._content.initialize(name);
	}
	
	

	public Boolean setPlayerAction(String actionType, String[] params)
	{
		Player player = this._content.getPlayer();
		switch (actionType)
		{
		case "ITEM":
			NPC currentNPC = _content.getCurrentNPC();
			if (currentNPC.isFriendly() || currentNPC.getHealth() <= 0)
			{
				Item currentItem = _content.getCurrentItem();
				ArrayList<Item> inventory = player.getInventory();
				inventory.add(currentItem);
				System.out
						.println("\nYou found " + currentItem.getName() + ".");
				System.out.println("Item Description: "
						+ currentItem.getDescription() + ".");
				System.out.println("You stuffed the " + currentItem.getName()
						+ " into your backpack.");
				System.out.println("You now have " + inventory.size()
						+ " number of items");
				return true;
			}
			if (currentNPC.getHealth() > 0)
			{
				System.out.println(
						"Someone is blocking our way and they dont look too happy, \n"
								+ "but we must get to the item! It could be worth money!");
				try
				{
					
					DWD omgSound = new DWD();
					omgSound.sound();
					Thread.sleep(6000);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return true;
			}
			return true;

			
		case "SELL":

			ArrayList<Item> inventory = player.getInventory();
			List<Item> crackItems = inventory.stream()
					.filter(x -> x instanceof Crack)
					.collect(Collectors.toList());
			if (crackItems.size() > 0)
			{
				System.out.println("\nYou have the following items");
				for (Item item : crackItems)
				{
					System.out.println(item.getItemIndex() + " "
							+ item.getName() + " - " + item.getDescription());
				}
				System.out.println("\n What do you want to sell?");
				System.out.println("Please enter an item index value");
				String inputString = _scanner.next();
				Boolean isValidItemIndex = false;
				while (!isValidItemIndex)
				{
					int inputIndex = Integer.parseInt(inputString);
					ArrayList<Item> filteredItems = new ArrayList<>(
							player.getInventory().stream()
									.filter(x -> x.getItemIndex() == inputIndex)
									.collect(Collectors.toList()));
					if (filteredItems.size() == 1)
					{
						Crack itemToSell = (Crack) inventory.stream()
								.filter(x -> x.getItemIndex() == inputIndex)
								.findFirst().get();
						int sellValue = itemToSell.getValue();
						System.out.println(
								"Selling your crack for $ " + sellValue + " .");
						int total = player.getMoney() + sellValue;
						ArrayList<Item> filteredList = new ArrayList<>(player
								.getInventory().stream()
								.filter(x -> x.getItemIndex() != itemToSell
										.getItemIndex())
								.collect(Collectors.toList()));
						player.setInventory(filteredList);
						player.setMoney(total);
						System.out.println("You have a total of $" + total);
						isValidItemIndex = true;
						return true;
					}
				}
			}
			else
			{
				System.out.println("You have no items to sell");
			}
			return true;
		case "ATTACK":
			Battle b = new Battle(this._content);
			if (!b.StartBattle())
			{
				this.setPlayerAction("DIE");
			}
			return true;
		case "MOVE":
			int currentRoomID = this._content.getRoomID();
			int nextRoomID = currentRoomID + 1;
			this._content.setRoomID(nextRoomID);
			return true;
		case "SAVE":
			LoginMainGUI save = new LoginMainGUI();
			save.saveGame();
			return true;
		case "END":
			System.exit(0);
			return true;
		case "DIE":
			player.setHealth(0);
			this._content.setRoomID(24); // devil room is 24.
			System.out.println("Welcome to Hell.");
			return true;
		case "RIDDLE":
			System.out.println("Riddle");
			System.out.println(this._content.getCurrentRiddle().getQuestion());
			System.out.println("Please enter an item index value");
			String inputString = _scanner.next();
			//TODO: validate input
			int inputIndex = Integer.parseInt(inputString);
			String result = this._content.getCurrentRiddle()
					.checkAnswer(inputIndex, this._content.getRoomID());
			System.out.println(result);
			Boolean isCorrect = _content.getCurrentRiddle().isCorrect();
			while (!isCorrect)
			{
				System.out.println("Please enter an item index value");
				inputString = _scanner.next();
				inputIndex = Integer.parseInt(inputString);
				result = this._content.getCurrentRiddle()
						.checkAnswer(inputIndex, this._content.getRoomID());
				System.out.println(result);
				isCorrect = _content.getCurrentRiddle().isCorrect();
				//TODO: validate input

			}
			System.out.println("Your life has been reset to 100");
			player.setHealth(100);
			int previousAliveRoomID = DWD.roomHistoryAl
					.get(DWD.roomHistoryAl.size() - 1).getRoomId();
			System.out.println("Welcome back to the room you died in room "
					+ previousAliveRoomID);
			this._content.setRoomID(previousAliveRoomID);
			return true;

		default:
			return false;
		}
	}

	public int playerAttack()
	{
		return (int) (_content.getCurrentNPC().getHealth() - Math.ceil(
				_content.getPlayer().getDamage() * (.33) * (r.nextInt(4) + 1)
						+ 1));

	}

	public Boolean setPlayerAction(String actionType)
	{
		return setPlayerAction(actionType, null);
	}
}
