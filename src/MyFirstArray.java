
public class MyFirstArray {
    public static void main(String[] args) {

        /* how to declare an array and assign a value
        String [] firstArray = new String[4];
        firstArray [2] = ("hello");
        */

        /* first array attempt - recall a string value - NOTE arrays start index at 0 e.g. [2] is "three"
        String [] secondArray = {"one", "two", "three", "four"};

        System.out.println(secondArray[0]);
        */
        // to sum array elements:
        int[] sumArray = {2, 17, 34, 12, 84, 43};
        // set initial value of the sum at 0
        int sum = 0;
        //using for loop, set loopThrough at 0 position in array
        //test loopThrough must be less than .length of array
        //add 1 ++ to loopThrough value on each loop
        for (int loopThrough = 0; loopThrough < sumArray.length; loopThrough++) {
            //for each loop, add ( += ) to sum, the number at position loopThrough in the array
            sum += sumArray[loopThrough];
        }
        System.out.println(sum);

        //can use the for loop to traverse each element in the array (var must be compatible! e.g. int) remember : used
        //var name testLoop this case
        for (int testLoop: sumArray){
            System.out.println(testLoop);
        }

        //can have arrays within arrays e.g. two dimensional array, declare with [][] for row and column
        int[][] twoDArray = {{3,4,2},{3},{43,2,12}};
        System.out.println(twoDArray[0][2]); //equals array 0, pos 2 = 2
        //can change value of array position after this
        twoDArray[0][2] = 34;
        //same statement for the same array position will now print new value
        System.out.println(twoDArray[0][2]); // same pos as above is now stored as 34
    }
}