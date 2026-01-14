package ex_01_Java_Basics;

import java.util.Scanner;

public class IfElse1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        if(age>18){
            System.out.println("can vote");
        }
        else{
            System.out.println("can not vote");
        }
    }
}
