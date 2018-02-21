package ResourcesTest;


import Resources.Item;
import Resources.ItemDAOImp;
import org.junit.Assert;
import org.junit.Test;

public class CreateItemTest {

    ItemDAOImp itemDAOImp = new ItemDAOImp();

    @Test
    public void createItemTest() {

        Item shirt = new Item("fans", 10.00, 2.00, 90);
        itemDAOImp.addItemToInventory(shirt);
        //createItem.createNewItem(shirt);
        int expect = 1;
        int actual = itemDAOImp.getAllItems().size();
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void deleteItemByNameTest() {
        Item shirt = new Item("shirt", 30.00, 12.00, 50  );
        Item pants = new Item("pants", 50.00, 25.00, 100);
        Item pen = new Item("pen", 10.00, 2.00, 90);
        itemDAOImp.addItemToInventory(shirt);
        itemDAOImp.addItemToInventory(pants);
        itemDAOImp.addItemToInventory(pen);
        itemDAOImp.deleteItemByName("shirt");
        int expected = 2;
        int actual = itemDAOImp.getAllItems().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void updateAndIncreaseItemQuantityTest() {
        Item pen = new Item("pen", 10.00, 2.00, 90);
        itemDAOImp.addItemToInventory(pen);
        itemDAOImp.updateAndIncreaseItemQuantity("pen", 3);
        int expected = 93;
        for (Item x : itemDAOImp.getAllItems()) {
            int itemQuantity = x.getItemQuantity();
            Assert.assertEquals(expected, itemQuantity);
        }
    }

    @Test
    public void deductItemSoldFromInventoryTest() {
        Item pants = new Item("pants", 10.00, 2.00, 20);
        itemDAOImp.addItemToInventory(pants);
        itemDAOImp.deductItemSoldFromInventory("pants", 3);
        int expected = 17;
        for (Item x : itemDAOImp.getAllItems()) {
            int itemQuantity = x.getItemQuantity();
            Assert.assertEquals(expected, itemQuantity);
        }
    }

    @Test
    public void reduceItemSellingPriceTest() {
        Item hats = new Item("hats", 16.00, 15.00, 90);
        itemDAOImp.addItemToInventory(hats);
        itemDAOImp.reduceItemSellingPrice("hats", 12.00);
        int expected = 12;
        for (Item x : itemDAOImp.getAllItems()) {
            double itemNewPrince = x.getSellingPrice();
            Assert.assertEquals(expected, itemNewPrince, 0);
        }
    }
}


