import java.util.Scanner;

public class PushItToTheLimitClientA
{
   public static void main(String args[])
      {
      System.out.println("Welcome to Push it to the limit! The controls for the game are as follows Left, Right, Up, Down, are the directionals.");
      System.out.println(" Inventory checks your inventory, Health checks your current health, and pickup and drop [item name] will cause you to drop or pickup items respectivly.");
      System.out.println("Enter your name.");
      Scanner userInput = new Scanner(System.in);
      String name = userInput.nextLine();  //Uses next line for user input
      System.out.println("Your name is: " + name);
      int area = 1; // Group of rooms
      int room = 1; // Exact area the people are in
      boolean gameState = true; //Used as a way to re run the code while having a kill switch
      PushitBaseA PushitBaseA = new PushitBaseA();
      PushitBaseA.loopAreaRoomCheck();
      }
}   
