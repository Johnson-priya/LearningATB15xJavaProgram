package ex_01_Java_Basics;

public class ForIfLoop1 {
    public static void main(String[] args) {
        for(int age = 0; age<18; age++){
            if(age>15){
                System.out.println("will get a gift");
            }else{
                System.out.println("No gift");
            }
        }
    }
}
