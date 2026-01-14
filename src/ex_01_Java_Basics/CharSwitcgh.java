package ex_01_Java_Basics;

public class CharSwitcgh {
    public static void main(String[] args) {
        char ch='A';

        switch (ch){
            case 65:
                System.out.println("Match");
                break;
            default:
                System.out.println("not match");
                break;
        }
    }
}
