import java.util.Scanner;
public class PushitBaseTestingGround
{
   int area = 1;
   int room = 1;
   String name;
   Scanner userInput = new Scanner(System.in);
   String movement;
   boolean gameState = true;
  public void roomCheck1()
  {
   switch(room)
            {
             case 1:
             
               System.out.println("You wake up in a downed chopper, your crew is around you bleeding out from the crash. " + name + " you need to get out of here! There is a jungle to the north and a rice paddy to the left");
               String movement = userInput.nextLine();
               if(movement.equals("Left") || movement.equals("left"))
               {
                 room = 8;
               }
               if(movement.equals("Right") || movement.equals("right"))
               {
                 room = 4;
               }
               if(movement.equals("Up") || movement.equals("up"))
               {
                 room = 2;
               }
               if(movement.equals("Down") || movement.equals("down"))
               {
                 room = 6;
               }

            
            case 2:
            
               System.out.println(" Large trees block the sun from reaching you. Sounds of monkeys are howling through the air.");
               System.out.println(" There are three small huts that seem to be abandoned. Inside of one you find a knife and a letter");
               System.out.println(" To the left there seems to be a clearing and to the right there is more Jungle. Below you is the Helicopter crash");
               movement = userInput.nextLine();
               if(movement.equals("Left") || movement.equals("left"))
               {
                  room = 9;
               }
               if(movement.equals("Right") || movement.equals("right"))
               {
                  room = 3;
               }
                if(movement.equals("Up") || movement.equals("up"))
               {
                  room = 2;
               }
               if(movement.equals("Down") || movement.equals("down"))
               {
                  room = 1;
               }
                
            
            case 3:
            
               System.out.println("There is a large jungle temple that seems to have a circular lock ");
               System.out.println("There is a single bannanna in front of the temple");
               System.out.println("To the left there is more jungle and below you there is a rice paddy");
               movement = userInput.nextLine();
               if(movement.equals("Left") || movement.equals("left"))
               {
                   room = 2;
               }
               if(movement.equals("Right") || movement.equals("right"))
               {
                  System.out.println("You cant go that way.");
                  room = 3;
               }
                if(movement.equals("Up") || movement.equals("up"))
               {
                  System.out.println("You cant go that way");
                  room = 3;
               }
               if(movement.equals("Down") || movement.equals("down"))
               {
                  room = 4;
               }
            
           case 4:
           
              System.out.println("There is a Vietnamese Solider right in front of you");
              System.out.println("He is unarmed and runs at you in a charge and engages you in close quaters combat");
              double cos = Math.random() * (100 - 1 + 1) + 1;
              if (cos <= 75)
              {
                 System.out.println("You overpower the man and kill him. Your first kill in Vietnam couldnt have been more horifying.");
                 System.out.println("To the left is the downed helicopter, to the North is more Jungle, and to the South is a cliff");
                 movement = userInput.nextLine();
                 if(movement.equals("Left") || movement.equals("left"))
                 {
                     room = 1;
                 }
                 if(movement.equals("Right") || movement.equals("right"))
                 {
                    System.out.println("You cant go that way.");
                    room = 4;
                 }
                  if(movement.equals("Up") || movement.equals("up"))
                 {
                    room = 3;
                 }
                 if(movement.equals("Down") || movement.equals("down"))
                 {
                    room = 5;
                 }
              
              else
              {
               System.out.println("You are tired and the man overpowers you. You meet the same fate as your allies in the chopper.");
               System.out.println("GAME OVER");
               gameState = false;
              }
            }
          }

   }

   
  public void areaRoomCheck()
  {
   if (area == 1)
         {
         roomCheck1();
         }
           
  }
  public void loopAreaRoomCheck()
  {
   while (gameState == true)
   {
     areaRoomCheck();
   }
  } 
}
  
