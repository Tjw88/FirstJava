/* This program will tell you how many days there are in the month you input, it will also tell you if it is a leap
year, and change February accordingly
 */

import java.util.Scanner;

public class MonthLeapYr {
    public static void main(String[] args) {

        int year;
        int monSwitch;
        Scanner scanIn = new Scanner(System.in);
        System.out.println("Hello, I can tell you how many days there are in the month we're in.");
        System.out.println("I can also tell you whether it is a leap year or not.");
        System.out.println("So, try me. What year is it?");
        year = scanIn.nextInt();
        System.out.println("Next, enter the month number");
        monSwitch = scanIn.nextInt();
        String initMonth;
        int daysInMonth;
        switch (monSwitch) {
            case 1:
                initMonth = "January";
                daysInMonth = 31;
                break;
            case 2:
                initMonth = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            case 3:
                initMonth = "March";
                daysInMonth = 31;
                break;
            case 4:
                initMonth = "April";
                daysInMonth = 30;
                break;
            case 5:
                initMonth = "May";
                daysInMonth = 31;
                break;
            case 6:
                initMonth = "June";
                daysInMonth = 30;
                break;
            case 7:
                initMonth = "July";
                daysInMonth = 31;
                break;
            case 8:
                initMonth = "August";
                daysInMonth = 31;
                break;
            case 9:
                initMonth = "September";
                daysInMonth = 31;
                break;
            case 10:
                initMonth = "October";
                daysInMonth = 31;
                break;
            case 11:
                initMonth = "November";
                daysInMonth = 30;
                break;
            case 12:
                initMonth = "December";
                daysInMonth = 31;
                break;
            default:
                initMonth = "Unknown";
                daysInMonth = 0;
        }

        String monthStatement;
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            monthStatement = "It is a leap year.";
        } else {
            monthStatement = "It is not a leap year.";
        }

        System.out.println("The month is " + initMonth + " in the year " + year + " which has " +
                daysInMonth + " days. " + monthStatement);
    }
}