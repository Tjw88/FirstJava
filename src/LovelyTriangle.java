/**
 * Created by Tnvn on 03/06/2017.
 */

import java.util.Scanner;

public class LovelyTriangle {

    public static void main(String[] args) {

        Scanner inputYN = new Scanner(System.in);
        System.out.println("Do you like triangles? (Y/N)");
        String answer;
        answer = inputYN.next();
        String kicker = answer.toLowerCase();

        if (kicker.equals("y")) {

            for (int x = 1; x <= 39; x++) {

                for (int y = 0; y < x; y++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            System.out.println("How'S THIS for a lovely pointy triangle?");
            for (int x = 39; x > 0; x--) {

                for (int y = 0; y < x; y++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        } else {
            System.out.println("Well, no triangles for you then");
        }
    }
}