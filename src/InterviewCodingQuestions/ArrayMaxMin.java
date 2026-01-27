package InterviewCodingQuestions;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int arr1[]={34, 67, 6, 9, 90, 100};
        int max=arr1[0];
        for(int i=0; i<arr1.length;i++){
            if(arr1[i]>max){
                max= arr1[i];
            }
        }
        System.out.println(max);

    }
}
