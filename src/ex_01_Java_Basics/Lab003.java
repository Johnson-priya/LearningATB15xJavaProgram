package ex_01_Java_Basics;

import java.util.Scanner;

public class Lab003 {
    public static void main(String[] args) {

        //Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("first number:");
        int a= sc.nextInt();
        System.out.println("Second Number:");
        int b= sc.nextInt();
        System.out.printf("sum of %d and %d: %d%n" ,a, b, a+b);
        //System.out.printf("The sum of %d and %d is: %d%n" ,a,b,a+b);

    }
}
