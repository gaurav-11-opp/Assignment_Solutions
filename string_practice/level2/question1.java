import java.util.Scanner;

public class StringLengthDemo {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int manualLength = findLength(text);
        int builtinLength = text.length();
        System.out.println("Manual length: " + manualLength);
        System.out.println("Built-in length: " + builtinLength);
    }
}
