/**
 * HelloApp: UC2 - Display Hello with Command-Line Argument
 * @author Sourin
 * @version 2.0
 */
public class HelloApp {
    public static void main(String[] args) {
        // Check if at least one argument was provided
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}