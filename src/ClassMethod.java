// The CLASS declares the object. An object has behaviours (METHODs)
public class ClassMethod {

/* START CASE 1 - CALL UP A METHOD

    // the METHOD defines behaviours. DECLARE the method - give it a name - sayHello (camel case)
    static void sayHello() {
        System.out.println("Hello, I am a method");
    }
    static void saySomethingElse() {
        System.out.println("I can be run as many times as you like");
        System.out.println("and now I am tired");
    }

    // can then call up this METHOD within MAIN
    public static void main (String [] args) {
        // here:
        sayHello();
        // you can call up the METHOD as many times as you like.
        // the program reads the METHOD, goes to it, runs it, then goes back to the next line in the code e.g:
        sayHello();
        sayHello();
        saySomethingElse();
    }
    // the METHOD is called up in the above and the arguments (ATTRIBUTES) within are used/run

FIN */

/* NEXT CASE 2 - ARGUMENTS

    // you can use ARGUMENTS with methods, this is what the 'args' means in the MAIN method e.g.
    // declare the variable when declaring the method within () and the variable type
    // multiples can be used - declare with var type by comma e.g. anotherOne below:
    static void sayName (String aStringVar, String anotherOne){
        // use it somewhere
        System.out.println("Hello " + aStringVar + " " + anotherOne);
    }

    public static void main(String [] args) {
    // now use the () after calling up the method (the args brackets) to answer the argument e.g.
        sayName("Dennis", "and Mike");
    }
Fin */

// CASE 3 - RETURN a value from a METHOD

    // can use the "return" KEYWORD to return a value from a method. In this case,
    // need to declare variable type in place of VOID e.g. sum:
    static double sum (double input1, double input2, double input3){
        double part1 = input1 * input2 + 7.5;
        double part2 = part1 / 2 + input3;
        //state return keyword then function THIS is what will come out of the method
        return part2 + input2 / input3;
    }
    public static void main(String [] args) {
        double result = sum(3, 2, 3);
        System.out.println(result);

    // this references to the ToolboxTest class. Reference the class, space, give it a name the =new [CLASS] ();
        ToolboxTest catClass = new ToolboxTest();
    // call up the created name for the class reference. then "." into the method within the class and will run!
        catClass.catHello();
    }
}

