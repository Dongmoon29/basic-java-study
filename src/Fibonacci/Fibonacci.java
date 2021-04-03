package Fibonacci;

public class Fibonacci {
    public static int getFibonacci(int n) {
        // 피보나치 수열 1, 1, 2, 3, 5, 8, 13, 21 ....
        // ToDo
        int a1 = 1;
        int a2 = 1;
        int a3 = 0;

        for(int i=1; i<=8; i++) {
            a3 = a1 + a2;
            a1 = a2;
            a2 = a3;
        }
        return a3;

    }

    public static int getFibonacci2(int n) {
        // 피보나치 수열 1, 1, 2, 3, 5, 8, 13, 21 ....
        // ToDo
        if(n >= 0) {
            if(n <= 1) {
                return n;
            }
            return getFibonacci2(n - 1) + getFibonacci2(n - 2); //
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci.getFibonacci(10));
//        System.out.println(Fibonacci.getFibonacci2(10));
    }
}
