package ex_01_Java_Basics;

public class StringEx1 {
    public static void main(String[] args) {
//        String name="Priya";//String constant Pool
//        String s1=new String("Hello"); //Object Area
//
//        s1=name.concat(" World ");
//        System.out.println(s1);
//        System.out.println(s1.length());


        String s2 = new String("Priya");

        System.out.println(s2 == "Priya");  // false
        System.out.println(s2.equals("Priya"));  // true

    }
}
