/*Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less
than 1, or "large" if it exceeds 1,000,000.
 */

import java.util.Scanner;

public class TestNumberSize {

    public static void main(String[] args) {

        double num1;
        Scanner userIn = new Scanner(System.in);
        System.out.println("This program will tell you whether a given number is positive or negative");
        System.out.println("Enter your number below: ");
        // initialise the num1 variable
        num1 = userIn.nextDouble();
        // will test if >0, then use nested else if to test if under 1, else if >1mil, otherwise it's just positive
        if (num1 > 0.0) {
            if (num1 < 1) {
            System.out.println("That's a positive small number");
            } else if (num1 >= 1000000) {
            System.out.println("That's a large positive number");
            } else {
            System.out.println("That's a positive number");
            }}
        // above test closed. If not over 0 will move to higher else if, is less that 0
        else if (num1 < 0) {
            if (num1 > -1) {
                System.out.println("That's a small negative number");
            } else if (num1 < -1000000) {
            System.out.println("That's a large negative number");
            } else {
            System.out.println("negative number");
            }}
        // after the two tests above, if it's not greater than 0, and not less than, it's 0
            else {
            System.out.println("That's a ZERO!");
        }
    }
}

