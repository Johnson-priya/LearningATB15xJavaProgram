package Coding_Test;
//print even nos using do-while
public class EvenNumbersUsingDoWhile {
    public static void main(String[] args) {
        int i=1;
        do{
            //System.out.println(i);
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }while (i<=50);

    }
}
