import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void generateException(String s) {
        System.out.println(s.charAt(s.length() + 1));
    }

    public static void handleException(String s) {
        try {
            System.out.println(s.charAt(s.length() + 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        handleException(text);
    }
}
