package ex_01_Java_Basics;

public class StringFunctionExample {
    public static void main(String[] args) {
//        String s1="JAVA";
//        char c=s1.charAt(2); //charAt indexed from 0 to length-1.
//        System.out.println(c);
//
//        int res="Johnson".compareTo("Priya"); // this method compares first digit
//        int res1="Priya".compareTo("Johnson");
//        System.out.println(res);
//        System.out.println(res1);
//        int idx= "java".indexOf("a");
//        System.out.println(idx);
//
//        int idx1="java".lastIndexOf("a");
//        System.out.println(idx1);
//
//        Boolean b=" ".isEmpty();
//        System.out.println(b);
//
//        String s3=String.join("#", "Johnson", "Priya");
//        System.out.println(s3);
//
//        String s4="Java".replace("a", "o");
//        System.out.println(s4);

        String s5="  Johnson Priya  ";
        System.out.println(s5.trim()); //trim() removes leading and trailing whitespace.
                                        //Does not remove spaces in the middle.
                                        //Returns a new string.
                                        //Use strip() (Java 11+) for full Unicode whitespace support.
    }
}
