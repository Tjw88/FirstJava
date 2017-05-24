/**
 * Created by Tnvn on 22/05/2017.
 */

import java.util.Scanner;

public class testClass {

    public static void main(String[] args) {

        //running conversation based on if / else. Can only use == with int. Thats why this DOESN'T WORK!!
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
            // THIS DOESN'T WORK as above - will always tell you to fuck off buddy!
        }
        int twoAns = scanner.nextInt();
        if (twoAns == 32) {
            System.out.println("Not bad, guess you're not as stupid as you look. Well done");
        }

    }
}
