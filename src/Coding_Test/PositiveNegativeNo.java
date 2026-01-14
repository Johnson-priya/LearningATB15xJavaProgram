package Coding_Test;

import java.util.Scanner;

public class PositiveNegativeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a no: ");
        int a=sc.nextInt();

        String result= (a<0) ? "Number is Negative": (a==0) ? "Number is Zer0":"Number is positive";

//        if(a==0){
//            System.out.println("No is zero");
//        }

        System.out.println(result);
    }
}
