package ex_01_Java_Basics;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("entering the values using CLI");
        int age=Integer.parseInt(args[0]);// entering input using CLI

        if(age>18){
            System.out.println("can vote");
        }else{
            System.out.println("can not vote");
        }
    }
}
