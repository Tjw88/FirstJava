/**
 * Created by Tnvn on 23/05/2017.
 */
public class LogicalOperators {
    public static void main(String [] args){
        int speed;
        int mpg;

        mpg = 36;
        speed = 61;

        if(speed >60 && mpg >35){
            System.out.println("optimal running");
        } else {
            System.out.println("standard running");
        }
    }
}
