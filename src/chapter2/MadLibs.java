package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        //Get the season of the year
        System.out.println("Enter a season of the year");
        String season = scanner.next();

        //Get a whole number
        System.out.println("Enter a whole number");
        int number = scanner.nextInt();

        //Get an adjective
        System.out.println("Enter an adjective");
        String adjective = scanner.next();

        scanner.close();

        //Display the result
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");
    }
}
