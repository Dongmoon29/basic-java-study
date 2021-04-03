package Anagram;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    // returns true when 2 input string anagram
    public static boolean areAnagrams(String a, String b) {

        char[] str1 = a.replace(" ", "").toLowerCase().toCharArray();
        char[] str2 = b.replace(" ", "").toLowerCase().toCharArray();

        if (str1.length != str2.length) return false;

        int numberOfChars = 256;

        int[] count1 = new int[numberOfChars];
        int[] count2 = new int[numberOfChars];

        for(int i = 0; i < str1.length; i++) {
            count1[str1[i]]++;
            count2[str2[i]]++;
            System.out.println(count1[str1[i]]++);
            System.out.println(count2[str2[i]]++);
        }

        for (int i = 0; i < numberOfChars; i++) {
            if (count1[i] != count2[i]) return false;
        }

        return true;
    }
    public static boolean areAnagrams2(String a, String b) {

        char[] str1 = a.replace(" ","").toLowerCase().toCharArray();
        char[] str2 = b.replace(" ","").toLowerCase().toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);
        String sortedStr1 = new String(str1);
        String sortedStr2 = new String(str2);

        if(sortedStr1.equals(sortedStr2)) return true;
        return false;
    }

    public static boolean isAnagram(String a, String b) {
        if(a.length() == 0 || b.length() == 0) return false;
        char[] charArrA = a.replace("", " ").toLowerCase().toCharArray();
        char[] charArrB = b.replace("", " ").toLowerCase().toCharArray();

        Arrays.sort(charArrA);
        Arrays.sort(charArrB);

        String strA = new String(charArrA);
        String strB = new String(charArrB);

        if(strA.equals(strB)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
//        System.out.println(Anagram.areAnagrams("wowow iiaab", "owwow aiaiz"));
//        System.out.println(Anagram.areAnagrams2("wowow iiaa", "owwow aiai"));
        System.out.println(Anagram.isAnagram("wowow iiaa", "owwow aiai"));
    }
}
