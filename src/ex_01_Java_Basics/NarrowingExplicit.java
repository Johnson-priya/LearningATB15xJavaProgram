package ex_01_Java_Basics;

public class NarrowingExplicit {
    public static void main(String[] args) {
        int course= 100;
        float NSRT= 18.45f;
       // int total= course + (int)NSRT; //narrowing Explicit
        //System.out.println(total);  //here we are losing .5
    float total2= course + NSRT;  // widening implicit
        System.out.println(total2);
    }
}
