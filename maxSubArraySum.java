public class maxSubArraySum { 


    public static void subarr(int arr[]){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int j2 = i; j2 <=j; j2++) {

                    // System.out.print(arr[j2]+" ");
                    sum = sum +arr[j2];
                }
                
                System.out.println(sum);
                sum =0;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        subarr(arr);

         
    }
}
