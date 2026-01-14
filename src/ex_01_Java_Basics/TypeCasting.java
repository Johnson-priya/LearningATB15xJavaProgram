package ex_01_Java_Basics;

public class TypeCasting {
    public static void main(String[] args) {
        byte b= 10;
        int a=b;  // valid syntax - implicit widening done by JVM
        int a1=(int)b; // valid explicit widening
    }
}
