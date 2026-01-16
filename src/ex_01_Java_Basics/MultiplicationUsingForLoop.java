package ex_01_Java_Basics;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MultiplicationUsingForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        int a=sc.nextInt();

        System.out.println("Multiplication table of 5:");

        for(int i=1; i<=10; i++){
            System.out.println(a*i);
        }

    }


}
