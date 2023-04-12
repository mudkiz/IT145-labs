import java.util.Scanner;

public class PeopleWeights {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); //scanning inputs
//Variables
      int Number = 5; //total numbersin array
      double[] myVals = new double[Number];// double for array
      int i; 
    //prompts for weights
      for (i=0;i<Number;++i){
         System.out.println("Enter weight " + (i+1) + ": ");//outputs prompt line
         myVals[i] = scnr.nextDouble();
      }
      System.out.println("");//print blank line
      System.out.print("You entered: ");//Outputs required line
      for (i=0;i<Number;++i){
         System.out.print(myVals[i]+" ");
         }
         System.out.println("");
       //double for total weight
         double totalWeight = 0.0; 
         for (i=0;i<Number;++i){
            totalWeight += myVals[i];
         }//print total weight
         System.out.println("Total weight: " + totalWeight);
        //double for average weight
         double avgWeight = 0.0; 
       //calculation for average weight
         avgWeight = totalWeight / Number; 
         System.out.println("Average weight: " + avgWeight); 
         double maxWeight = myVals[0];{ 
       //gets highest weight number for max weight
         for (i=0;i<Number;++i) 
            if (myVals[i] > maxWeight){ 
               maxWeight = myVals[i];        
            }
         }
         //prints highest weight number
   System.out.println("Max weight: " + maxWeight);
   return;

   }
 }