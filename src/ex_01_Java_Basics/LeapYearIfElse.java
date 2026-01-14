package ex_01_Java_Basics;


import java.util.Scanner;

public class LeapYearIfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a year:");
        int year=sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){ //leap year formula
            System.out.println("This year is leap year");
        }else {
            System.out.println("this is not leap year");
        }
    }
}
