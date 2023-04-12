import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
         String userText;
         int totalChars = 0;//storing variable
   
         userText = scnr.nextLine();  // Gets entire line, including spaces. 
         //counts up if there is a character to count that is not in the exception list
         for (int i = 0; i < userText.length(); i++) {
            if ((userText.charAt(i) != ' ') && (userText.charAt(i) != '.') && (userText.charAt(i) != '!') && (userText.charAt(i) != ',')) {
            totalChars++;//adds to the counter
      }
   } //prints the counter
         System.out.println(totalChars);
}
}