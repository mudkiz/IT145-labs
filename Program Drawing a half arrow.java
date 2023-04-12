import java.util.Scanner; 

public class DrawHalfArrow {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int arrowBaseHeight = 0;
      int arrowBaseWidth = 0;
      int arrowHeadWidth = 0;
      //prompts for the half arrow specifications
      System.out.println("Enter arrow base height:");
      arrowBaseHeight = scnr.nextInt();
      
      System.out.println("Enter arrow base width:");
      arrowBaseWidth = scnr.nextInt();
      
      System.out.println("Enter arrow head width:");
      arrowHeadWidth = scnr.nextInt();
      //sets first loop
      while (arrowHeadWidth <= arrowBaseWidth){
         System.out.println("Enter arrow head width:");
         arrowHeadWidth = scnr.nextInt();}
      System.out.println("");  
      for (int i = 0; i < arrowBaseHeight; i++) {
            for (int j = 0; j < arrowBaseWidth; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
      //sets other loop for head width
        for (int k = arrowHeadWidth; k > 0; k--) {
            for (int l = 0; l < k; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
