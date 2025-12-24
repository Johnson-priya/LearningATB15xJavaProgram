package ex_01_Java_Basics;
import java.util.Scanner;

public class Lab04_To_Three_Max {
    public static void main(String[] args) {

        int n1 = 2;

        int n2 = 9;

        int n3 = -11;


// Using nested ternary operator to find the maximum
        int max = (n1 >= n2 && n1 >= n3) ? n1 : (n2 >= n1 && n2 >= n3) ? n2 : n3;


        System.out.println(max);

    }
}
