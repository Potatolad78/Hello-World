import java.util.Scanner;
import java.io.*;

public class PushItToTheLimitClientTestingGround
{
   public static void main(String args[])
      {
      try
      {
      PrintStream FileOut= new PrintStream("out.txt");
      FileOut.println("Hello World");
      FileOut.close();
      }
      catch(FileNotFoundException E)
      {
      
      }
      System.out.println("Welcome to Push it to the limit! The controls for the game are as follows Left, Right, Up, Down, are the directionals.");
      System.out.println(" Inventory checks your inventory, Health checks your current health, and pickup and drop [item name] will cause you to drop or pickup items respectivly.");
      Scanner userInput = new Scanner(System.in); //Creates New Scanner AKA user input
      System.out.println("Enter your name.");
      String name = userInput.nextLine();  //Uses next line for user input
      System.out.println("Your name is: " + name);  // Output user input
      int area = 1; // Group of rooms
      int room = 1; // Exact area the people are in
      boolean gameState = true; //Used as a way to re run the code while having a kill switch
      PushitBaseTestingGround PushitBaseTestingGround = new PushitBaseTestingGround();
      PushitBaseTestingGround.loopAreaRoomCheck();
      }
}   
