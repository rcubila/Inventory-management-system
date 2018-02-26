package ResourcesTest;

import Resources.InventoryItemsPrinterFormatter;
import Resources.Item;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class InventoryItemsPrinterFormatterTest {

    InventoryItemsPrinterFormatter iFormater = new InventoryItemsPrinterFormatter();
    Item item = new Item();

    @Test
    public void sortListTest() {

        List<Item> myItems = new ArrayList<>();
        myItems.add(new Item("b", 1.00, 2.00, 5));
        myItems.add(new Item("c", 1.00, 2.00, 5));
        myItems.add(new Item("a", 1.00, 2.00, 5));

        String expected = "";
        iFormater.sortList(myItems);
        for (int i = 0; i < myItems.size(); i++) {
            expected = myItems.get(0).getItemName();
        }
        String actual = "a";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void itemsTotalValue(){

        List<Item> myList = new ArrayList<>();

        myList.add( new Item("bread", 10.00, 5.00, 3));
        myList.add(new Item("haedphones", 30.00, 10.00, 2));
        Double expected = 15.00;
        Double actual = iFormater.itemsTotalValue(myList);
        Assert.assertEquals(expected, actual, 0);


    }
}
