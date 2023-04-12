public class ItemToPurchase {
    private String itemName;
     private int itemPrice;
     private int itemQuantity;
  
  public ItemToPurchase() {
    itemName = "none";
    itemPrice = 0;
    itemQuantity = 0;
    return;
  }
  //sets item name string
  public void setName(String name) {
    this.itemName = name;
  }
  //sets price integer
  public void setPrice(int price) {
     this.itemPrice = price;
  }
  //sets quantity of items integer
  public void setQuantity (int quantity) {
     this.itemQuantity = quantity;      
  }
  //gets name from input
  public String getName() {
    return itemName;
  }
  //gets price of item from input
  public int getPrice() {
    return itemPrice;
  }
  //gets quantity of items
  public int getQuantity() {
     return itemQuantity;
  }
  //prints the price of the items combined
  public void printItemPurchase() {
    System.out.println(itemQuantity + " " + itemName + " $" + itemPrice +  " = $" + (itemPrice * itemQuantity));
  }
  } 
  