import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);


    String fileName = scnr.nextLine();

    try (FileInputStream fileInput = new FileInputStream(fileName)) {
      Scanner fileScanner = new Scanner(fileInput);

      String[] category = new String[100];//arrayed strings set
      String[] foodNames = new String[100];
      String[] foodDescriptions = new String[100];
      int[] foodAvailability = new int[100];//availability needs to be an integer to check if it should print

      int i = 0;//set integer to default

      while (fileScanner.hasNextLine() && i < foodNames.length) {
        String line = fileScanner.nextLine();
        int categoryPosition = line.indexOf('\t');//indexes the first string before the tab space
        int namePosition = line.indexOf('\t', categoryPosition + 1);//indexes the second string before the tab space
        int descriptionPosition = line.indexOf('\t', namePosition + 1);//indexes the third string before the tab space
        category[i] = line.substring(0, categoryPosition);//puts strings in the first position into the array
        foodNames[i] = line.substring(categoryPosition + 1, namePosition);//puts strings in the position after into the array
        foodDescriptions[i] = line.substring(namePosition + 1, descriptionPosition);
        String availabilityStr = line.substring(descriptionPosition + 1);
        if(availabilityStr.equalsIgnoreCase("Available")) {//if the text says available then sets i to 1 if not then 0
          foodAvailability[i] = 1;
        } else {//else does not make foodAvailability go up
          foodAvailability[i] = 0;
        }
        
        i++;//adds to i   
      }
      fileScanner.close();//closes scanner


      for (i = 0; i < foodNames.length; i++) {//makes loop go until runs out of lines
        if (foodAvailability[i] > 0) {//if i goe up prints below statement
          System.out.println(foodNames[i] + " (" + category[i] + ") -- " + foodDescriptions[i]);//prints required text
        }
      }

    } catch (IOException e) {//catch for if the file name is invalid
      System.out.println("You have entered an invalid file name, please try again: " + e.getMessage());
    }
  }
}


