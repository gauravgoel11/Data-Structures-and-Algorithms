public class StringBuilders {

  public static void main(String[] args) {
    StringBuilder str4 = new StringBuilder("");
    for (char i = 'a'; i <= 'z'; i++) {
      str4.append(i);
    }
    System.out.println(str4);
    System.out.println(str4.length());
  }
}
