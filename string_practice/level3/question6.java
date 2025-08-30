import java.util.Scanner;

public class CharacterFrequency {

    public static String[] characterFrequency(String str) {
        char[] chars = str.toCharArray();
        int[] freq = new int[chars.length];
        String[] result = new String[chars.length];
        
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                freq[i] = 1;
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        freq[i]++;
                        chars[j] = '0';
                    }
                }
                result[i] = chars[i] + ": " + freq[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] frequencies = characterFrequency(input);

        System.out.println("Character frequencies:");
        for (String freq : frequencies) {
            if (freq != null) {
                System.out.println(freq);
            }
        }
        
        scanner.close();
    }
}
