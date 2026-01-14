package ex_01_Java_Basics;

public class TernaryOperatorEvenOdd {
    public static void main(String[] args) {
        int a=200;
        String even= a%2==0 ? "Even":"Odd";
        System.out.println(even);
    }
}
