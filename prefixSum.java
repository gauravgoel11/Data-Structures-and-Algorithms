public class prefixSum {

    public static void prefixsum(int arr[]){

        for (int i = 0; i < arr.length-1; i++) {
            arr[i+1]=arr[i+1]+arr[i];
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {  
        int arr[]= {2,3,4,5,6,7,8,8};
        prefixsum(arr);

    }
}
