package Resources;

import java.util.ArrayList;
import java.util.Iterator;

public class ItemDAOImp implements RepositoryDao<Item> {

    private ArrayList<Item> itemList = new ArrayList<>();

    public ItemDAOImp() {}

    @Override
    public ArrayList<Item> getAllItems() {
        return itemList;
    }

    @Override
    public void addItemToInventory(Item item) {
        itemList.add(item);
    }

    @Override
    public void deleteItemByName(String itemName) {
        Iterator<Item> it = itemList.iterator();
        while (it.hasNext()) {
            Item next = it.next();
            if (next.getItemName().equalsIgnoreCase(itemName)) {
                it.remove();
            }
        }
    }

    @Override
    public void updateAndIncreaseItemQuantity(String itemName, Integer quantityPurchased) {
        for (Item x : itemList) {
            if (x.getItemName().equalsIgnoreCase(itemName)) {
                int newItemQuantity = x.getItemQuantity() + quantityPurchased;
                x.setItemQuantity(newItemQuantity);
            }
        }
    }

    @Override
    public void deductItemSoldFromInventory(String itemName, Integer amountOfItemSold) {
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

    @Override
    public void reduceItemSellingPrice(String itemName, Double sellingPrince) {
        for (Item x : itemList) {
            if (x.getItemName().equalsIgnoreCase(itemName)) {
                x.setSellingPrice(sellingPrince);
            }
        }
    }
}
