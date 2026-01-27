package InterviewCodingQuestions;

public class ReverseStringUsingForLoop {
    public static void main(String[] args) {

        String s1="Johnson";
        String rev="";

     //Start from last index (length - 1) and go till 0
        for(int i=s1.length()-1; i>=0;i--){  //s1.length() - 1 gives the position of the last letter.
            rev=rev + s1.charAt(i); // add each character at the end

        }
        System.out.println(rev);

    }
}
