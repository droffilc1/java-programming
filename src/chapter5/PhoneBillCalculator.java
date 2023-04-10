package chapter5;

/*
* Calculate final total of someone's phone bill
* Allow the operator to input the plan fee and the number of average minutes
* Charge the user 0.25 for every minute they were over their plan, and 15% tax
*  on the subtotal
* Create separate methods to calculate the tax, overage fees, and final total
* Print the itemized bill
*/

import java.util.Scanner;

public class PhoneBillCalculator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base cost of the plan:");
        double baseCost = scanner.nextDouble();

        System.out.println("Enter the overage minute");
        double overageMinutes = scanner.nextDouble();

        scanner.close();

        double overCharge = calculateOverages(overageMinutes);
        double tax = calculateTax(baseCost + overageMinutes);

        calculateAndPrintBill(baseCost, overCharge, tax);
    }
    public static double calculateOverages(double extraMinutes) {
        double rate = 0.25;
        double overage = extraMinutes * rate;
        return overage;
    }
    public static double calculateTax(double subtotal) {
        double rate = 0.15;
        double tax = subtotal * rate;
        return tax;
    }
    public static void calculateAndPrintBill(double base, double overage, double tax) {
        double finalTotal = base + overage + tax;

        System.out.println("Print Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", base));
        System.out.println("Overage: $" + String.format("%.2f", overage));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));
    }
}
