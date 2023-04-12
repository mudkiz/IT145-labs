import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Library {
   
   public static void fillLibraries(LinkedListLibrary linkedListLibrary, ArrayListLibrary arrayListLibrary) throws IOException {
      FileInputStream fileByteStream = null; // File input stream
      Scanner inFS = null;                   // Scanner object
      int linkedListOperations = 0;
      int arrayListOperations = 0;
      
      BookNode currNode;
      Book tempBook;
      
      String bookTitle;
      String bookAuthor;
      long bookISBN;
      
      // Try to open file
      fileByteStream = new FileInputStream("Books.txt");
      inFS = new Scanner(fileByteStream);

      while (inFS.hasNextLine()) {
         bookTitle = inFS.nextLine();
         bookISBN = inFS.nextLong();
         inFS.nextLine();
         bookAuthor = inFS.nextLine();
         
         // Insert into linked list
         currNode = new BookNode(bookTitle, bookAuthor, bookISBN);
         linkedListOperations = linkedListLibrary.insertSorted(currNode, linkedListOperations);
         linkedListLibrary.lastNode = currNode;
         
         // Insert into ArrayList
         tempBook = new Book(bookTitle, bookAuthor, bookISBN);
         arrayListOperations = arrayListLibrary.insertSorted(tempBook, arrayListOperations);
      }
      
      fileByteStream.close(); // close() may throw IOException if fails
   }
       
   public static void main (String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      int linkedListOperations = 0;
      int arrayListOperations = 0;
      
      // Create libraries
      LinkedListLibrary linkedListLibrary = new LinkedListLibrary();
      ArrayListLibrary arrayListLibrary = new ArrayListLibrary();
      
      // Fill libraries with 100 books
      fillLibraries(linkedListLibrary, arrayListLibrary);
      
      // Create new book to insert into libraries
      BookNode currNode;
      Book tempBook;
      
      String bookTitle;
      String bookAuthor;
      long bookISBN;
      
      bookTitle = scnr.nextLine();
      bookISBN = scnr.nextLong();
      scnr.nextLine();
      bookAuthor = scnr.nextLine();
       
      // Insert into linked list
      currNode = new BookNode(bookTitle, bookAuthor, bookISBN);
      // TODO: Call LL_Library's insertSorted() method to insert currNode and return
      //       the number of operations performed
      
      linkedListLibrary.lastNode = currNode;
      
      // Insert into ArrayList
      tempBook = new Book(bookTitle, bookAuthor, bookISBN);
      //prints required text and outputs the number of operations required to insert the new books and nodes
      System.out.println("Number of linked list operations: " + linkedListLibrary.insertSorted(currNode,  linkedListOperations));
      System.out.println("Number of ArrayList operations: " + arrayListLibrary.insertSorted(tempBook, arrayListOperations));
      // TODO: Print number of operations for linked list
      
      // TODO: Print number of operations for ArrayList
      
   }
}