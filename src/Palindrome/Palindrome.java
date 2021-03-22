package Palindrome;

public class Palindrome {
    private static boolean isPalindrome(int n) {
        // n = 101
        if(n < 0 || (n % 10 == 0 && n != 0)) return false;
        int reversedNum = 0; //123
        while(n > reversedNum) {
            int pop = n % 10;
            // pop = 1
            reversedNum = reversedNum * 10 + pop; // reversedNum = 1
            // n = 10
            n = n / 10;
        }
        return n == reversedNum || n == reversedNum / 10;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome(101));
    }
}
