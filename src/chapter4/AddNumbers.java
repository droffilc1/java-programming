package chapter4;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);
        boolean again;

        do{
            System.out.println("Enter first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter second number");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            System.out.println("The sum is " + sum);

            System.out.println("Would you like to start over? True or False");
            again = scanner.nextBoolean();

        }while(again);
        scanner.close();
    }
}
