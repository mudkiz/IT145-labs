import java.util.Scanner;

public class LabProgram {
   
public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven) {
        return (milesDriven / milesPerGallon) * dollarsPerGallon;
    
}
public static void main(String[] args) {
   Scanner scnr = new Scanner(System.in);  
         
   double milesPerGallon = scnr.nextDouble();
   double dollarsPerGallon = scnr.nextDouble();
     
         //here we can just copy the lines for driving cost three times but put different values for the miles
         //because we are calling the drivingCost three times
   System.out.printf("%.2f ", drivingCost(milesPerGallon, dollarsPerGallon,10.0));
   System.out.printf("%.2f ", drivingCost(milesPerGallon, dollarsPerGallon,50.0));
   System.out.printf("%.2f\n", drivingCost(milesPerGallon, dollarsPerGallon,400.0));
   //I got stuck on this one putting things in the wrong order and couldn't figure out what I did wrong 
   //I honestly tried everything
   //I just kept getting one right or the other it was so strange to me. I guess it's a bit of a lesson 
   //in making sure I have the right order on my processes
   scnr.close();
  }
}