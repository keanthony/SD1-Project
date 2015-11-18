package tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import INVENTORY.Crack;
import INVENTORY.Item;
import MAIN.DWD;
import MAIN.GameLogicService;
import PLAYER.Player;
import ROOM.Room;


public class GameLogicServiceTest {

	
	GameLogicService gls;
	
	/**Method Name: setUp
	 * Description: TODO 
	 * @throws java.lang.Exception
	 */

	@Before
	public void setUp() throws Exception
	{
		
		Player currentPlayer = new Player("joe");
		currentPlayer.getInventory().add(new Crack(0,"itemName", "description", 100));
		DWD content = new DWD(currentPlayer);
		gls = new GameLogicService(content);
		gls.intit();
	}
	
	@Test
	public void getPlayerAction_WithItem_ShouldAddItemToPlayersInventory(){
		String actionType = "ITEM";
		Boolean isSuccesseful = gls.getPlayerAction(actionType);
		Assert.assertTrue(true == isSuccesseful);
		Assert.assertTrue(1 == gls.getContent().getPlayer().getInventory().size());
	}
	
	@Test
	public void getPlayerAction_Move_ChangeToTheNextRoom(){
		String actionType = "MOVE";
		Boolean isSuccesseful = gls.getPlayerAction(actionType);
		Assert.assertTrue(1 == gls.getContent().getRoomID());
		Assert.assertTrue(true == isSuccesseful);
	}
	
	
	@Test
	public void getPlayerAction_SELL_RemovesItemFromList(){
		String actionType = "SELL";
		String[] params = new String[]{"0"};
		Boolean isSuccesseful = gls.getPlayerAction(actionType, params);
		int playerMoney = gls.getContent().getPlayer().getMoney();
		Assert.assertTrue(1100 == playerMoney);
		Assert.assertTrue(true == isSuccesseful);
	}
	
}
