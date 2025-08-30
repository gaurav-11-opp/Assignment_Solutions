import java.util.Scanner;
public class WordLength2D {
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
    public static String[] manualSplit(String text) {
        int len = findLength(text);
        int spaceCount = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') spaceCount++;
        }
        int[] spaceIndexes = new int[spaceCount + 2];
        int idx = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }
        spaceIndexes[0] = -1;
        spaceIndexes[spaceCount + 1] = len;
        String[] words = new String[spaceCount + 1];
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                sb.append(text.charAt(j));
            }
            words[i] = sb.toString();
        }
        return words;
    }
    public static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = manualSplit(text);
        String[][] wordLen = wordWithLength(words);
        System.out.println("Word\tLength");
        for (int i = 0; i < wordLen.length; i++) {
            System.out.println(wordLen[i][0] + "\t" + Integer.parseInt(wordLen[i][1]));
        }
    }
}
