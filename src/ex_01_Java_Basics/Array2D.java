package ex_01_Java_Basics;

public class Array2D {
    public static void main(String[] args) {
        int[][] array_2D=new int[4][3];

        for (int i=0;i<4;i++){
            for (int j=0;j<3;j++){
                System.out.print(array_2D[i][j] + " ");
            }
            System.out.println();
        }

        for(int n[] : array_2D){
            for (int m: n){
                System.out.print(m + " ");
            }
            System.out.println("");
        }
    }
}
