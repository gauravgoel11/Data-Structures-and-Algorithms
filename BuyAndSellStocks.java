public class BuyAndSellStocks {
    public static void main(String[] args) {
        int arr[]= {7,1,5,3,6,4};
        int smallest = arr[0];
        int k=0;
        
        for (int i = 0; i < arr.length; i++) {
            if (smallest>=arr[i]) {
                smallest=arr[i];
                k=i;
                
            }
            else{
                break;
                
            }
            
        }
        int largest=smallest;
        for (int i = k; i < arr.length; i++) {
            if (largest<arr[i]) {
                largest=arr[i];

                
            }
        }
        
        System.out.println(largest-smallest);
    }
}
