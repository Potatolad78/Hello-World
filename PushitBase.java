import java.util.Scanner;
public class PushitBase
{
   int area = 1;
   int room = 1;
   String name;
   Scanner userInput = new Scanner(System.in);
   String movement;
   boolean bannanaLocation = true;
   boolean bannana = false;
   boolean gameState = true;
   boolean templeLock = false;
   boolean knife =false;
   boolean rope = false;
   boolean knifeLocation = true;
   boolean area1Vietnamese = true;
   boolean jungleTempleDoor = false;
  public void pickupcommand()
  {
  }
  public void roomCheck1()
  {
  switch (room)
   {
            case 1:
            {
               System.out.println("You wake up in a downed chopper, your crew is around you bleeding out from the crash. " + name + " you need to get out of here! There is a jungle to the north, a rice paddy to the Right and a to the left there is a building");
               String movement = userInput.nextLine();
               switch (movement.toUpperCase())
               {
               case "LEFT": 
               {
                 room = 8;
                 break;
               }
               case "RIGHT":
               {
                 room = 4;
                 break;
               }
               case "UP":
               {
                  room = 2;
                  break;
               }
               case "DOWN":
               {
                  System.out.println("You cant go that way");
                  room = 1;
                  break;
               }
               }
            break;
            }
            case 2:
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
               if(bannana = true)
               {
                  if(movement.equals("Use Bannana"))
                  {
                  System.out.println("One of the monkeys come close and trade you a circular object for the bannana");
                  bannana = false;
                  templeLock = true;
                  break;
                  }
               }
               switch (movement.toUpperCase())
               {
                  case "LEFT":
                  {
                     room = 9;
                     break;
                  }
                  case "RIGHT":
                  {
                     room = 3;
                     break;
                  }
                  case "UP":
                  {
                     System.out.println("You cant go that way.");
                     room = 2;
                     break;
                  }
                  case "DOWN":
                  {
                     room = 1;
                     break;
                  }
               }
               break;
                
            }
            case 3:
            {
               System.out.println("There is a large jungle temple that seems to have a circular lock ");
               if (bannanaLocation == true)
               {
               System.out.println("There is a single bannanna in front of the temple");
               }
               System.out.println("To the left there is more jungle and below you there is a rice paddy");
               String movement = userInput.nextLine();
               if (movement.equals("Pickup Bannana"))
               {
               System.out.println("You pick up the bannana and put it into your pocket");
               bannanaLocation = false;
               bannana = true;
               }
               if (movement.equals("Place Key"))
               {
               System.out.println("The key fits in the lock perfectly. You hear very loud sounds as the door creaks down");
               jungleTempleDoor = true;
               }
               
               switch (movement.toUpperCase())
               {
               case "LEFT":
               {
                   room = 2;
                   break;
               }
               case "RIGHT":
               {
                  System.out.println("You cant go that way.");
                  room = 3;
                  break;
               }
               case "UP":
               {
                  if (jungleTempleDoor = true)
                  {
                   area = 2;
                   room = 1;
                   break;
                  }
                  System.out.println("You cant go that way");
                  room = 3;
                  break;
               }
               case "DOWN":
               {
                  room = 4;
                  break;
               }
               }
               break;
            }
           case 4:
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
                 switch (movement.toUpperCase())
                 {
                 case "LEFT":
                 {
                     room = 1;
                     break;
                 }
                 case "RIGHT":
                 {
                    System.out.println("You cant go that way.");
                    room = 4;
                    break;
                 }
                 case "UP":
                 {
                    room = 3;
                    break;
                 }
                 case "DOWN":
                 {
                    room = 5;
                    break;
                 }
                 }
                 area1Vietnamese = false;
                 break;
               }
              }
              else if(knife == false)
              {
                 if (cos >= 75)
                 {
                    System.out.println("You overpower the man and kill him. Your first kill in Vietnam couldnt have been more horifying.");
                    System.out.println("To the left is the downed helicopter, to the North is more Jungle, and to the South is a cliff");
                    String movement = userInput.nextLine();
                    switch (movement.toUpperCase())
                    {
                    case "LEFT":
                    {
                        room = 1;
                        break;
                    }
                    case "RIGHT":
                    {
                       System.out.println("You cant go that way.");
                       room = 4;
                       break;
                    }
                    case "UP":
                    {
                       room = 3;
                       break;
                    }
                    case "DOWN":
                    {
                       room = 5;
                       break;
                    }
                    }
                    area1Vietnamese = false;
                    break;
                 }
                 else
                 {
                  System.out.println("You are tired and the man overpowers you. You meet the same fate as your allies in the chopper.");
                  System.out.println("GAME OVER");
                  gameState = false;
                  break;
                 }
              }
              }
              if(area1Vietnamese == false)
              {
              System.out.println("To the left is the downed helicopter, to the North is more Jungle, and to the South is a cliff");
                 String movement = userInput.nextLine();
                 switch (movement.toUpperCase())
                 {
                 case "LEFT":
                 {
                     room = 1;
                     break;
                 }
                 case "RIGHT":
                 {
                    System.out.println("You cant go that way.");
                    room = 4;
                    break;
                 }
                 case "UP":
                 {
                    room = 3;
                    break;
                 }
                 case "DOWN":
                 {
                    room = 5;
                    break;
                 }
                 }
                 break;
              }
              
           }
           case 5:
            {
               System.out.println("The cliff has a very large drop off, not a survivable fall. ");
               System.out.println("Above you is the Rice Paddy, to the left is a rope bridge connecting two sides of the cliff");
               String movement = userInput.nextLine();
               switch (movement.toUpperCase())
               {
               case "LEFT":
               {
                   room = 6;
                   break;
               }
               case "RIGHT":
               {
                  System.out.println("You cant go that way.");
                  room = 5;
                  break;
               }
               case "UP":
               {
                  room = 4;
                  break;
               }
               case "DOWN":
               if (rope == false)
               {
                  if (movement.equals("Down") || movement.equals("down"))
                  {
                     System.out.println("You cant go that way.");
                     room = 5;
                     break;
                  }
               }
               
               if (rope == true)
               {
               if (movement.equals("Down") || movement.equals("down"))
                  {
                     room = 4;
                     break;
                  }
               }
               }
               break;
            }
           case 6:
            {
               System.out.println("There is a bridge in front of you");
               System.out.println("You can cross it by using left or go back to the cliff with right");
               System.out.println("North and south are most surely suicide");
               String movement = userInput.nextLine();
               switch (movement.toUpperCase())
               {
               case "LEFT":
               {
                   room = 7;
                   break;
               }
               case "RIGHT":
               {
                  System.out.println("You cant go that way.");
                  room = 5;
                  break;
               }
               case "UP":
               {
                  System.out.println("You should have listened. You fall to your death Game Over");
                  gameState = false;
                  break;

               }
               case "DOWN":
               {
                  System.out.println("You should have listened. You fall to your death Game Over");
                  gameState = false;
                  break;
               }
               }
               break;
            }
            case 7:
            {
               System.out.println("The cliff has a very large drop off, not a survivable fall. ");
               System.out.println("Above you is the Rice Paddy, to the left is a rope bridge connecting two sides of the cliff");
               System.out.println("To the North there seems to be a building");
               String movement = userInput.nextLine();
               switch (movement.toUpperCase())
               {
               case "LEFT":
               {
                   System.out.println("You cant go that way");
                   room = 7;
                   break;
               }
               case "RIGHT":
               {
                  room = 6;
                  break;
               }
               case "UP":
               {
                  room = 8;
                  break;
               }
               case "DOWN":
               {
                  System.out.println("You cant go that way");
                  room = 7;
                  break;
               }
               }
               break;    
            }
            case 8:
            {
               System.out.println("You walk up to the building, it seems to be abandoned. The door is locked and you arent able to open it");
               System.out.println("To the Right is the downed chopper, to the south is the cliff, to the north is a clearing.");
               String movement = userInput.nextLine();
               switch (movement.toUpperCase())
               {
               case "LEFT":
               {
                   System.out.println("You cant go that way");
                   room = 8;
                   break;
               }
               case "RIGHT":
               {
                  room = 1;
                  break;
               }
               case "UP":
               {
                  room = 9;
                  break;
               }
               case "DOWN":
               {
                  room = 7;
                  break;
               }
               }
               break;
            }
            case 9:
            {
               System.out.println("You enter the area and everything seems serene.");
               System.out.println("To the south is a building to the right is the Jungle.");
               String movement = userInput.nextLine();
               switch (movement.toUpperCase())
               {
               case "LEFT":
               {
                   System.out.println("You cant go that way");
                   room = 9;
                   break;
               }
               case "RIGHT":
               {
                  room = 2;
                  break;
               }
               case "UP":
               {
                  System.out.println("You cant go that way"); 
                  room = 9;
                  break;
               }
               case "DOWN":
               {
                  room = 8;
                  break;
               }
               }
               break;
            }




   }
   }
   public void roomCheck2()
   {
      switch(room)
      {
      case 1:
         {
            System.out.println(" You enter the temple and its very dark. You take a torch off of the wall to light your way");
            System.out.println(" You cant be sure where you are going, so tread lightly"); 
            String movement = userInput.nextLine();
            switch (movement.toUpperCase())
             {
             case "LEFT":
             {
               room = 8;
               break;
             }
             case "RIGHT":
             {
               System.out.println("You cant go that way");
               room = 1;
               break;
             }
               case "UP":
             { 
                 room = 2;
                 break;
             }
                 case "DOWN":
             {
                 area = 1;
                 room = 3;
                 break;
             }
          }
        break;   
        }
     case 2:
         {
            System.out.println("The temple seems the same. There are inscriptions all over the walls, you cant really make out what they say.");
            System.out.println("There is a large lever on the wall that is an upright position."); 
            String movement = userInput.nextLine();
            switch (movement.toUpperCase())
             {
             case "LEFT":
             {
               System.out.println("You cant go that way");
               room = 2;
               break;
             }
             case "RIGHT":
             {
               System.out.println("You cant go that way");
               room = 2;
               break;
             }
               case "UP":
             { 
                 room = 3;
                 break;
             }
                 case "DOWN":
             {
                 room = 1;
                 break;
             }
          }
        break;   

         }
      case 3:
         {
            System.out.println("This is a corner room. There are pots everywhere, they look to be empty as is someone already ttok their contents.");
            String movement = userInput.nextLine();
            switch (movement.toUpperCase())
             {
             case "LEFT":
             {
               room = 4;
               break;
             }
             case "RIGHT":
             {
               System.out.println("You cant go that way");
               room = 3;
               break;
             }
               case "UP":
             { 
                System.out.println("You cant go that way");
                room = 3;
                break;
             }
                 case "DOWN":
             {
                 room = 2;
                 break;
             }
          }
        break;   

         }
       case 4:
         {
            System.out.println("The temple seems the same. There are inscriptions all over the walls, you cant really make out what they say.");
            System.out.println("There is a large lever on the wall that is an upright position."); 
            String movement = userInput.nextLine();
            switch (movement.toUpperCase())
             {
             case "LEFT":
             {
               room = 5;
               break;
             }
             case "RIGHT":
             {
               room = 3;
               break;
             }
               case "UP":
             { 
                 System.out.println("You cant go that way");
                 room = 4;
                 break;
             }
                 case "DOWN":
             {
                 System.out.println("You cant go that way");
                 room = 4;
                 break;
             }
          }
        break;   

         }
         case 5:
         {
            System.out.println("5");
            System.out.println("There is a large lever on the wall that is an upright position."); 
            String movement = userInput.nextLine();
            switch (movement.toUpperCase())
             {
             case "LEFT":
             {
               System.out.println("You cant go that way");
               room = 5;
               break;
             }
             case "RIGHT":
             {
               room = 4;
               break;
             }
               case "UP":
             { 
                 System.out.println("You cant go that way");
                 room = 5;
                 break;
             }
                 case "DOWN":
             {
                 room = 6;
                 break;
             }
          }
        break;   

         }
        case 6:
         {
            System.out.println("6");
            System.out.println("There is a large lever on the wall that is an upright position."); 
            String movement = userInput.nextLine();
            switch (movement.toUpperCase())
             {
             case "LEFT":
             {
               System.out.println("You cant go that way");
               room = 6;
               break;
             }
             case "RIGHT":
             {
               System.out.println("You cant go that way");
               room = 6;
               break;
             }
               case "UP":
             { 
                 room = 5;
                 break;
             }
                 case "DOWN":
             {
                 room = 7;
                 break;
             }
          }
        break;   

         }
        case 7:
         {
            System.out.println("7");
            System.out.println("There is a large lever on the wall that is an upright position."); 
            String movement = userInput.nextLine();
            switch (movement.toUpperCase())
             {
             case "LEFT":
             {
               System.out.println("You cant go that way");
               room = 7;
               break;
             }
             case "RIGHT":
             {
               room = 8;
               break;
             }
               case "UP":
             { 
               room = 6;
               break;
             }
                 case "DOWN":
             {
                 System.out.println("You cant go that way");
                 room = 7;
                 break;
             }
          }
        break;   

         }
         case 8:
         {
            System.out.println("8");
            System.out.println("There is a large lever on the wall that is an upright position."); 
            String movement = userInput.nextLine();
            switch (movement.toUpperCase())
             {
             case "LEFT":
             {
               room = 7;
               break;
             }
             case "RIGHT":
             {
               room = 1;
               break;
             }
               case "UP":
             { 
                 room = 9;
                 break;
             }
                 case "DOWN":
             {
                 System.out.println("You cant go that way");
                 room = 8;
                 break;
             }
          }
        break;   

         }
         case 9:
         {
            System.out.println("9");
            System.out.println("There is a large lever on the wall that is an upright position."); 
            String movement = userInput.nextLine();
            switch (movement.toUpperCase())
             {
             case "LEFT":
             {
               System.out.println("You cant go that way");
               room = 9;
               break;
             }
             case "RIGHT":
             {
               System.out.println("You cant go that way");
               room = 9;
               break;
             }
               case "UP":
             { 
                 System.out.println("You cant go that way");
                 room = 9;
                 break;
             }
                 case "DOWN":
             {
                 room = 8;
                 break;
             }
          }
        break;   

         }






      }
   }
       


   
  public void areaRoomCheck()
  {
   switch(area)
   {
      case 1:
         {
         roomCheck1();
         break;
         }
      case 2:
         {
         roomCheck2();
         break;
         }
       
         
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
  
