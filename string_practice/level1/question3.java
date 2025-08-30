import java.util.Scanner;

public class CharArrayCompare {
    public static char[] toCharArrayManual(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        char[] manual = toCharArrayManual(text);
        char[] builtin = text.toCharArray();

        System.out.println("Manual array: " + new String(manual));
        System.out.println("Built-in array: " + new String(builtin));
        System.out.println("Comparison result: " + compareArrays(manual, builtin));
    }
}
