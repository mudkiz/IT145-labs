import java.util.Scanner;

public class ShoppingCartPrinter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int i = 0;
      String productName;
      int productPrice = 0;
      int productQuantity = 0;
      int cartTotal = 0;
  
      ItemToPurchase item1 = new ItemToPurchase();
      ItemToPurchase item2 = new ItemToPurchase();
//stores item names, prices and, quantites based on input for item 1
   System.out.println("Item 1");
   System.out.println("Enter the item name: ");
   productName = scnr.nextLine();                                       

   System.out.println("Enter the item price: ");
   productPrice = scnr.nextInt();                                         

   System.out.println("Enter the item quantity: ");
   productQuantity = scnr.nextInt();                                      
   System.out.println("");
//sets the item names prices and quantities based on input for item 1
   item1.setName(productName);
   item1.setPrice(productPrice);
   item1.setQuantity(productQuantity);
//stores the item names prices and quantities based on input for item 2
   System.out.println("Item 2");
   System.out.println("Enter the item name: ");
   scnr.nextLine();
   productName = scnr.nextLine();                                         

   System.out.println("Enter the item price: ");
   productPrice = scnr.nextInt();                                        

   System.out.println("Enter the item quantity: ");
   productQuantity = scnr.nextInt();                                      
   System.out.println("");
//name setters for the product names, prices, and quantities for item 2
  item2.setName(productName);
  item2.setPrice(productPrice);
  item2.setQuantity(productQuantity);

  cartTotal = (item1.getPrice() * item1.getQuantity()) + (item2.getPrice() * item2.getQuantity());
//prints the total cost of all the items combined after getting the price, quantity, and name of all the items
  System.out.println("TOTAL COST");
  System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice()  + " = $" + (item1.getPrice() * item1.getQuantity()));

  System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice()  + " = $" + (item2.getPrice() * item2.getQuantity()));
  System.out.println("");

  System.out.println("Total: $" + cartTotal);

  return;
   }
}