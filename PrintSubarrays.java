public class PrintSubarrays {
    public static void main(String[] args) {

        int arr[]={2,4,6,8,10};
        int ts =0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(arr[j2]+" ");
                    
                }
                ts++;

                System.out.println(" ");
                
            }
            // 
            
        }
        System.out.println("total sub arrays are : "+ts);
        
    }

    
}
