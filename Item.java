public class Item {
    String itemName;
    double itemPrice;

    Item(String name, double price) {
        this.itemName = name;
        this.itemPrice = price;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
    public double getItemPrice() {
        return itemPrice;
    }
    
}
