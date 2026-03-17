/**
 * HelloApp: UC5 - Use Enhanced For Loop for multiple arguments
 * @author Sourin
 * @version 5.0
 */
public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameList = new StringBuilder();
            for (String name : args) {
                if (nameList.length() > 0) {
                    nameList.append(", ");
                }
                nameList.append(name);
            }
            System.out.println("Hello, " + nameList.toString() + "!");
        }
    }
}