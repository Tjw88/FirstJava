/**
 * Created by Tnvn on 23/05/2017.
 */

import java.util.Scanner;

public class SimpleCalc {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double num1;
        double num2;
        double ans;
        System.out.println("Enter your first number");
        num1 = input.nextDouble();
        System.out.println("Enter 1-4 for function");
        System.out.println("1. Sum");
        System.out.println("2. Minus");
        System.out.println("3. Division");
        System.out.println("4. Multiply");
        int functionSwitch;
        double answer;
        functionSwitch = input.nextInt();
        System.out.println("Enter your second number");
        num2 = input.nextDouble();
        switch (functionSwitch) {
            case 1: answer = num1 + num2;
            break;
            case 2: answer = num1 - num2;
            break;
            case 3: answer = num1 / num2;
            break;
            case 4: answer = num1 * num2;
            break;
            default: answer = 0.0;
            }
        System.out.println("Answer: ");
        System.out.println(answer);


        }
}
