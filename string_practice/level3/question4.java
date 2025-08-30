import java.util.Scanner;

public class CharFrequency {
    public static int[][] findFrequencies(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) count++;
        }
        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int[][] frequencies = findFrequencies(text);
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println((char)frequencies[i][0] + " - " + frequencies[i][1]);
        }
    }
}
