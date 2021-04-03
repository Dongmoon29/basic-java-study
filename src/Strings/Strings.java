package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Strings {
    public static void main(String[] args) {
        String hello = "Hello World!";

        String reverseHello = new StringBuffer(hello).reverse().toString();
        System.out.println(reverseHello);

        String a = "String a";
        String b = a;

        b = "Hello A";

        System.out.println("A = " + a);
        System.out.println("B = " + b);

    }
}
