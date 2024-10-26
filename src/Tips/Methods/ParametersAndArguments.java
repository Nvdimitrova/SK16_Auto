package Tips.Methods;

public class ParametersAndArguments {

    /*
    When a parameter is passed to the method, it is called an argument.
    From the example below:
    name and age are parameters, while Nikol and 24 are arguments.
     */

    public static void main(String[] args) {
        name("Nikol", 24);
    }

    static void name(String name, int age){
        System.out.println(name + " is " + age);
    }
}