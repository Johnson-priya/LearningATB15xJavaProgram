package ex_01_Java_Basics;

public class StringQ {
    public static void main(String[] args) {
        String s1 = "Johnson";
        String s2 = new String("Priya");
        System.out.println(s1.concat(s2)); // where s1.concat(s2) this will be allocated in String constant
        // pool or Object Area?
    }

}
