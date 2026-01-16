package ex_01_Java_Basics;

import java.util.Scanner;

//Print sum of 10 natural numbers
public class NaturalNumbersSum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
       int sum=0;
//        int n=10;
        for(int i=1; i<=n;i++){
             sum=sum + i;
            //System.out.println(sum);
        }
        System.out.println(sum);
    }
}
