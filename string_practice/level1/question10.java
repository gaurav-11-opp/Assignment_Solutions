import java.util.Scanner;
public class ToLowerCaseDemo {
    public static String toLowerManual(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result.append((char)(c + 32));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String manual = toLowerManual(text);
        String builtin = text.toLowerCase();
        System.out.println("Manual lowercase: " + manual);
        System.out.println("Built-in lowercase: " + builtin);
        System.out.println("Comparison result: " + compareStrings(manual, builtin));
    }
}
