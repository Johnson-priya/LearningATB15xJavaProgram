package ex_01_Java_Basics;

import java.util.Scanner;

public class AdditionWithFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st no");
        int a=sc.nextInt();

        System.out.println("Enter 2nd no");
        int b=sc.nextInt();
        int sum= add(a,b);
        System.out.println("The sum of a nd b: " + sum);

    }

      static int add(int x, int y){

        return x+y;
    }
}
