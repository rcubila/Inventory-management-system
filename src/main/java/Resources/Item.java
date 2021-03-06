package Resources;

public class Item {
    private Double sellingPrice;
    private Double constPrince;
    private String itemName;
    private Integer itemQuantity;
    private Integer totalValue;

    public Item() {
    }

    public Item(String itemName, Double sellingPrice, Double constPrince, Integer itemQuantity) {

        this.sellingPrice = sellingPrice;
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
        this.constPrince = constPrince;

    }

    public Integer getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }

    public Double getConstPrince() {
        return constPrince;
    }

    public void setConstPrince(Double constPrince) {
        this.constPrince = constPrince;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(Integer itemQuantity) {
        this.itemQuantity = itemQuantity;
    }


    @Override
    public String toString() {
        return
                String.format("%-15s%-15s%-15s%-15s  ", itemName, constPrince, sellingPrice, itemQuantity);
    }
}

