package InterviewCodingQuestions;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter side 1:");
        int s1=sc.nextInt();

        System.out.println("enter side 2:");
        int s2=sc.nextInt();

        System.out.println("enter side 3:");
        int s3=sc.nextInt();

        if(s1 == s2 && s2 == s3){
            System.out.println("the triangle is equilateral");

        } else if (s1 == s2 || s2 == s3 || s1==s3) {
            System.out.println("the triangle is isoscales");
            
        }else {
            System.out.println("the trianngle is scalene");
        }

    }
}
