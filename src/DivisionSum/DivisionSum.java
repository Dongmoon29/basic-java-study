package DivisionSum;

public class DivisionSum {
    // Write a method that takes in an integer n,
    // then iterates through all the numbers from 0 to n,
    // and returns the sum of numbers which are dividable by 5 or 7
    public static int getDivisionSum(int n) {
        int total = 0;
       for(int i = 0; i <= n; i++) {
           if(i % 5 == 0 || i % 7 == 0) {
               total += i;
           }
       }
       return total;
    }

    public static void main(String[] args) {
        System.out.println(DivisionSum.getDivisionSum(49));
    }
}
