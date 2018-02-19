package Resources;

import java.util.List;

public interface ItemManipulation {
    List<Item> getAllItems();

    void addItemToInventory(Item item);
}
