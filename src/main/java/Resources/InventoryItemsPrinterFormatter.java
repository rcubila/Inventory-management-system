package Resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class InventoryItemsPrinterFormatter implements Reports {

    public void printCurrentInventory(ArrayList<Item> list) {
        System.out.println("Item Name\t Bought At\t    Sold At\t    AvailableQty");
        System.out.println("------------------------------------------------");
        for (Item items : list) {
            System.out.println(items);
        }
        System.out.println("------------------------------------------------");


    }





}
