package Coding_Test;

import java.util.Scanner;

public class MaxOfTwoNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a First no:");
        int a=sc.nextInt();

        System.out.println("Enter a Second no:");
        int b=sc.nextInt();

        String result=a>b ? "First no is max" : "Second no is max";

        System.out.println(result);



    }
}
