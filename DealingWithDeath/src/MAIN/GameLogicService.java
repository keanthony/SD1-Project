/**
 *
 */
package MAIN;

import INVENTORY.Crack;
import INVENTORY.Item;
import PLAYER.Player;

import java.util.Random;

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

	public Boolean getPlayerAction(String actionType, String[] params)
	{
		switch (actionType)
		{
		case "ITEM":
			Item currentItem = _content.getCurrentItem();
			this._content.getPlayer().getInventory().add(currentItem);
			return true;
		case "SELL":
			int itemIndex = Integer.valueOf(params[0]);
			Crack itemForSale = (Crack) this._content.getPlayer().getInventory()
					.get(itemIndex);
			int total = this._content.getPlayer().getMoney()
					+ itemForSale.getValue();
			this._content.getPlayer().setMoney(total);
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

	public Boolean getPlayerAction(String actionType)
	{
		return getPlayerAction(actionType, null);
	}
}
