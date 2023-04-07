package chapter4;

import java.util.Random;

public class RollTheDieGame {
    public static void main(String arg[]) {
        // Initialize what we know
        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random  random = new Random();

        System.out.println("Welcome to Roll the Die! Let's begin...");

        for(int i = 0; i < maxRolls; i++) {
            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            System.out.println(String.format("Roll #%d: You've rolled a %d. ", i, die));
            if(currentSpace == lastSpace){
                System.out.println("You are on space " + currentSpace + ". Congrats! You win!");
                break;
            }
            else if(i == maxRolls && currentSpace < lastSpace) {
                System.out.println("You are on " + currentSpace + ".");
                System.out.println("Unfortunately you didn't make it to all " +
                        lastSpace + " spaces. You lose!");
            }
            else {
                int spacesToGo = lastSpace - currentSpace;
                System.out.println("You are now on space" + currentSpace +
                        " and have " + spacesToGo + " more to go.");
            }

            System.out.println();
        }

    }
}
