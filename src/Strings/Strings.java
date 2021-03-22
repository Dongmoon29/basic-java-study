package Strings;

public class Strings {
    public static void main(String[] args) {
        String hello = "Hello World!";

        String reverseHello = new StringBuffer(hello).reverse().toString();
        System.out.println(reverseHello);

    }
}
