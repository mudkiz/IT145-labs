import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

public class LabProgram {
   public static void main(String[] args)throws IOexception {
      Scanner scnr = new Scanner(System.in);

      String FileName = scnr.next();
      Scanner scanFile = new Scanner(new File(FileName));
      String files;
      
      while(scanFile.hasNextLine()){//sets while loop
         files = scanFile.nextLine();
         
         if(files.contains("_photo.jpg")){//checks for text to be changed
            files = files.replace("_photo.jpg","_info.txt");//replaces first set of text with second set
            System.out.println(files);
         }
      } 
       scanFile.close();
   }
}
