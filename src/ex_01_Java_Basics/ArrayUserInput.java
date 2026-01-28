package ex_01_Java_Basics;

import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int marks[]=new int[size];
        for (int i=0; i< marks.length;i++){
            System.out.println("Enter the marks");
            marks[i]=sc.nextInt();

        }
        System.out.println("=================");

        for (int i=0;i< marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
