package InterviewCodingQuestions;

import java.util.Scanner;

public class VowelsConsonantCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        s=s.toLowerCase();
        int vol=0; int con=0;

        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);

            if(Character.isLetter(ch)){ //This ignores spaces, digits, and punctuation automatically.
                                        // Only A–Z/a–z (and other alphabetic letters) are considered.
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
                    vol++;
                }else
                    con++;



            }
        }
        System.out.println("No. of vowels: " + vol);
        System.out.println("No of consonants: " + con);

    }
}
