public class LettersToUpperCase {

  public static String toUpperCaString(String str) {
    StringBuilder sb = new StringBuilder("");
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);

    for (int index = 1; index < str.length(); index++) {
      if (str.charAt(index) == ' ' && index < str.length() - 1) {
        sb.append(str.charAt(index));
        index++;
        sb.append(Character.toUpperCase(str.charAt(index))); // Corrected this line
      } else {
        sb.append(str.charAt(index));
      }
    }
    return sb.toString(); // Corrected this line
  }

  public static void main(String[] args) {
    String str1 = "ram is a good boy";
    System.out.println(toUpperCaString(str1)); // Corrected this line
  }
}
