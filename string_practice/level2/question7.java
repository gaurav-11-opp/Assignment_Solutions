import java.util.Scanner;

public class TrimStringCharAt {
    public static int[] findTrimIndexes(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    public static String substringCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
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
        String text = sc.nextLine();
        int[] indexes = findTrimIndexes(text);
        String trimmedCustom = substringCharAt(text, indexes[0], indexes[1]);
        String trimmedBuiltin = text.trim();
        boolean isSame = compareStrings(trimmedCustom, trimmedBuiltin);
        System.out.println("Original: [" + text + "]");
        System.out.println("Custom Trim: [" + trimmedCustom + "]");
        System.out.println("Built-in Trim: [" + trimmedBuiltin + "]");
        System.out.println("Are both equal? " + isSame);
    }
}
