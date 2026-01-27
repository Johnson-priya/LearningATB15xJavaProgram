package InterviewCodingQuestions;

import java.util.Scanner;

public class Palinderome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String user_input=sc.next();
        String rev="";

        for(int i=user_input.length()-1;i>=0;i--){
            rev = rev + user_input.charAt(i);
        }

        if(rev.equalsIgnoreCase(user_input)){
            System.out.println("This is Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
