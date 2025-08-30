import java.util.Scanner;

public class VowelConsonantProgram {
    public static String checkChar(char c) {
        if (c >= 'A' && c <= 'Z') {
            c = (char)(c + 32);
        }
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not";
    }

    public static String[][] findVowelsConsonants(String text) {
        int len = text.length();
        String[][] arr = new String[len][2];
        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            arr[i][0] = String.valueOf(c);
            arr[i][1] = checkChar(c);
        }
        return arr;
    }

    public static void display2DArray(String[][] arr) {
        System.out.println("Character\tType");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] result = findVowelsConsonants(text);
        display2DArray(result);
    }
}
