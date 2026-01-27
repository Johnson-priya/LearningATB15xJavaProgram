package ex_01_Java_Basics;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        sb.toString();

//        sb.append("Hello");
//        System.out.println(sb);
//
//        sb.insert(5, " World ");
//        //sb.replace(0, 5, "Java");
//        sb.delete(5, 11);
        System.out.println(sb);
    }
}
