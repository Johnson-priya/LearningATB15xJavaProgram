package InterviewCodingQuestions;

import java.util.Scanner;

public class FactorialForLOop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");

       int fact=1;
        if(sc.hasNextInt()) {
            int n=sc.nextInt();


            for (int i = 1; i <= n; i++) {
                fact = fact * i;
                //fact= n*(n+1)/2;
                //System.out.println(fact);
            }
            System.out.println(fact);
        }
        else{
            System.out.println("please enter valid input.");
        }
    }
}
