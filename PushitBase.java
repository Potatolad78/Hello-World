import java.util.Scanner;
public class PushitBase
{
   int area = 1;
   int room = 1;
   String name;
   Scanner userInput = new Scanner(System.in);
   String movement;
   boolean gameState = true;
   boolean knife =false;
   boolean rope = false;
   boolean knifeLocation = true;
   boolean area1Vietnamese = true;
  public void pickupcommand()
  {
  }
  public void roomCheck1()
  {
   if(room == 1)
            {
               System.out.println("You wake up in a downed chopper, your crew is around you bleeding out from the crash. " + name + " you need to get out of here! There is a jungle to the north, a rice paddy to the Right and a to the left there is a building");
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
                  System.out.println("You cant go that way");
                  room = 1;
               }

            }
            if(room == 2)
            { 
               System.out.println(" Large trees block the sun from reaching you. Sounds of monkeys are howling through the air.");
               if (knifeLocation == true)
               {
                  System.out.println(" There are three small huts that seem to be abandoned. Inside of one you find a knife");
               }
               System.out.println(" There is also a letter in the hut");
               System.out.println(" To the left there seems to be a clearing and to the right there is more Jungle. Below you is the Helicopter crash");
               String movement = userInput.nextLine();
               if(movement.equals("Pickup Knife"))
               {
                  knife = true;
                  knifeLocation = false;
               }
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
                
            }
            if(room == 3)
            {
               System.out.println("There is a large jungle temple that seems to have a circular lock ");
               System.out.println("There is a single bannanna in front of the temple");
               System.out.println("To the left there is more jungle and below you there is a rice paddy");
               String movement = userInput.nextLine();
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
            }
           if(room == 4)
           {
              if (area1Vietnamese == true)
              {
              System.out.println("There is a Vietnamese Solider right in front of you");
              System.out.println("He is unarmed and runs at you in a charge and engages you in close quaters combat");
              double cos = Math.random() * (100 - 1 + 1) + 1;
              if(knife == true)
              {
               if (cos <= 90)
               {
                 System.out.println("You overpower with your knife and kill him. Your first kill in Vietnam couldnt have been more horifying.");
                 System.out.println("To the left is the downed helicopter, to the North is more Jungle, and to the South is a cliff");
                 String movement = userInput.nextLine();
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
                 area1Vietnamese = false;

                  
               }
              }
              else if(knife == false)
              {
                 if (cos >= 75)
                 {
                    System.out.println("You overpower the man and kill him. Your first kill in Vietnam couldnt have been more horifying.");
                    System.out.println("To the left is the downed helicopter, to the North is more Jungle, and to the South is a cliff");
                    String movement = userInput.nextLine();
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
                    area1Vietnamese = false;
                 }
                 else
                 {
                  System.out.println("You are tired and the man overpowers you. You meet the same fate as your allies in the chopper.");
                  System.out.println("GAME OVER");
                  gameState = false;
                 }
              }
              }
              if(area1Vietnamese == false)
              {
              System.out.println("To the left is the downed helicopter, to the North is more Jungle, and to the South is a cliff");
                 String movement = userInput.nextLine();
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
              }
              
           }
           if(room == 5)
            {
               System.out.println("The cliff has a very large drop off, not a survivable fall. ");
               System.out.println("Above you is the Rice Paddy, to the left is a rope bridge connecting two sides of the cliff");
               String movement = userInput.nextLine();
               if(movement.equals("Left") || movement.equals("left"))
               {
                   room = 6;
               }
               if(movement.equals("Right") || movement.equals("right"))
               {
                  System.out.println("You cant go that way.");
                  room = 5;
               }
                if(movement.equals("Up") || movement.equals("up"))
               {
                  room = 4;
               }
               if (rope == false)
               {
                  if(movement.equals("Down") || movement.equals("down"))
                  {
                     System.out.println("You cant go that way.");
                     room = 5;
                  }
               }
               
               if (rope == true)
               {
                  if(movement.equals("Down") || movement.equals("down"))
                  {
                     room = 4;
                  }
               }
            }
           if(room == 6)
            {
               System.out.println("There is a bridge in front of you");
               System.out.println("You can cross it by using left or go back to the cliff with right");
               System.out.println("North and south are most surely suicide");
               String movement = userInput.nextLine();
               if(movement.equals("Left") || movement.equals("left"))
               {
                   room = 7;
               }
               if(movement.equals("Right") || movement.equals("right"))
               {
                  System.out.println("You cant go that way.");
                  room = 5;
               }
               if(movement.equals("Up") || movement.equals("up"))
               {
                  System.out.println("You should have listened. You fall to your death Game Over");
                  gameState = false;

               }
               if(movement.equals("Down") || movement.equals("down"))
               {
                  System.out.println("You should have listened. You fall to your death Game Over");
                  gameState = false;
               }
            }
            if(room == 7)
            {
               System.out.println("The cliff has a very large drop off, not a survivable fall. ");
               System.out.println("Above you is the Rice Paddy, to the left is a rope bridge connecting two sides of the cliff");
               System.out.println("To the North there seems to be a building");
               String movement = userInput.nextLine();
               if(movement.equals("Left") || movement.equals("left"))
               {
                   System.out.println("You cant go that way");
                   room = 7;
               }
               if(movement.equals("Right") || movement.equals("right"))
               {
                  room = 6;
               }
               if(movement.equals("Up") || movement.equals("up"))
               {
                  room = 8;
               }
               if(movement.equals("Down") || movement.equals("down"))
               {
                  System.out.println("You cant go that way");
                  room = 7;
               }
            }
            if(room == 8)
            {
               System.out.println("You walk up to the building, it seems to be abandoned. The door is locked and you arent able to open it");
               System.out.println("To the Right is the downed chopper, to the south is the cliff, to the north is a clearing.");
               String movement = userInput.nextLine();
               if(movement.equals("Left") || movement.equals("left"))
               {
                   System.out.println("You cant go that way");
                   room = 8;
               }
               if(movement.equals("Right") || movement.equals("right"))
               {
                  room = 1;
               }
               if(movement.equals("Up") || movement.equals("up"))
               {
                  room = 9;
               }
               if(movement.equals("Down") || movement.equals("down"))
               {
                  room = 7;
               }
            }
            if(room == 9)
            {
               System.out.println("You enter the area and everything seems serene.");
               System.out.println("To the south is a building to the right is the Jungle.");
               String movement = userInput.nextLine();
               if(movement.equals("Left") || movement.equals("left"))
               {
                   System.out.println("You cant go that way");
                   room = 9;
               }
               if(movement.equals("Right") || movement.equals("right"))
               {
                  room = 2;
               }
               if(movement.equals("Up") || movement.equals("up"))
               {
                  System.out.println("You cant go that way"); 
                  room = 9;
               }
               if(movement.equals("Down") || movement.equals("down"))
               {
                  room = 8;
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
  
