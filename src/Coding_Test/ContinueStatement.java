package Coding_Test;

public class ContinueStatement {
    public static void main(String[] args) {

        int i=0;
        while (i<=10){
            i++;
            if(i==5){
                continue;
                //i++;
            }
            System.out.println(i);
            //i++;
        }
    }
}
