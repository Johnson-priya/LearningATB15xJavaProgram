package ex_01_Java_Basics;

import java.util.Scanner;

public class signOfNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no");
        int a = sc.nextInt();
        if(a>0){
            System.out.println("a is positive");
        }else {
            System.out.println("a is negative");
        }

    }
}

