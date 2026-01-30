package Jan18CodingTest;

import java.util.Scanner;

public class TotalNoOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                count++;
            }
        }
        System.out.println("The no of Character in String: " + count);
    }
}
