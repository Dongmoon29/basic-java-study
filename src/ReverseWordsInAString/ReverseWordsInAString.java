package ReverseWordsInAString;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInAString {
    // Given an lowerCaseInput string s, reverse the order of the words.
    // Return a string of the words in reverse order concatenated by a single space
    // Nice Apple => Apple Nice
    private static String reverseWordsInAString(String words) {
        List<String> strArray = Arrays.asList(words.split(" "));
        Collections.reverse(strArray);

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < strArray.size(); i++) {
            stringBuilder.append(strArray.get(i));
            if (i != strArray.size() - 1) stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    public static String reverseWords(String s) {
        StringBuffer sb = new StringBuffer();

        int i = s.length() - 1;

        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                i--;
            } else {
                int j = i;
                while (i >= 0 && s.charAt(i) != ' ') {
                    i--;
                }
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                for (int k = i + 1; k <= j; k++) {
                    sb.append(s.charAt(k));
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
//        System.out.println(ReverseWordsInAString.reverseWordsInAString("Nice Apple"));
        System.out.println(ReverseWordsInAString.reverseWords("Nice Apple"));
    }
}
