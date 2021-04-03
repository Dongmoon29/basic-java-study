package FizzBuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    private static List<String> fizzBuzz(int num) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        for(int i = 1 ; i <= num; i++) {
            if(i % 15 == 0) {
                stringArrayList.add("FizzBuzz");
            } else if(i % 3 == 0) {
                stringArrayList.add("Fizz");
            } else if(i % 5 == 0) {
                stringArrayList.add("Buzz");
            } else {
                stringArrayList.add(String.valueOf(i));
            }
        }
        return stringArrayList;
    }
    public static void main(String[] args) {
        System.out.println("Type your number");
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        List<String> strArr = FizzBuzz.fizzBuzz(Integer.parseInt(num));
        strArr.forEach(s -> System.out.println(s));
    }
}
