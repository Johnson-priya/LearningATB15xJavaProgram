package Coding_Test;
import java.util.Scanner;

public class ExplicitTypeCasting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no of double data type: ");
        double b= sc.nextDouble();
        int i=(int)b;
        System.out.println("converted double into int value:" + i);

       // System.out.println(int i=(int)12.9);

    }
}
