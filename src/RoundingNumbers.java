// to round numbers to any decimal place number

import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        //initialise Scanner function
        Scanner userIn = new Scanner(System.in);
        //declare variables
        double input1;
        double input2;
        System.out.println("This program will test if two variables are the same to a specified number of d.p");
        System.out.println("Input first number:");
        input1 = userIn.nextDouble();
        System.out.println("Input second number");
        input2 = userIn.nextDouble();
        //making dp a choice of 1 to 5 using switch statement
        //declare variable for switch statement - set as int
        int dpstate;
        //declare dpuse (the multiplier) as double, cannot be int for calc with doubles from inputs
        double dpuse;
        System.out.println("Now input the number of decimal places to test against, from 1 to 5:");
        //scanner input for decminal places to test
        dpstate = userIn.nextInt();
        //to find dp need to multiply number past decimal point see MATH function below
        switch (dpstate) {
            case 1:
                dpuse = 10;
                break;
            case 2:
                dpuse = 100;
                break;
            case 3:
                dpuse = 1000;
                break;
            case 4:
                dpuse = 10000;
                break;
            case 5:
                dpuse = 100000;
                break;
            default :
                dpuse = 0;
        }
        double output1;
        double output2;
        //use math function to round the number
        output1 = Math.round(input1 * dpuse);
        double output1a = output1 / dpuse;
        output2 = Math.round(input2 * dpuse);
        double output2a = output2 / dpuse;
        //if else run for test. Uses nested if fn depending whether is/isn't equivalent. If else used for grammar (>1)
        if (dpstate > 1) {if (output1a == output2a) {
            System.out.println("The numbers are equivalent to " + dpstate + " decimal places.");
        } else {
            System.out.println("The numbers are not equivalent to " + dpstate + " decimal places.");
        }} else {
            if (output1a == output2a) {
                System.out.println("The numbers are equivalent to " + dpstate + " decimal place.");
            } else {
                System.out.println("The numbers are not equivalent to " + dpstate + " decimal place.");
            }
        }
    }
}
