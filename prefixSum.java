public class prefixSum {

    public static void prefixsum(int arr[]){
        int sum;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length-1; i++) {
            arr[i+1]=arr[i+1]+arr[i];
            
        }

    for (int i = 0; i < arr.length; i++) {
        for (int j = i; j < arr.length; j++) {
            sum= i==0?arr[j]:arr[j]-arr[i-1];

            if (maxsum<sum) {
                maxsum=sum;
                
            }
            
        }
    }
    System.out.println(maxsum);
        
    }
    public static void main(String[] args) {  
        int arr[]= {1,-2,6,-1,3};
        prefixsum(arr);

    }
}
