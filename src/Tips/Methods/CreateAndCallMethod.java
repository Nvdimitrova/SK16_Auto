package Tips.Methods;

public class CreateAndCallMethod {

        /*
    static means that the method belongs to the
    Main class not an object of the Main class.

    void means that this method does not have a return value

    myMethod() is the name of the method
     */

    static void myMethod() {
        System.out.println("I just got executed!");
    }

    public static void main(String[] args) {
        myMethod();
    }
}