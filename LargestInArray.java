
public class LargestInArray {

    public static void main(String[] args) {
        int arr[]={1,2,35,8,21,9,0,1,3,7,8,94,2,1,4,5};
        
        int large = Integer.MIN_VALUE;
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(large<=arr[i]){
                large=arr[i];
              j=i+1;
            }
            
        }
        System.out.println(large);
        System.out.println(j);
    }
}