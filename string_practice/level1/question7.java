import java.util.Scanner;

public class NumberFormatDemo {
    public static void generateException(String s) {
        int num = Integer.parseInt(s);
        System.out.println("Converted number: " + num);
    }

    public static void handleException(String s) {
        try {
            int num = Integer.parseInt(s);
            System.out.println("Converted number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number string: ");
        String text = sc.next();
        handleException(text);
    }
}
