import java.util.Scanner;

public class SumOfFirstNNaturalNumber {

  public static int SumOfFirstNNaturalNumber(int value) {
    int sum = 0;
    for (int i = 0; i <= value; i++) {
      sum = sum + i;
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int value = sc.nextInt();
    System.out.println(SumOfFirstNNaturalNumber(value));
  }
}
