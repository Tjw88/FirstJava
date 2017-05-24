/**
 * Created by Tnvn on 23/05/2017.
 */
public class LogicalOperators {
    public static void main(String [] args){
        //declare variable types integer
        int speed;
        int mpg;

        mpg = 36;
        speed = 61;

        /*LOGICAL OPERATOR is checking within the brackets the BOTH are true, operator || checks if EITHER (OR fn) is true
        you can also use the boolean switch '!' to check if a value is NOT true e.g:
        if(!(speed >62)) whilst FALSE will return TRUE i.e. is not, not above 62... e.g:
        age = 18, then if (!( age > 16)) will return FALSE
         */

        if(speed >60 && mpg >35){
            System.out.println("optimal running");
        } else {
            System.out.println("standard running");
        }
    }
}
