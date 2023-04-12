import java.util.Scanner;

public class MileageTrackerLinkedList {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);

      // References for MileageTrackerNode objects
      MileageTrackerNode headNode;                                           
      MileageTrackerNode currNode;
      MileageTrackerNode lastNode;

      double miles;
      String date;
      int i;
      int nodeCount;
      // Front of nodes list                                                                         
      headNode = new MileageTrackerNode();
      lastNode = headNode;

      // scans nodes
         nodeCount = scnr.nextInt();
            
      //counts number of nodes and inserts them into list
       for ( i = 0; i < nodeCount; ++i) {
          miles = scnr.nextDouble();
         //tried to double both and got an error this works though!
          date = scnr.next();
          currNode = new MileageTrackerNode(miles, date);
          lastNode.insertAfter(currNode);
          lastNode = currNode;
       }

      //calls and prints node
       currNode = headNode.getNext();
       for (i = 0; i < nodeCount; ++i) {
          currNode.printNodeData();
          currNode = currNode.getNext();
       }
   }
}