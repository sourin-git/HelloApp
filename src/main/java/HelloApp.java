/**
 * HelloApp: UC4 - Display Hello with Multiple Command-Line Arguments
 * @author Sourin
 * @version 4.0
 */
public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            StringBuilder names = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                names.append(args[i]);
                if (i < args.length - 1) {
                    names.append(", ");
                }
            }
            System.out.println("Hello, " + names.toString() + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}