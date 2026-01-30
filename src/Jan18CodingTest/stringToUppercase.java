package Jan18CodingTest;

import java.util.Scanner;

public class stringToUppercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        s=s.toUpperCase();
        System.out.println(s);
    }
}
