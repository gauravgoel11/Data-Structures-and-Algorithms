import java.util.Scanner;

/**
 * Day2
 */
public class Day2 {

  public static int BinarySearch(int arr[], int key) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (key > arr[mid]) {
        start = mid + 1;
      } else if (key < arr[mid]) {
        end = mid - 1;
      } else if (key == arr[mid]) {
        return mid;
      }
    }
    return -1;
  }

  public static void reverseArray(int arr[]) {
    int temp = 0;
    for (int i = 0; i < (arr.length) / 2; i++) {
      temp = arr[i];
      arr[i] = arr[arr.length - 1 - i];
      arr[arr.length - 1 - i] = temp;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] arr = new int[num];
    for (int i = 0; i < num; i++) {
      arr[i] = sc.nextInt();
    }
    // int key = sc.nextInt();
    // System.out.println(BinarySearch(arr, key));
    reverseArray(arr);
    for (int i = 0; i < num; i++) {
      System.out.print(arr[i]+" ");
    }
  }
}
