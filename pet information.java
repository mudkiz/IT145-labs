import java.util.Scanner;

public class PetInformation {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      //
      Pet infoPet = new Pet();
      Dog infoDog = new Dog();
      //strings and ints for the pet and dog classes
      String petName, dogName, dogBreed;
      int petAge, dogAge;
      //gets inputs for the pet and dog classes 
      petName = scnr.nextLine();
      petAge = scnr.nextInt();
      scnr.nextLine();//consumes newline after int 
      dogName = scnr.nextLine();
      dogAge = scnr.nextInt();
      scnr.nextLine();//consumes newline after int 
      dogBreed = scnr.nextLine();
       //sets and prints characteristics for the pet class by calling to print info
      infoPet.setName(petName);
      infoPet.setAge(petAge);
      infoPet.printInfo();
      
      //sets characteristics for the pet class and calls print info
      infoDog.setName(dogName);
      infoDog.setAge(dogAge);
      infoDog.setBreed(dogBreed);
      infoDog.printInfo();
      
      //calls getbreed command to print the breed
      System.out.println("   Breed: " + infoDog.getBreed());
   }
}