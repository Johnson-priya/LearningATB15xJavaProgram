package ex_01_Java_Basics;

import java.util.Scanner;

public class Continue_For_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
