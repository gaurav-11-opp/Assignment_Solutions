import java.util.Scanner;

public class CharacterFrequency {

    public static char[] uniqueCharacters(String str) {
        boolean[] visited = new boolean[256];
        int uniqueCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!visited[ch]) {
                visited[ch] = true;
                uniqueCount++;
            }
        }

        char[] uniqueChars = new char[uniqueCount];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (visited[ch]) {
                uniqueChars[index++] = ch;
                visited[ch] = false;
            }
        }

        return uniqueChars;
    }

    public static int[][] characterFrequency(String str) {
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        char[] uniqueChars = uniqueCharacters(str);
        int[][] result = new int[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = uniqueChars[i];
            result[i][1] = freq[uniqueChars[i]];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[][] frequencies = characterFrequency(input);

        System.out.println("Character frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println((char) frequencies[i][0] + " : " + frequencies[i][1]);
        }
        
        scanner.close();
    }
}
