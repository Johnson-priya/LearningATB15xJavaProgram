package InterviewCodingQuestions;

public class SecondHighestElementArray {
   public static void main(String[] args) {



       int[] arr={12,78,120, 56, 90, 34, 23, 12,89,100};
       int max=arr[0];
       int   secondMax= 0;//use null to detect "not found"
       for(int i=0;i<= arr.length-1;i++){
           if(arr[i]>max){
               max=arr[i];
           }
       }
       System.out.println(max);
       for(int i=0;i<=arr.length-1;i++) {
           if (arr[i] < max) {
               if(secondMax==0 || arr[i]>secondMax){
                   secondMax=arr[i];
               }

           }
       }
       System.out.println(secondMax);




    }
}
