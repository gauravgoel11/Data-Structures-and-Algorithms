import java.util.Scanner;

public class Prime {

  public static boolean PrimeNumm(int i) {
    boolean IsPrime = true;
    if (i == 1 && i == 2) {
      return true;
    } else {
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          IsPrime = false;
          break;
        }
      }
      return IsPrime;
    }
  }
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println(PrimeNumm(num));
  }
}
