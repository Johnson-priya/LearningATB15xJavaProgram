package Coding_Test;
import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice:");
        if(sc.hasNextInt()) {
            int choice = sc.nextInt();
            System.out.println("Enter 1st No:");
            double a = sc.nextDouble();
            System.out.println("Enter 2nd No:");
            double b = sc.nextDouble();
            switch (choice) {
                case 1:
                    System.out.println("The substraction of a & b is: " + (a - b));
                    break;
                case 2:
                    System.out.println("The addition of a & b is: " + (a + b));
                    break;
                case 3:
                    if(b==0){
                        System.out.println("can not divided by 0");
                        break;
                    }
                    System.out.println("The divison of a & b is: " + (a / b));
                    break;
                case 4:
                    System.out.println("The multiplication of a & b is: " + (a * b));
                    break;
                default:
                    System.out.println("please insert valid choice from 1to 4");
                    break;

            }
        }else{
           System.out.println("invalid choice");
       }




    }
}
