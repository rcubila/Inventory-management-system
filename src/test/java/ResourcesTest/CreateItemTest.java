package ResourcesTest;


import Resources.Item;
import Resources.ItemDAO;
import org.junit.Assert;
import org.junit.Test;

import java.util.UUID;

public class CreateItemTest {

    ItemDAO itemDAO = new ItemDAO();

    @Test
    public void createItemTest() {

        Item shirt = new Item("fans", 10, 2, 90);
        itemDAO.addItemToInventory(shirt);
        //createItem.createNewItem(shirt);
        int expect = 1;
        int actual = itemDAO.getAllItems().size();
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void deleteItemByNameTest() {
        Item shirt = new Item("shirt", 30, 12, 50  );
        Item pants = new Item("pants", 50, 25, 100);
        Item pen = new Item("pen", 10, 2, 90);
        itemDAO.addItemToInventory(shirt);
        itemDAO.addItemToInventory(pants);
        itemDAO.addItemToInventory(pen);
        itemDAO.deleteItemByname("shirt");
        int expected = 2;
        int actual = itemDAO.getAllItems().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void updateAndIncreaseItemQuantityTest() {
        Item pen = new Item("pen", 10, 2, 90);
        itemDAO.addItemToInventory(pen);
        itemDAO.updateAndIncreaseItemQuantity("pen", 3);
        int expected = 93;
        for (Item x : itemDAO.getAllItems()) {
            int itemQuantity = x.getItemQuantity();
            Assert.assertEquals(expected, itemQuantity);
        }
    }

    @Test
    public void deductItemSoldFromInventoryTest() {
        Item pants = new Item("pants", 10, 2, 20);
        itemDAO.addItemToInventory(pants);
        itemDAO.deductItemSoldFromInventory("pants", 3);
        int expected = 17;
        for (Item x : itemDAO.getAllItems()) {
            int itemQuantity = x.getItemQuantity();
            Assert.assertEquals(expected, itemQuantity);
        }
    }

    @Test
    public void reduceItemSellingPriceTest() {
        Item hats = new Item("hats", 16, 15, 90);
        itemDAO.addItemToInventory(hats);
        itemDAO.reduceItemSellingPrice("hats", 12);
        int expected = 12;
        for (Item x : itemDAO.getAllItems()) {
            double itemNewPrince = x.getSellingPrice();
            Assert.assertEquals(expected, itemNewPrince, 0);
        }
    }
}


