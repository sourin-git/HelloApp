/**
 * HelloApp: UC3 - Handle Command-Line Arguments with Defaults
 * @author Sourin
 * @version 3.0
 */
public class HelloApp {
    public static void main(String[] args) {
        String name = (args.length > 0) ? args[0] : "World";
        System.out.println("Hello, " + name + "!");
    }
}