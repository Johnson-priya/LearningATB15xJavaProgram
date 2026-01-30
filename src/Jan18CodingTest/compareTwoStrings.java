package Jan18CodingTest;

public class compareTwoStrings {
    public static void main(String[] args) {
        String s1=new String("priya");
        String s2="Priya";

        if(s1.equalsIgnoreCase(s2))
        System.out.println("Both strings are equal");
        else{
            System.out.println("Not equal");
        }

    }


}
