package ReverseString;

public class ReverseString {
    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder();
        for(int i = input.length(); i >= 0; i--) {
            char position = input.charAt(i - 1);
            sb.append(position);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("abc"));
    }
}
