package Resources;

import java.util.ArrayList;

public interface RepositoryDao<T> {

    ArrayList<T> getAllItems();

    void addItemToInventory(T item);

    void deleteItemByName(String itemName);

    void updateAndIncreaseItemQuantity(String itemName, Integer quantityPurchased);

    void deductItemSoldFromInventory(String itemName, Integer amountOfItemSold);

    void reduceItemSellingPrice(String itemName, Double sellingPrince);
}
