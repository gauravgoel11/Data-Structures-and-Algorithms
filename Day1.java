import java.util.*;

public class Day1 {

  public static int LineaSearch(int arr[], int key) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        return i + 1;
      }
    }

    return -1;
  }

  public static int Largest(int arr[]) {
    int large = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > large) {
        large = arr[i];
      }
    }
    return large;
  }

  //   public static int SecondLargest(int arr[]) {
  //     Arrays.sort(arr);
  //     int secLargest = arr[arr.length - 1];
  //     for (int i = arr.length - 1; i > 0; i--) {
  //       if (arr[i] == secLargest && arr[i] != arr[i - 1]) {
  //         secLargest = arr[i - 1];
  //         break;
  //       }
  //     }
  //     return secLargest;
  //   }
  public static int SecondLargest(int arr[]) {
    if (arr.length < 2) {
      return -1; // Return -1 for arrays with less than 2 elements
    }

    int largest = Integer.MIN_VALUE;
    int secLargest = Integer.MIN_VALUE;

    for (int num : arr) {
      if (num > largest) {
        secLargest = largest;
        largest = num;
      } else if (num > secLargest && num != largest) {
        secLargest = num;
      }
    }

    return (secLargest == Integer.MIN_VALUE) ? -1 : secLargest;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    int[] arr = new int[num];
    for (int i = 0; i < num; i++) {
      arr[i] = sc.nextInt();
    }

    // 		int Key = sc.nextInt();
    System.out.println(SecondLargest(arr));
  }
}
