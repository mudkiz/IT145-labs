import java.util.Scanner;

public class DateParser {
   public static int getmonthCaseAsInt(String monthCalendar) {
      int monthDate;
                                                           
      switch (monthCalendar) {
         
         default: monthDate = 0;
         
         case "January": //case switches for each month
            monthDate = 1; 
            break;
         
         case "February": 
            monthDate = 2; 
            break;
         
         case "March": 
            monthDate = 3; 
            break;
         
         case "April": 
            monthDate = 4; 
            break;
         
         case "May": 
            monthDate = 5; 
            break;
         
         case "June": 
            monthDate = 6; 
            break;
        
         case "July": 
            monthDate = 7; 
            break;
         
         case "August": 
            monthDate = 8; 
            break;
         
         case "September": 
            monthDate = 9; 
            break;
         
         case "October": 
            monthDate = 10; 
            break;
         
         case "November": 
            monthDate = 11; 
            break;
         
         case "December": 
            monthDate = 12; 
            break;
      }
      return monthDate;
    }
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      String userInput;
      int i, monthCase;//sets the month integer
      
      String j,k,l;//sets strings
      while(true){//while loop taht ends with a -1
         userInput = scnr.nextLine();
         if(userInput.equals("-1") == true)
         break;
         
         i = userInput.indexOf(",");//checks for comma in text
         if(i == -1)
         continue;
         
         String temp = userInput.substring(0,i);
         j = temp.split(" ")[0];//splits text after the space
         k = temp.split(" ")[1];
         l = userInput.substring(i + 2);
         monthCase = getmonthCaseAsInt(j);
         System.out.println(monthCase + "/" + k + "/" + l);//outputs text in month/day/year as requested
      }
     
   }
}
