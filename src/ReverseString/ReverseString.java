package ReverseString;

public class ReverseString {
    // Write a function that reverse a string.
    // The input string is given as an array of characters char[]
    public static String reverseString(char[] chars) {
        StringBuilder charsToStr = new StringBuilder();
        for(char cha : chars) {
            charsToStr.append(cha);
        }
        charsToStr.reverse();
        return charsToStr.toString();
    }

    public static String reverseString2(char[] chars) {
        int left = 0; // a, b, c
        int right = chars.length - 1; // 2
        while(left < right) {
            char tmp = chars[left];// tmp : a
            chars[left] = chars[right]; // chars[0] => c
            chars[right] = tmp;
            left++;
            right--;
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
//        System.out.println(ReverseString.reverseString(new char[] {'a', 'b', 'c'}));
        System.out.println(ReverseString.reverseString2(new char[] {'a', 'b', 'c', 'd', 'f', 'g'}));

    }

}
