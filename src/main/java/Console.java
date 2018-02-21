import Resources.InventoryItemsPrinterFormatter;
import Resources.Item;

import Resources.ItemDAOImp;

public class Console {

    public static void main(String[] args) {

        InventoryItemsPrinterFormatter inventoryItemsPrinterFormatter = new InventoryItemsPrinterFormatter();
        ItemDAOImp itemDAOImp = new ItemDAOImp();

        Item perfume = new Item("perfume", 30.00, 12.00, 50);
        Item shoes = new Item("shoes", 50.00, 25.00, 100);
        Item fans = new Item("fans", 10.00, 2.00, 90);

        itemDAOImp.addItemToInventory(perfume);
        itemDAOImp.addItemToInventory(shoes);
        itemDAOImp.addItemToInventory(fans);

        inventoryItemsPrinterFormatter.printCurrentInventory(itemDAOImp.getAllItems());



    }


}
