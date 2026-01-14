package ex_01_Java_Basics;

import java.util.Scanner;

public class MaxOfTwoNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first no:");
        int a=sc.nextInt();
        //int a=20;
        System.out.println("enter 2nd no:");
        int b=sc.nextInt();
        //int b=30;
        if(a>b){
            System.out.println("a is max");
        }else{
            System.out.println("b is max");
        }
    }
}
