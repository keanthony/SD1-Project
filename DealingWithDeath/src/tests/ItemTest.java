package tests;

import INVENTORY.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by jortiz on 11/18/15.
 */
public class ItemTest {

    public class testWeapon extends Item {

        public testWeapon() {
            super();
        }

        public testWeapon(int index, String name, String description) {
            super(index, name, description);
        }

        @Override
        public String equipItem() {
            return "this test weapon can not be equipped";
        }
    }

    Item _item;

    @Before
    public void setUp() {

        _item = new testWeapon(0, "name", "description");
    }


    @Test
    public void testItemConstructorInitsDefaults() throws Exception {
        //arrange
        _item = new testWeapon();
        //act
        //assert
        assertTrue(_item.getName().equals(""));
        assertTrue(_item.getItemIndex() == 0);
        assertTrue(_item.getDescription().equals(""));
    }

    @Test
    public void testGetItemIndex() throws Exception {
        //arrange
        //act
        int result = _item.getItemIndex();
        //assert
        assertTrue(result == 0);
    }

    @Test
    public void testGetDescription() throws Exception {
        //arrange
        //act
        boolean result = _item.getDescription().equals("description");
        //assert
        assertTrue(result);
    }

    @Test
    public void testGetName() throws Exception {
        //arrange
        //act
        String result = _item.getName();
        //assert
        assertTrue(result.equals("name"));
    }

    @Test
    public void testEquipItem() throws Exception {
        //arrange
        //act
        String result = _item.equipItem();
        //assert
        assertTrue(result.equals("this test weapon can not be equipped"));
    }

    @Test
    public void testToString() throws Exception {
        //arrange
        //act
        String itemToStringResult = _item.toString();
        boolean result = "Item [itemIndex=0, name=name, description=description]".equals(itemToStringResult);
        //assert
        assertTrue(result);
    }
}