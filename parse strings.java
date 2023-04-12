import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
     Scanner scnr = new Scanner(System.in);
     String userInput = "";//sets strings
     String firstInput = "";
     String secondInput = "";
     
    
         System.out.println("Enter input string: ");//prompt for user
         userInput = scnr.nextLine();
      int index = userInput.indexOf(",");//
      
      while (!userInput.equals("q")){//while loop that ends when q is entered
         
         if(!userInput.contains(",")){//if no comma in string prints error
            System.out.println("Error: No comma in string");
         }
         else{
            firstInput = userInput.substring(0, index);
            secondInput = userInput.substring(index + 1);
            
            System.out.printf("First word: %s", firstInput.trim());//gets first string from input and puts it in the given text
            System.out.printf("%n");//prints new line
            System.out.printf("Second word: %s", secondInput.trim());//gets second string from input and puts it in the given text
            System.out.printf("%n");//printe new line
            System.out.println();
            System.out.println();
         }
         System.out.println("Enter input string: ");
           userInput = scnr.nextLine();
           index = userInput.indexOf(",");
       }
            }
        }