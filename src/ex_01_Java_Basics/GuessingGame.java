package ex_01_Java_Basics;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Random random=new Random();
        int numberToGuess= random.nextInt(100);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");

        int attempts=0;

        while (true){

            if(!sc.hasNextInt()){
                System.out.println("Invalid Input!");
                sc.next();//here it will wait for user to enter next valid input
                continue;
            }
            int guess=sc.nextInt();
            attempts++;

            if(guess<numberToGuess){
                System.out.println("Number is too low");
            } else if (guess>numberToGuess) {
                System.out.println("Number is too high");

            }else {
                System.out.println("Correct! You have taken --> " + attempts);
                break;
            }


        }

    }
}
