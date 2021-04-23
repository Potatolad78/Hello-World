import java.util.Scanner;

public class PushItToTheLimitClient
{
   public static void main(String args[])
      {
      System.out.println("Welcome to Push it to the limit! The controls for the game are as follows Left, Right, Up, Down, are the directionals.");
      System.out.println("Using key words such as use or pickup are common in this game.");
      Scanner userInput = new Scanner(System.in);
      int area = 1; // Group of rooms
      int room = 1; // Exact area the people are in
      boolean gameState = true; //Used as a way to re run the code while having a kill switch
      PushitBase PushitBase = new PushitBase();
      PushitBase.loopAreaRoomCheck();
      }
}   
