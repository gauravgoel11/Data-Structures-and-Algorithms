import java.util.Scanner;

public class TwoSum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int[] arr = new int[len];
    arr[0] = sc.nextInt();
    arr[1] = sc.nextInt();
    for (int i = 2; i < arr.length; i++) {
      arr[i] = arr[i - 1] + arr[i - 2];
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    sc.close();
  }
}
//adding a new comment something