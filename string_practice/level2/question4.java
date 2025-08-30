import java.util.Scanner;

public class ShortestLongestWord {
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
            if (text.charAt(i) == ' ') spaceIndexes[idx++] = i;
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

    public static int[] findShortestLongest(String[][] wordLen) {
        int min = Integer.parseInt(wordLen[0][1]);
        int max = Integer.parseInt(wordLen[0][1]);
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < wordLen.length; i++) {
            int len = Integer.parseInt(wordLen[i][1]);
            if (len < min) {
                min = len;
                minIndex = i;
            }
            if (len > max) {
                max = len;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = manualSplit(text);
        String[][] wordLen = wordWithLength(words);
        int[] indexes = findShortestLongest(wordLen);
        System.out.println("Shortest: " + wordLen[indexes[0]][0] + " (" + wordLen[indexes[0]][1] + ")");
        System.out.println("Longest: " + wordLen[indexes[1]][0] + " (" + wordLen[indexes[1]][1] + ")");
    }
}
