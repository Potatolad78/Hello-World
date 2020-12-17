import java.util.Scanner;
public class PushitBase
{
   int area = 1;
   int room = 1;
   String name;
   Scanner userInput = new Scanner(System.in);
   String movement;
   boolean newGame = true;
   boolean bannanaLocation = true;
   boolean bannana = false;
   boolean gameState = true;
   boolean templeLock = false;
   boolean knife =false;
   boolean ropeLocation = true;
   boolean rope = false;
   boolean knifeLocation = true;
   boolean area1Vietnamese = true;
   boolean jungleTempleDoor = false;
   boolean templeLever1 = false;
   boolean templeLever2 = false;
   boolean templeLever3 = false;
   boolean templeLever4 = false;
   boolean m1911 = false;
   boolean m1911Location = true;
   boolean warehouseKeyLocation = true;
   boolean warehouseKey = false;
   boolean warehouseState = false;
   boolean nicksTag = false;
   boolean nicksTagLocation = true;
   boolean rope5 = false;
   boolean rope7 =false;
   boolean area2Vietnamese = true;
  public void pickupcommand()
  {
  }
  public void roomCheck1()
  {
  switch (room)
   {
            case 1:
            {  
               if(newGame == true)
               {
                  System.out.println("What is your name");
                  String name = userInput.nextLine();
                  System.out.println("You wake up in a downed chopper, your crew is around you bleeding out from the crash. " + name +" You got to get out of here!");
                  System.out.println("There is a jungle to the north, a rice paddy to the Right and a to the left there is a building");
               }
               if(newGame == false)
               {
                  System.out.println("Seeing the crash from another angle is horrifying. Your closest friends that went through training with you are laying there in defeat. You see one of their dogtags on the floor");
                  System.out.println("There is a jungle to the north, a rice paddy to the Right and a to the left there is a building");
               }
               String movement = userInput.nextLine();
               switch (movement.toUpperCase())
               {
               case "PICKUP DOGTAG":
               {
                  System.out.println("You pick up the dogtag. Nick is the name on the tag, you will miss him dearly");
                  nicksTag = true;
                  nicksTagLocation = false;
                  break;
               }
               case "LEFT": 
               {
                 room = 8;
                 newGame= false;
                 break;
               }
               case "RIGHT":
               {
                 room = 4;
                 newGame= false;
                 break;
               }
               case "UP":
               {
                  room = 2;
                  newGame= false;
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
              if(m1911 == true)
              {
               if (cos <= 99)
               {
                 System.out.println("You shoot the man with your only bullet and kill him. Your first kill in Vietnam couldnt have been more horifying.");
                 System.out.println("Your pistol is now useless to you");
                 System.out.println("To the left is the downed helicopter, to the North is more Jungle, and to the South is a cliff");
                 m1911 = false;
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
              if(knife == true && m1911 == false)
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
              if(knife == false && m1911 == false)
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
                     rope5 = true;
                     area = 3;
                     room = 1;
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
                     rope7 = true;
                     area = 3;
                     room = 7;
                     break;
                  }
               }
               }
               }
               break;    
            }
            case 8:
            {
               System.out.println("You walk up to the building, it seems to be abandoned. The door is locked and you arent able to open it");
               System.out.println("To the Right is the downed chopper, to the south is the cliff, to the north is a clearing.");
               if(warehouseState == true)
               {
                  System.out.println("The building is open. It seems to be some kind of workshop. Discarded tools line the floors");
                  if(ropeLocation == true)
                  {
                     System.out.println("while there is a rope hanging from a hanging light.");
                  }
               }
               String movement = userInput.nextLine();
               switch (movement.toUpperCase())
               {
               case "OPEN BUILDING":
               {
                  if(warehouseKey == true)
                  {
                     warehouseState = true;
                     break;
                  }
               }
               case "PICKUP ROPE":
               {
                  System.out.println("You pickup the rope. It looks as if it was never used");
                  ropeLocation = false;
                  rope = true;
                  break;
               }
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
               System.out.println("You enter the area and everything seems serene. There are rocks stacked in strange fashions here. You almost feel as if you werent just shot");
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
            if(templeLever1 == false)
            {
            System.out.println("There is a large lever on the wall that is an upright position.");
            }
            if(templeLever1 == true)
            {
            System.out.println("There is a large lever on the wall that is an downright position.");
            } 
            String movement = userInput.nextLine();
            switch (movement.toUpperCase())
             {
             case "PULL LEVER":
             {
               System.out.println("The lever gets pulled, a sound creaks but nothing happens");
               templeLever1 = true;
               break;
             }
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
            if(templeLever2 == false)
            {
            System.out.println("There is a large lever on the wall that is an upright position.");
            }
            if(templeLever2 == true)
            {
            System.out.println("There is a large lever on the wall that is an downright position.");
            } 
            String movement = userInput.nextLine();
            switch (movement.toUpperCase())
             {
             case "PULL LEVER":
             {
               System.out.println("The lever gets pulled, a sound creaks but nothing happens");
               templeLever2 = true;
               break;
             }
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
            System.out.println("This is a corner room. There are pots everywhere, they look to be empty as is someone already ttok their contents.");
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
            System.out.println("The temple seems the same. There are inscriptions all over the walls, you cant really make out what they say.");
            if(templeLever3 == false)
            {
            System.out.println("There is a large lever on the wall that is an upright position.");
            }
            if(templeLever3 == true)
            {
            System.out.println("There is a large lever on the wall that is an downright position.");
            } 
            String movement = userInput.nextLine();
            switch (movement.toUpperCase())
             {
             case "PULL LEVER":
             {
               System.out.println("The lever gets pulled, a sound creaks but nothing happens");
               templeLever3 = true;
               break;
             }
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
            System.out.println("This is a corner room. There are pots everywhere, they look to be empty as is someone already ttok their contents."); 
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
            System.out.println("The temple seems the same. There are inscriptions all over the walls, you cant really make out what they say.");
            if(templeLever4 == false)
            {
            System.out.println("There is a large lever on the wall that is an upright position.");
            }
            if(templeLever4 == true)
            {
            System.out.println("There is a large lever on the wall that is an downright position.");
            }
            if(templeLever4 == true && templeLever3 == true && templeLever2 == true && templeLever1 == true)
            {
               System.out.println("You notice there is a bridge that seems to have formed and now you can enter the center room of the temple.");
            } 
            String movement = userInput.nextLine();
            switch (movement.toUpperCase())
             {
             case "PULL LEVER":
             {
               System.out.println("The lever gets pulled, a sound creaks but nothing happens");
               templeLever4 = true;
               break;
             }
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
                 if(templeLever4 == true && templeLever3 == true && templeLever2 == true && templeLever1 == true)
                 {
                  room = 9;
                  break;
                 }
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
            if(m1911Location == true || warehouseKeyLocation == true)
            {
            System.out.println("The room is alredy looted except for");
            }
            if( m1911Location == true)
            {
            System.out.println("a pistol with one round chambered, and ");
            }
            if( warehouseKeyLocation == true)
            {
            System.out.println("a skeleton with a key in his hand.");
            }
            if (warehouseKeyLocation == false && m1911Location == false)
            {
             System.out.println("The room is empty");
            }
            String movement = userInput.nextLine();
            switch (movement.toUpperCase())
             {
             case "PICKUP KEY":
             {
               System.out.println("You pick up a key which almost looks like a normal house key");
               warehouseKeyLocation = false;
               warehouseKey = true;
               break;
             }
             case "PICKUP PISTOL":
             {
               System.out.println("You pick up the pistol, hopefully you dont have to use it.");
               m1911Location = false;
               m1911 = true;
               break;
             }
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
 public void roomCheck3()
 {
   switch(room)
   {
      case 1:
         {
            if(rope5 == true)
            {
            System.out.println("You tied the rope to the rock and used it to climb down the cliff");
            }
            System.out.println("The land around you is very different than up above. It is very arid");
            System.out.println("Around you there are some crates and a radio playing Magic Carpet Ride by Steppenwolf"); 
            System.out.println("To your right there is a large drop off and to your left there is just desert as far as the eye can see.");
            System.out.println("Up ahead there are two men chatting");
            String movement = userInput.nextLine();
            switch (movement.toUpperCase())
             {
             case "LEFT":
             {
               System.out.println("Thats to dangerous!");
               room = 1;
               break;
             }
             case "RIGHT":
             {
               System.out.println("You walk off the cliff and fall to your death.");
               System.out.println("GAME OVER");
               gameState = false;
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
                 room = 5;
                 break;
             }
          }
        break; 
         }
         case 2:
         {
            if (area2Vietnamese == true)
            {
            System.out.println("The two men in front of you are Vietnamese soliders");
            double cos2 = Math.random() * (100 - 1 + 1) + 1;
            if (m1911 = true)
            {
               if(cos2 > 1)
               {
                  System.out.println("You convince the men that you have a fully loaded M1911 and if they dont scatter they will be killed.");
                  System.out.println("They scatter off, leaving nothing behind");
                  area2Vietnamese = false;
               }
               else
               {
                  System.out.println("While you were tleling the men the gun was fully loaded they charged you and took your gun.");
                  System.out.println("GAME OVER");
                  gameState = false;
               }
            }
            if (m1911 == false && knife == true)
            {
               if(cos2 > 50)
               {
                  System.out.println("You kill both men with your knife. Luck was on your side today considering all they had to do was turn around");
                  area2Vietnamese = false;
               }
               else
               {
                  System.out.println("While you attacked with a knife one of the men dissarmed you.");
                  System.out.println("GAME OVER");
                  gameState = false;
               }

            }
            if(m1911 == false && knife == false)
            {
               if(cos2 > 90)
               {
                  System.out.println("You band the two mens heas together and they pass out. I thought that only worked in movies.");
                  area2Vietnamese = false;
               }
               else
               {
                  System.out.println("You were a fool and tried to take two men in a fight at the same time and were overwhelemed and killed.");
                  System.out.println("GAME OVER");
                  gameState = false;
               }
            }
            }
            System.out.println("North there is what seems to be an Oasis, to the south is the radio and camp");
            System.out.println("To the right there is a cliff and to the left is more desert.");
            System.out.println("The area is clear and there is nothing to do.");
            String movement = userInput.nextLine();
            switch (movement.toUpperCase())
             {
             case "LEFT":
             {
               System.out.println("Thats to dangerous!");
               room = 2;
               break;
             }
             case "RIGHT":
             {
               System.out.println("You walk off the cliff and fall to your death.");
               System.out.println("GAME OVER");
               gameState = false;
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
            System.out.println("There is an Oasis. You see U.S army gear thrown around.");
            System.out.println("You aren't sure if its really there or if you are seeing a mirage.");
            System.out.println("To the right is a large mountain peak and below you is the area where the men were."); 
            String movement = userInput.nextLine();
            switch (movement.toUpperCase())
             {
             case "LEFT":
             {
               System.out.println("Thats to dangerous!");
               room = 3;
               break;
             }
             case "RIGHT":
             {
               room = 4;
               break;
             }
               case "UP":
             { 
                 System.out.println("Thats to dangerous!"); 
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
            System.out.println("You reach the peak of the mountain");
            System.out.println("Up here you are able to reflect. Seeing your friends perish around you and you wonder what they carried with themselves to the grave.");
            System.out.println("The air here is very light"); 
            System.out.println("To the left is the oasis and to the right is an empty desert.");
            System.out.println("Below you is a empty hole");
            String movement = userInput.nextLine();
            switch (movement.toUpperCase())
             {
             case "LEFT":
             {
               room = 3;
               break;
             }
             case "RIGHT":
             {
               room = 5;
               break;
             }
               case "UP":
             { 
                 System.out.println("Thats to dangerous!");
                 room = 4;
                 break;
             }
                 case "DOWN":
             {
                 System.out.println("You walk off the cliff and fall to your death.");
                 System.out.println("GAME OVER");
                 gameState = false;
                 break;
             }
          }
        break; 
         }
         case 5:
         {
            System.out.println("You arive in an empty desert. There really is nothing here");
            System.out.println("To the left is the mountain peak.To the right is more desert.");
            System.out.println("Below you is a well"); 
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
               room = 1;
               break;
             }
               case "UP":
             { 
                 System.out.println("Thats to dangerous!");
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
            System.out.println("There is a well that hasnt been touched in years.");
            System.out.println("Below you is a camp and above you is the desert.");
            System.out.println("To the right is a U.S base. Below you is a camp"); 
            String movement = userInput.nextLine();
            switch (movement.toUpperCase())
             {
             case "LEFT":
             {
               System.out.println("You walk off the cliff and fall to your death.");
               System.out.println("GAME OVER");
               gameState = false;
               break;

             }
             case "RIGHT":
             {
               System.out.println("You cant go that way");
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
                 room = 7;
                 break;
             }
          }
        break; 
         }
         case 7:
         {
            if(rope7 == true)
            {
            System.out.println("You tied the rope to the rock and used it to climb down the cliff");
            }
            System.out.println("The land around you is very different than up above. It is very arid");
            System.out.println("The area seems like a deserted camp. There isnt much here except an army issued hat"); 
            System.out.println("To your left there is a large drop off and to your right there is just desert as far as the eye can see.");
            System.out.println("Up ahead there is a well");
            String movement = userInput.nextLine();
            switch (movement.toUpperCase())
             {
             case "LEFT":
             {
                 System.out.println("You walk off the cliff and fall to your death.");
                 System.out.println("GAME OVER");
                 gameState = false;
                 break;

             }
             case "RIGHT":
             {
               System.out.println("Thats to dangerous!");
               room = 7;
               break;
             }
               case "UP":
             { 
                room = 6;
                break;
             }
                 case "DOWN":
             {
                 area = 1;
                 room = 7;
                 break;
             }
          }
        break; 
         }
         case 8:
         {
            System.out.println("You tied the rope to the rock and used it to c;ob dpwn the cliff");
            System.out.println("The land around you is very different than up above. It is very arid");
            System.out.println("Around you there are some crates and a radio playing Magic Carpet Ride by Steppenwolf"); 
            System.out.println("To your right there is a large drop off and to your left there is just desert as far as the eye can see.");
            System.out.println("Up ahead there are two men chatting");
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
         case 9:
         {
            System.out.println("You tied the rope to the rock and used it to c;ob dpwn the cliff");
            System.out.println("The land around you is very different than up above. It is very arid");
            System.out.println("Around you there are some crates and a radio playing Magic Carpet Ride by Steppenwolf"); 
            System.out.println("To your right there is a large drop off and to your left there is just desert as far as the eye can see.");
            System.out.println("Up ahead there are two men chatting");
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
         case 10:
         {
            System.out.println("You tied the rope to the rock and used it to c;ob dpwn the cliff");
            System.out.println("The land around you is very different than up above. It is very arid");
            System.out.println("Around you there are some crates and a radio playing Magic Carpet Ride by Steppenwolf"); 
            System.out.println("To your right there is a large drop off and to your left there is just desert as far as the eye can see.");
            System.out.println("Up ahead there are two men chatting");
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
         case 11:
         {
            System.out.println("You tied the rope to the rock and used it to c;ob dpwn the cliff");
            System.out.println("The land around you is very different than up above. It is very arid");
            System.out.println("Around you there are some crates and a radio playing Magic Carpet Ride by Steppenwolf"); 
            System.out.println("To your right there is a large drop off and to your left there is just desert as far as the eye can see.");
            System.out.println("Up ahead there are two men chatting");
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
      case 3:
         {
         roomCheck3();
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
  
