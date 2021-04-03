package Palindrome;

public class Palindrome {
    public static Boolean isPalindrome(String input) {
        if(input == null || input.length() == 0) return false;
        StringBuilder sb = new StringBuilder();
        for(int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        if(input.equals(sb.toString())) return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("I2 did did I"));


    }
}
