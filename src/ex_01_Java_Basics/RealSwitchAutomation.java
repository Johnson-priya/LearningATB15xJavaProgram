package ex_01_Java_Basics;
import java.util.Scanner;

public class RealSwitchAutomation {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter your browser:");
        String browser=sc.next();
          browser=browser.toLowerCase();
        switch (browser){
            case "chrome":
                System.out.println(" Chrome is starting");
                break;
            case "firefox":
                System.out.println("FireFox is starting");
                break;
            case "edge":
                System.out.println("MicrosoftEdge is starting");
                break;
            default:
                System.out.println("this browser is not valid");
                break;
        }

    }





}
