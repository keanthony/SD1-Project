package tests;

import INVENTORY.Crack;
import INVENTORY.Item;
import MAIN.DWD;
import MAIN.GameLogicService;
import PLAYER.Player;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;


public class GameLogicServiceTest {


	private GameLogicService gls;

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
		Boolean isSuccessful = gls.getPlayerAction(actionType);
		Assert.assertTrue(isSuccessful);
		int inventorySize = gls.getContent().getPlayer().getInventory().size();
        List<Item> inventory = gls.getContent().getPlayer().getInventory();
		Assert.assertTrue(inventorySize == 2);
	}

	@Test
	public void getPlayerAction_Move_ChangeToTheNextRoom(){
		String actionType = "MOVE";
		Boolean isSuccessful = gls.getPlayerAction(actionType);
		Assert.assertTrue(1 == gls.getContent().getRoomID());
		Assert.assertTrue(isSuccessful);
	}


	@Test
	public void getPlayerAction_SELL_RemovesItemFromList(){
		String actionType = "SELL";
		String[] params = new String[]{"0"};
		Boolean isSuccessful = gls.getPlayerAction(actionType, params);
		int playerMoney = gls.getContent().getPlayer().getMoney();
		Assert.assertTrue(1100 == playerMoney);
		Assert.assertTrue(isSuccessful);
	}

	@Test
	public void getPlayerAction_InvalidParameter_ReturnsFalse(){
		String actionType = "InvalidParamater";
		Boolean isSuccessful = gls.getPlayerAction(actionType);
		Assert.assertFalse(isSuccessful);
	}

}
