package Resources;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItemDAO {

    private List<Item> itemList = new ArrayList<Item>();

    public List<Item> getAllItems() {
        return itemList;
    }

    public void addItemToInventory(Item item) {
        itemList.add(item);
    }

    public void deleteItemByname(String itemName) {
        Iterator<Item> it = itemList.iterator();
        while (it.hasNext()) {
            Item next = it.next();
            if (next.getItemName().equalsIgnoreCase(itemName)) {
                it.remove();
            }
        }
    }

    public void updateAndIncreaseItemQuantity(String itemName, int quantityPurchased) {
        for (Item x : itemList) {
            if (x.getItemName().equalsIgnoreCase(itemName)) {
                int newItemQuantity = x.getItemQuantity() + quantityPurchased;
                x.setItemQuantity(newItemQuantity);
            }
        }
    }

    public void deductItemSoldFromInventory(String itemName, int amountOfItemSold) {
        for (Item x : itemList) {
            if (x.getItemName().equalsIgnoreCase(itemName)) {
                if (x.getItemQuantity() >= amountOfItemSold) {
                    int itemLeftInventory = x.getItemQuantity() - amountOfItemSold;
                    x.setItemQuantity(itemLeftInventory);
                } else {
                    System.out.println("Sorry Mr. X you have " + x.getItemQuantity() + " in your inventory");
                }
            } else {
                System.out.println("The Item's name requested doesn't exist in your inventory...");
            }
        }
    }

    public void reduceItemSellingPrice(String itemName, double sellingPrince) {
        for (Item x : itemList) {
            if (x.getItemName().equalsIgnoreCase(itemName)) {
                x.setSellingPrice(sellingPrince);
            }
        }
    }

    @Override
    public String toString() {
        String str = "";
        for(Item d : itemList) {
            str+=d.toString();
        }
        return str;
    }
}
