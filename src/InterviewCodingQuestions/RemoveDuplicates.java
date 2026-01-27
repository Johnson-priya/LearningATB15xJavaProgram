package InterviewCodingQuestions;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        String result="";

        for(int i =0;i<s.length();i++){
            char ch=s.charAt(i);

            if(result.indexOf(ch)==-1){ //Character not added before
                                        //if result DOES NOT contain ch, add it i
                                        // f character is not availble in resulted string then it will add first occured char in the new string
                result+=ch;
            }
        }
        System.out.println(result);
    }
}
