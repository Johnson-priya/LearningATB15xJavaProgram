package ex_01_Java_Basics;

import java.util.Scanner;

public class GradeCalcIfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the score between 0-100");
        int score=sc.nextInt();
        if(score < 0 || score >100){
            System.out.println("it is invalid");
        } else if (score >= 90) {
            System.out.println("A");
            
        } else if (score>=80) {
            System.out.println("B");
            
        } else if (score>=70) {
            System.out.println("C");

        }else if (score>=60){
            System.out.println("D");
        }else {
            System.out.println("F");
        }

    }
}

//90–100 → A
//80–89 → B
//70–79 → C
//60–69 → D
//        <60 → F
