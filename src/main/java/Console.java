import Resources.Item;
import Resources.ItemDAO;

import java.util.Iterator;
import java.util.UUID;

public class Console {

    public static void main(String[] args) {

        ItemDAO itemDAO = new ItemDAO();

        Item perfume = new Item("perfume", 30, 12, 50 );
        Item shoes = new Item("shoes", 50, 25, 100 );
        Item fans = new Item("fans", 10, 2, 90 );

        itemDAO.addItemToInventory(perfume);
        itemDAO.addItemToInventory(shoes);
        itemDAO.addItemToInventory(fans);
        System.out.println(itemDAO);
    }
}
