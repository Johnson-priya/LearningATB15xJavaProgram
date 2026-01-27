package ex_01_Java_Basics;

import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        String marks[]=new String[size];
        for (int i=0; i< marks.length;i++){
            System.out.println("Enter the marks");
            marks[i]=sc.next();

        }
        System.out.println("=================");

        for (int i=0;i< marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
