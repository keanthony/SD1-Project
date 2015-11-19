/**
 * 
 */
package MAIN;

import INVENTORY.Crack;
import INVENTORY.Item;
import PLAYER.Player;
import ROOM.Room;

/**
 * 
 * @author jortiz
 *
 */
public class GameLogicService {
	
	private final DWD _content;
	
	public GameLogicService(DWD content){
		this._content = content;
	}
	
	public DWD getContent(){
		return _content;
	}
	
	public void intit() {
		this._content.Initialize();
	}

	public Boolean getPlayerAction(String actionType, String[] params) {
		switch(actionType){
		case "ITEM":
			Item currentItem = _content.getCurrentItem();
			this._content.getPlayer().getInventory().add(currentItem);
			return true;
		case "SELL":
			int itemIndex = Integer.valueOf(params[0]);
			Crack itemForSale = (Crack) this._content.getPlayer().getInventory().get(itemIndex);
			int total = this._content.getPlayer().getMoney() + itemForSale.getValue();
			this._content.getPlayer().setMoney(total);
			return true;
		case "ATTACK":
			// TODO: create attack sequence here
		    return true;
		case "MOVE":
			int currentRoomID = this._content.getRoomID();
			int nextRoomID = currentRoomID + 1;
			this._content.setRoomID(nextRoomID);
			return true;
		default:
			return false;
		}
	}
	
	public Boolean getPlayerAction(String actionType) {
		return getPlayerAction(actionType, null);
	}
}
