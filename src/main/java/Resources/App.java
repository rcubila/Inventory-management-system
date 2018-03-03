package Resources;

import Resources.CompareObj;
import Resources.InventoryItemsPrinterFormatter;
import Resources.Item;
import Resources.ItemDAOImp;

import java.util.Scanner;

public class App {

    private static String userNameInput = "";
    private static String userPassInput = "";
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        InventoryItemsPrinterFormatter inventoryItemsPrinterFormatter = new InventoryItemsPrinterFormatter();
        ItemDAOImp itemDAOImp = new ItemDAOImp();

        Item perfume = new Item("perfume", 30.00, 12.00, 50);
        Item shoes = new Item("shoes", 50.00, 25.00, 100);
        Item fans = new Item("fans", 10.00, 2.00, 90);
        Item ants = new Item("ants", 5.00, 2.00, 1000);

        itemDAOImp.addItemToInventory(perfume);
        itemDAOImp.addItemToInventory(shoes);
        itemDAOImp.addItemToInventory(fans);
        itemDAOImp.addItemToInventory(ants);


        // inventoryItemsPrinterFormatter.printCurrentInventory(itemDAOImp.getAllItems());

        System.out.println("User Name please...");



        userNameInput = scanner.next();

        userPassInput = scanner.next();


    }



    public boolean userNameCheck(String userName) {

        return "123".equalsIgnoreCase(userName);
    }

    public boolean userPasswordCheck(String userPass) {

        return "111".equalsIgnoreCase(userPass);
    }


    private void MenuOption() {

        System.out.println("what would you like to do " + userNameInput);
        System.out.println("add a new Item including ''CostPrice and Selling price...");
        System.out.println("deleted item from your inventory...");
        System.out.println("");


    }


}
