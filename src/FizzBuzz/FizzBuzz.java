package FizzBuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    private static List<String> fizzBuzz(int num) {
        ArrayList<String> strArray = new ArrayList<>();
        for(int i = 1; i < num + 1; i++) {
            if(i % 15 == 0) {
                strArray.add("FizzBuzz");
            } else if (i % 3 == 0) {
                strArray.add("Fizz");
            } else if(i % 5 == 0) {
                strArray.add("Buzz");
            } else {
                strArray.add(String.valueOf(i));
            }
        }
        return strArray;
    }
    public static void main(String[] args) {
        System.out.println("Type your number");
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        List<String> strArr = FizzBuzz.fizzBuzz(Integer.parseInt(num));
        strArr.forEach(s -> System.out.println(s));
    }
}
