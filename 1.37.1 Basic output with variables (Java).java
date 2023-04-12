import java.util.Scanner; 
public class OutputWithVars {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      // Get the first input from the user
      System.out.println("Enter integer: ");
      int userNum = input.nextInt();
      //first integer
      System.out.println("You entered: " + userNum);
      //squared
      System.out.println(userNum + " squared is " + (userNum * userNum));
      //cubed
      System.out.println("And " + userNum + " cubed is " + (userNum * userNum * userNum) + "!!");

      // Get second input
      int userNum2 = input.nextInt();

      // get second number
      System.out.println("Enter another integer: ");
      int sum = userNum + userNum2;
      int product = userNum * userNum2;
      //output for sum and product
      System.out.println(userNum + " + " + userNum2 + " is " + sum);
      System.out.println(userNum + " * " + userNum2 + " is " + product);
   }
}