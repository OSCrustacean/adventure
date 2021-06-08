import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // System objects
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    // Player variables
    int health = 100;
    int attackDamage = 50;
    int numHealthPots = 3;
    int healthPotionHealAmmount = 30;
    int healthPotionDropChance = 50; // Percentage

    boolean combat = false;
    boolean running = true;
    boolean endGame = false;

    System.out.println("Welcome to the Dungeon!");

    String position = "center";
    DUNGEON:
    while(running) {
      if(endGame) {
        break;
      }
    while(!combat) {
      int combatChance = 0;
      if(position.equals("center")) {
        System.out.println("You decend into a dim, dusty room and see the entrances to four rooms to the north, west, south, and east. Enter (n/w/s/e) to advance to a room.");

        String input = sc.nextLine();
        if(input.equals("n")) {
          position = "north";
        }
        else if(input.equals("s")) {
          position = "south";
        }
        else if(input.equals("w")) {
          position = "west";
        }
        else if(input.equals("e")) {
          position = "east";
        }
      }
      else if(position.equals("north")) {
        System.out.println("You enter the northern room...");
        combatChance = rand.nextInt(4);
        if(combatChance > 2) {
          combat = true;
          continue DUNGEON;
        }
        System.out.println("A rat scuttles to a hole in the corner and you see an empty room before you.");
        System.out.println("What would you like to do?");
        System.out.println("1. Return to main room");
        System.out.println("2. Wait");
        System.out.println("3. Drink health potion");
        String input = sc.nextLine();
        if(input.equals("1")) {
          position = "center";
          combatChance = 0;
          continue DUNGEON;
        }
        else if(input.equals("2")) {
          System.out.println("You wait in the room a while longer...");
        }
        else if(input.equals("3")) {
            if(numHealthPots > 0) {
              numHealthPots --;
              System.out.println("\t> You drink a health potion and heal yourself for " + healthPotionHealAmmount + "\n\t You now have " + health + " HP." + "\n\t> You have " + numHealthPots + " health potion(s) left.");
            }
            else {
              System.out.println("You do not have any health potions. Fight enemies for a chance to get one.");
            }
        }
        else {
          System.out.println("Invalid command");
        }
      }
      else if(position.equals("south")) {
        System.out.println("You enter the southern room...");
        combatChance = rand.nextInt(4);
        if(combatChance > 2) {
          combat = true;
          continue DUNGEON;
        }
        System.out.println("A rat scuttles to a hole in the corner and you see an empty room before you.");
        System.out.println("What would you like to do?");
        System.out.println("1. Return to main room");
        System.out.println("2. Wait");
        System.out.println("3. Drink health potion");
        String input = sc.nextLine();
        if(input.equals("1")) {
          position = "center";
          combatChance = 0;
          continue DUNGEON;
        }
        else if(input.equals("2")) {
          System.out.println("You wait in the room a while longer...");
        }
        else if(input.equals("3")) {
            if(numHealthPots > 0) {
              numHealthPots --;
              System.out.println("\t> You drink a health potion and heal yourself for " + healthPotionHealAmmount + "\n\t You now have " + health + " HP." + "\n\t> You have " + numHealthPots + " health potion(s) left.");
            }
            else {
              System.out.println("You do not have any health potions. Fight enemies for a chance to get one.");
            }
        }
        else {
          System.out.println("Invalid command");
        }
      }
      else if(position.equals("west")) {
        System.out.println("You enter the western room...");
        combatChance = rand.nextInt(4);
        if(combatChance > 2) {
          combat = true;
          continue DUNGEON;
        }
        System.out.println("A rat scuttles to a hole in the corner and you see an empty room before you.");
        System.out.println("What would you like to do?");
        System.out.println("1. Return to main room");
        System.out.println("2. Wait");
        System.out.println("3. Drink health potion");
        String input = sc.nextLine();
        if(input.equals("1")) {
          position = "center";
          combatChance = 0;
          continue DUNGEON;
        }
        else if(input.equals("2")) {
          System.out.println("You wait in the room a while longer...");
        }
        else if(input.equals("3")) {
            if(numHealthPots > 0) {
              numHealthPots --;
              System.out.println("\t> You drink a health potion and heal yourself for " + healthPotionHealAmmount + "\n\t You now have " + health + " HP." + "\n\t> You have " + numHealthPots + " health potion(s) left.");
            }
            else {
              System.out.println("You do not have any health potions. Fight enemies for a chance to get one.");
            }
        }
        else {
          System.out.println("Invalid command");
        }
      }
      else if(position.equals("east")) {
        System.out.println("You enter the eastern room...");
        combatChance = rand.nextInt(4);
        if(combatChance > 2) {
          combat = true;
          continue DUNGEON;
        }
        System.out.println("A rat scuttles to a hole in the corner and you see an empty room before you.");
        System.out.println("What would you like to do?");
        System.out.println("1. Return to main room");
        System.out.println("2. Wait");
        System.out.println("3. Drink health potion");
        String input = sc.nextLine();
        if(input.equals("1")) {
          position = "center";
          combatChance = 0;
          continue DUNGEON;
        }
        else if(input.equals("2")) {
          System.out.println("You wait in the room a while longer...");
        }
        else if(input.equals("3")) {
            if(numHealthPots > 0) {
              numHealthPots --;
              System.out.println("\t> You drink a health potion and heal yourself for " + healthPotionHealAmmount + "\n\t You now have " + health + " HP." + "\n\t> You have " + numHealthPots + " health potion(s) left.");
            }
            else {
              System.out.println("You do not have any health potions. Fight enemies for a chance to get one.");
            }
        }
        else {
          System.out.println("Invalid command");
        }
      }

    }
    GAME:
    while(combat) {
      System.out.println("--------------------------------------");
    
      Enemy en = new Enemy();

      String enemy = en.returnName();
      System.out.println("\t# " + enemy + " appeared! # \n");

      while(en.returnHealth() > 0) {
        System.out.println("\tYour HP: " + health);
        System.out.println("\t" + enemy + "'s HP: " + en.returnHealth());
        System.out.println("\n\tWhat would you like to do?");
        System.out.println("\t1. Attack");
        System.out.println("\t2. Drink health potion");
        System.out.println("\t3. Run!");

        String input = sc.nextLine();
        if(input.equals("1")) {
          int damageDealt = rand.nextInt(attackDamage) + 16;
          int damageTaken = en.enemyDamage();

          en.takeDamage(damageDealt);
          if(en.returnHealth() > 0) {
            health -= damageTaken;
          }

          System.out.println("\t> You attack the " + enemy + " for " + damageDealt + " damage.");
          if(en.returnHealth() > 0) {
           System.out.println("\t> You recieve " + damageTaken + " in retaliation!"); 
          }
          
          if(health < 1) {
            System.out.println("You have taken too much damage and cannot go on any longer.");
            break;
          }
        }
          else if(input.equals("2")) {
            if(numHealthPots > 0) {
              numHealthPots --;
              System.out.println("\t> You drink a health potion and heal yourself for " + healthPotionHealAmmount + "\n\t You now have " + health + " HP." + "\n\t> You have " + numHealthPots + " health potion(s) left.");
            }
            else {
              System.out.println("You do not have any health potions. Fight enemies for a chance to get one.");
            }
          }
          else if(input.equals("3")) {
            System.out.println("You run away from the " + enemy);
            combat = false;
            continue GAME;
          }
          else {
            System.out.println("\tInvalid command");
          }
      }



        if(health < 1) {
          System.out.println("\nYou succumb to your wounds in the Dungeon.");
          break;
        }

        System.out.println("\n--------------------------------------\n");
        System.out.println("\t # " + enemy + " was defeated! #");
        System.out.println("\t # You have " + health + " HP left. #");

        if(rand.nextInt(100) < healthPotionDropChance) {
          numHealthPots++;
          System.out.println(" # The " + enemy + " dropped a health potion! #");
          System.out.println(" # You now have " + numHealthPots + " health potion(s) #");
        }

        System.out.println("--------------------------------------\n");
        System.out.println("What would you like to do now?");
        System.out.println("1. Continue adventuring");
        System.out.println("2. Exit dungeon");

        String input = sc.nextLine();

        while(!input.equals("1") && !input.equals("2")) {
          System.out.println("Invalid command");
          input = sc.nextLine();
        }

        if(input.equals("1")) {
          System.out.println("You decide to carry on, deeper into the Dungeon.");
          combat = false;
          continue DUNGEON;
        }
        else if(input.equals("2")) {
          System.out.println("You head out of the Dungeon, returning to the townsfolk for another day.");
          combat = false;
          endGame = true;
          break;
        }


    }
    }

    System.out.println("\n######################");
    System.out.println("# Thanks for playing #");
    System.out.println("######################");
  }
}