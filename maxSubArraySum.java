public class maxSubArraySum {

  public static void subarr(int arr[]) {
    int sum = 0;
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        for (int j2 = i; j2 <= j; j2++) {
          // System.out.print(arr[j2]+" ");
          sum = sum + arr[j2];
          if (maxSum < sum) {
            maxSum = sum;
          }
        }

        System.out.println(sum); 
        sum = 0;
      }
    }
    System.out.println("Max sum is :" + maxSum);
  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 6, 8, 10 };
    subarr(arr);
    //adding a cooment

  }
}
