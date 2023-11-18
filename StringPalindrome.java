import java.util.Scanner;

public class StringPalindrome {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String pal =sc.next();
    // String pal = "racecar";
    boolean palindrom = false;
    for (int i = 0; i < pal.length() / 2; i++) {
      if (pal.charAt(i) != pal.charAt(pal.length() - i - 1)) {
        palindrom = false;
        break;
      } else {
        palindrom = true;
      }
    }
    System.out.print(palindrom);
    sc.close();
  }
}
