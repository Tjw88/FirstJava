import java.util.Scanner;

public class LovelyTriangle {

    public static void main(String[] args) {

        //initialise scanner, receive answer and convert input to lowercase.
        Scanner inputYN = new Scanner(System.in);
        System.out.println("Do you like triangles? (Y/N)");
        String answer;
        answer = inputYN.next();
        String kicker = answer.toLowerCase();

        //if they like triangles...
        if (kicker.equals("y")) {

            //print a triangle! first block using for statement for each loop adds an * until x == 39
            for (int x = 1; x <= 39; x++) {

                //prints on same line - 'print' not 'println'. i.e. each * is a loop within a loop printing on the line
                // when the number of * loops equals the line number, loop breaks and returns up to x++  and repeats
                for (int y = 0; y < x; y++) {
                    System.out.print("*");
                }
                // this prints an empty new line after each loop, on which the * is laid as uses print, not println
                System.out.println("");
            }
            //mid statement line for peak
            System.out.println("How'S THIS for a lovely pointy triangle?");
            //this is the above in reverse. Upper x is reduced by 1 each loop until 0 is reached (x>0)
            for (int x = 39; x > 0; x--) {

                for (int y = 0; y < x; y++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            //fuck em if the don't like triangles. Shit don't grow on trees man
        } else {
            System.out.println("Well, no triangles for you then");
        }
    }
}