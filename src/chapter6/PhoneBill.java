package chapter6;

import java.util.Scanner;
/*
 * Calculate final total of someone's phone bill
 * Allow the operator to input the plan fee and the number of average minutes
 * Charge the user 0.25 for every minute they were over their plan, and 15% tax
 *  on the subtotal
 * Create separate methods to calculate the tax, overage fees, and final total
 * Print the itemized bill
 */

public class PhoneBill {
        private int id;
        private double baseCost;
        private int allottedMinutes;
        private int minutesUsed;

        public PhoneBill() {
            id = 0;
            baseCost = 80.99;
            allottedMinutes = 500;
            minutesUsed = 500;
        }
        public PhoneBill(int id) {
            this.id = id;
            baseCost = 80.99;
            allottedMinutes = 500;
            minutesUsed = 500;
        }
        public PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed) {
            this.id = id;
            this.baseCost = baseCost;
            this.allottedMinutes = allottedMinutes;
            this.minutesUsed = minutesUsed;
        }

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public double getBaseCost() {
            return baseCost;
        }
        public void setBaseCost(double baseCost) {
            this.baseCost = baseCost;
        }
        public int getAllottedMinutes() {
            return  allottedMinutes;
        }
        public void setAllottedMinutes(int allottedMinutes) {
            this.allottedMinutes = allottedMinutes;
        }
        public int getMinutesUsed() {
            return minutesUsed;
        }
        public void setMinutesUsed(int minutesUsed) {
            this.minutesUsed = minutesUsed;
        }
        public double calculateOverage(){
            if(minutesUsed <= allottedMinutes){
                return 0;
            }

            double overageRate = 0.25;
            double overageMinutes = minutesUsed - allottedMinutes;
            return overageMinutes * overageRate;
        }

        public double calculateTax(){
            double taxRate = 0.15;
            return taxRate * (baseCost + calculateOverage());
        }

        public double calculateTotal(){
            return baseCost + calculateOverage() + calculateTax();
        }

        public void printItemizedBill(){
            System.out.println("ID: " + id);
            System.out.println("Base Rate: $" + baseCost);
            System.out.println("Overage Fee: $"
                    + String.format("%.2f", calculateOverage()));
            System.out.println("Tax: $"
                    + String.format("%.2f", calculateTax()));
            System.out.println("Total: $"
                    + String.format("%.2f", calculateTotal()));
        }

}


