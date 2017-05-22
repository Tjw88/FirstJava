/**
 * Created by Tnvn on 22/05/2017.
 */

import java.util.Scanner;

public class testClass {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println("Do you want to play a game?");
        Scanner scanner = new Scanner(System.in);
        String oneAns = scanner.nextLine();
        if (oneAns == "yes") {
            System.out.println("Ok, great!");
            System.out.println("What's 8 multiplied by 4?");
        } else {
            System.out.println("Well... Fuck you buddy");
            System.exit(0);
        }
        int twoAns = scanner.nextInt();
        if (twoAns == 32) {
            System.out.println("Not bad, guess you're not as stupid as you look. Well done");
        }

    }
}
