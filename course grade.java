import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      
      //declares variables as requested
      int students = 0, Midterm1, Midterm2,  Grade;
      double Midterm1Total = 0, Midterm2Total = 0, GradeTotal = 0, avg;
      String letterGrade, fileName, outputFileName = "report.txt";

      
      //reads files from user
      System.out.print("Enter the file name: ");
      fileName = scnr.nextLine();
      reader = new Scanner(new FileInputStream(fileName));
      writer = new PrintWriter(new FileOutputStream(outFileName));
      while (reader.hasNextLine()){
         String[] Course = reader.nextLine().split("\t");//splits based on tab character
         Midterm1 = Integer.parseInt(Course[2]);
         Midterm2 = Integer.parseInt(Course[3]);
         Grade = Integer.parseInt(Course[4]);
         Midterm1Total += Midterm1;
         Midterm2Total += Midterm2;
         GradeTotal +=  Grade;
         students += 1;
         avg = Midterm1 + Midterm2 +  Grade;
         avg /=3;
         
         //grades set up so if they are within requested numbers they go through the if statement
         if(avg >= 90) letterGrade = "A";
         
         else if(avg >= 80) letterGrade = "B";
         
         else if(avg >= 70) letterGrade = "C";
         
         else if(avg >= 60) letterGrade = "D";
         
         else letterGrade = "F";
         //writes the string required for the grade details
         writer.write(String.format("%s\t%s\t%d\t%d\t%d\t%s\r\n", details[0], details[1], Midterm1, Midterm2,  Grade, letterGrade));
         writer.flush();
   }//takes grades and exam averages and outputs the results
   writer.write(String.format("\r\nAverages: Midterm1 %.2f, Midterm2 %.2f, Final %.2f\n", 
   Midterm1Total / students, Midterm2Total / students,  GradeTotal / students));
   //closes the writer and reader
   writer.flush();
   writer.close();
   reader.close();
}
}
