package ex_01_Java_Basics;

public class NestedTernaryOperator {
    public static void main(String[] args) {
        int age=21;
        String x= age > 18 ? (age > 25 ? "Can go" : "Cant go") : "cant go";
        System.out.println(x);
    }
}
