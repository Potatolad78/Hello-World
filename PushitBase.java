import java.util.Scanner;
public class PushitBase
{
   int area;
   int room;
   String name;
   Scanner userInput = new Scanner(System.in);
   String movement;
   
  public void areaRoomCheck()
  {
   if (area == 1);
         {
            if(room == 1);
            {
               System.out.println("You wake up in a downed chopper, your crew is around you bleeding out from the crash. " + name + " you need to get out of here! There is a jungle to the north and a rice paddy to the left");
               String movement = userInput.nextLine();
               if(movement == "Left" || movement == "left");
               {
                 room = 8;
               }
               if(movement == "Right" || movement == "right");
               {
                 room = 4;
               }
                if(movement == "Up" || movement == "up");
               {
                  room = 2;
               }
               if(movement == "Down" || movement == "down");
               {
                  room = 6;
               }

            }
            if(room == 2);
            {
               System.out.println(" Large trees block the sun from reaching you. Sounds of monkeys are howling through the air.");
               System.out.println(" There are three small huts that seem to be abandoned. Inside of one you find a knife and a letter");
               System.out.println(" To the left there seems to be a clearing and to the right there is more Jungle. Below you is the Helicopter crash");
               String movement = userInput.nextLine();
               if(movement == "Left" || movement == "left");
               {
                  room = 9;
               }
               if(movement == "Right" || movement == "right");
               {
                  room = 3;
               }
                if(movement == "Up" || movement == "up");
               {
                  room = 2;
               }
               if(movement == "Down" || movement == "down");
               {
                  room = 1;
               }
                
            }
            if(room == 3);
            {
               System.out.println("There is a large jungle temple that seems to have a circular lock ");
               System.out.println("There is a single bannanna in front of the temple");
               System.out.println("To the left there is more jungle and below you there is a rice paddy");
               String movement = userInput.nextLine();
               if(movement == "Left" || movement == "left");
               {
                   room = 2;
               }
               if(movement == "Right" || movement == "right");
               {
                  System.out.println("You cant go that way.");
                  room = 3;
               }
                if(movement == "Up" || movement == "up");
               {
                  System.out.println("You cant go that way");
                  room = 3;
               }
               if(movement == "Down" || movement == "down");
               {
                  room = 4;
               }
                
            }
           
         }
  }
  
}