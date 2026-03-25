/**
 * HelloApp: UC7 - Multiple arguments using String.join()
 * @author Sourin
 * @version 7.0
 */
public class HelloApp {
    public static void main(String[] args) {
        String nameList = (args.length > 0) ? String.join(", ", args) : "World";
        System.out.println("Hello, " + nameList + "!");
    }
}