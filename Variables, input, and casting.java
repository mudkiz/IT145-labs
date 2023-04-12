import java.util.Scanner;
public class BasicInput {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userInt = 0;
      double userDouble = 0.0;
      char userChar = ' ';
      String userStr = "";
      // prompt input
      System.out.println("Enter integer: ");
      userInt = scnr.nextInt();
      //prompt for double
      System.out.println("Enter double: ");
      userDouble = scnr.nextDouble();
      //prompt for character with scanner to get the character
      System.out.println("Enter character: ");
      userChar = scnr.next().charAt(0);
      //prompt for string
      System.out.println("Enter string: ");
      userStr = scnr.next();
      //this is for the order entered
      System.out.println(userInt + " " + userDouble + " " + userChar + " " + userStr);
      //this is for the reverse
      System.out.println(userStr + " " + userChar + " " + userDouble + " " + userInt);
      //cast to integer
      System.out.println(userDouble + " cast to an integer is " + (int)userDouble);
      return;
   }
}