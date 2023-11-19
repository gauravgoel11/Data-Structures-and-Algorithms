import java.util.Scanner;

public class ShortestPath {

  public static void main(String[] args) {
    int x = 0;
    int y = 0;
    double path;
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'N') {
        x++;
      } else if (str.charAt(i) == 'E') {
        y++;
      } else if (str.charAt(i) == 'W') {
        x--;
      } else if (str.charAt(i) == 'S') {
        y--;
      } else {
        System.out.println("please enter in capital N W S E");
      }
    }
    path = Math.sqrt((x * x) + (y * y));
    System.out.println(path);
    sc.close();
  }
}
