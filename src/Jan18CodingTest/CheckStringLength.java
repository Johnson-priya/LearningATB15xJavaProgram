package Jan18CodingTest;
import java.util.Scanner;

public class CheckStringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        s=s.replaceAll("[^A-Za-z0-9]", "");

                if (s.length() > 10) {
                    System.out.println("Length of " + s + " is " + s.length() + " It is greater than 10.");
                } else {
                    System.out.println("will not print not greater than 10");
                }


    }
}

