package Resources;

import java.util.UUID;

public class Item {


    private double sellingPrice;
    private double constPrince;
    private String itemName;
    private int itemQuantity;

    public Item() { }

    public Item( String itemName, double sellingPrice, double constPrince, int itemQuantity) {

        this.sellingPrice = sellingPrice;
        this.itemName = itemName;
        this.setItemQuantity(itemQuantity);
        this.constPrince = constPrince;
    }

    public double getConstPrince() {
        return constPrince;
    }

    public void setConstPrince(double constPrince) {
        this.constPrince = constPrince;
    }


    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    @Override
    public String toString() {


        return  itemName + "\n" ;
    }
}

