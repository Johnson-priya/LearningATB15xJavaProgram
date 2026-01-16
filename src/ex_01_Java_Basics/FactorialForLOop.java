package ex_01_Java_Basics;

import java.util.Scanner;

public class FactorialForLOop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        long fact=1L;

        for(int i=1; i<=n;i++){
            fact=fact*i;
            //System.out.println(fact);
        }
        System.out.println(fact);
    }
}
