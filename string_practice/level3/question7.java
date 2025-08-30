import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindromeByIterative(String str) {
        int start = 0;
        int end = str.length() - 1;
        
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeByRecursive(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindromeByRecursive(str, start + 1, end - 1);
    }

    public static boolean isPalindromeByArrayMethod(String str) {
        char[] original = str.toCharArray();
        char[] reversed = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            reversed[i] = str.charAt(str.length() - 1 - i);
        }

        for (int i = 0; i < str.length(); i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Checking palindrome using different methods:");

        if (isPalindromeByIterative(input)) {
            System.out.println("The string is a palindrome (iterative check).");
        } else {
            System.out.println("The string is not a palindrome (iterative check).");
        }

        if (isPalindromeByRecursive(input, 0, input.length() - 1)) {
            System.out.println("The string is a palindrome (recursive check).");
        } else {
            System.out.println("The string is not a palindrome (recursive check).");
        }

        if (isPalindromeByArrayMethod(input)) {
            System.out.println("The string is a palindrome (array method check).");
        } else {
            System.out.println("The string is not a palindrome (array method check).");
        }

        scanner.close();
    }
}
