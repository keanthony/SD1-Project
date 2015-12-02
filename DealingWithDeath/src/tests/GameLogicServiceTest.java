package tests;

import INVENTORY.Crack;
import MAIN.DWD;
import MAIN.GameLogicService;
import PLAYER.Player;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


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
		gls.init(currentPlayer.getName());
	}

	@Test
	public void getPlayerAction_WithItem_ShouldAddItemToPlayersInventory(){
		String actionType = "ITEM";
		Boolean isSuccessful = gls.setPlayerAction(actionType);
		Assert.assertTrue(isSuccessful);
		int inventorySize = gls.getContent().getPlayer().getInventory().size();
		Assert.assertTrue(inventorySize == 2);
	}

	@Test
	public void getPlayerAction_Move_ChangeToTheNextRoom(){
		String actionType = "MOVE";
		Boolean isSuccessful = gls.setPlayerAction(actionType);
		Assert.assertTrue(1 == gls.getContent().getRoomID());
		Assert.assertTrue(isSuccessful);
	}

    @Test
    public void getPlayerAction_Attack_ShouldReturnTrue() {
        String actionType = "ATTACK";
		Boolean isSuccessful = gls.setPlayerAction(actionType);
		Assert.assertTrue(isSuccessful);
    }


	@Test
	public void getPlayerAction_SELL_RemovesItemFromList(){
		String actionType = "SELL";
		String[] params = new String[]{"0"};
		Boolean isSuccessful = gls.setPlayerAction(actionType, params);
		int playerMoney = gls.getContent().getPlayer().getMoney();
		Assert.assertTrue(1100 == playerMoney);
		Assert.assertTrue(isSuccessful);
	}

	@Test
	public void getPlayerAction_InvalidParameter_ReturnsFalse(){
		String actionType = "InvalidParamater";
		Boolean isSuccessful = gls.setPlayerAction(actionType);
		Assert.assertFalse(isSuccessful);
	}

	@Test
	public void getPlayerAction_DIE_setsPlayerHealthToZero() {
		String actionType = "DIE";
		Boolean isSuccessful = gls.setPlayerAction(actionType);
		Assert.assertTrue(isSuccessful);
		Assert.assertTrue(gls.getContent().getPlayer().getHealth() == 0);

	}

}
