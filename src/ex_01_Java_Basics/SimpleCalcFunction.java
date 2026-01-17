package ex_01_Java_Basics;

import java.util.Scanner;

public class SimpleCalcFunction {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=readInt(sc, "Enter the num1:");
        int b=readInt(sc, "Enter the num2:");

        int sumOfNo=sum(a,b);
        int diffOfNo=sub(a,b);
        int divOfNo=div(a,b);
        int result_mul = mul(a, b);
        int result_mod = mod(a, b);
        System.out.println(sumOfNo);
        System.out.println(diffOfNo);
        System.out.println(result_mul);
        System.out.println(divOfNo);
        System.out.println(result_mod);



    }

     static int readInt(Scanner sc, String msg) {
         System.out.println(msg);
         if(sc.hasNextInt()){
            return sc.nextInt();
        }else{
            System.out.println("Enter the int only");
            System.exit(0);
            return 0;

        }

         //return 0;
     }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int mod(int a, int b) {
        return a % b;
    }
}
