package Resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InventoryItemsPrinterFormatter<T> implements Reports {

    public void printCurrentInventory(ArrayList<Item> list) {
        System.out.println("Item Name\t Bought At\t    Sold At\t    AvailableQty");
        System.out.println("------------------------------------------------");
        for (Item items : list) {
            System.out.println(items);
        }
        System.out.println("------------------------------------------------");

        System.out.println(" Total Value                                 " + itemsTotalValue(list));
    }

    public void sortList(List<Item> list){
        list.sort(new CompareObj());
    }

    public Double itemsTotalValue(List<Item> list){
        Double result = 0.0;
        for(Item x: list){
            result+=x.getConstPrince();
        }
        return result;
    }

}
