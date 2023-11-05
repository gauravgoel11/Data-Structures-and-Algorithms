import java.util.Scanner;

public class InputArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int[] arr = new int[len];
    for (int i = 0; i < len; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    for (int j = 0; j < len; j++) {
      System.out.print(arr[j] + " ");
    }
  }
}
//adding a new comment