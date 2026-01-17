package Coding_Test;

public class BreakStatement {
    public static void main(String[] args) {

        int i=1;
        while(i<=10){
           if(i==5){
               // System.out.println("stop the loop");
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
