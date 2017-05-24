/**
 * Created by Tnvn on 23/05/2017.
 */
public class ElseIf {
    public static void main(String [] args){
        //declare the variable - type integer
        int y;
        //initialise the variable
        y = 101;

        // running else if - progresses through - good for ranges to check int var
        if (y <=10) {
            System.out.println("minimum");
        } else if (y <=25) {
            System.out.println("low power state");
        } else if (y <=75) {
            System.out.println("normal running state");
        } else if (y <=100) {
            System.out.println("high power state");
        } else {
            System.out.println("O V E R L O A D danger will robinson danger O V E R L O A D");
        }

    }

}
