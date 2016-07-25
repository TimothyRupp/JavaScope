/**
 * Created by timot on 7/25/2016.
 */
public class JavaScope {

    // field that is accessible to all methods of this class
    private static int x =1;


    // method main creates and initializes a local variable x
    public static void main(String[] args){

        int x =5; //method's local variable x shadows field x
        System.out.printf("local x in main method is %d%n", x);

        useLocalVariable(); //useLocalVariable has local x
        useField(); //useField uses class scope's field x
        useLocalVariable(); //re-initializes local x
        useField(); // class scope's field x retains its value

        System.out.printf("%nlocal x in main method is %d%n", x);

    }

    //create and initialize local variable x during each call
    public static void useLocalVariable(){
        int x = 25;

        System.out.printf("%nlocal x on entering method useLocalVariable is %d%n" , x);
        ++x; // modify local variable x
        System.out.printf("%nlocal x before exiting method useLocalVariable is %d%n" , x);
    }

    //modify class Scope's field x during each call
    public static void useField(){
        System.out.printf("%nfield x on entering the useField method is %d%n", x);
        x *= 10; //modify Class Scope's field x
        System.out.printf("field x before exiting the useField method is %d%n", x);

    }

}//end class JavaScope

