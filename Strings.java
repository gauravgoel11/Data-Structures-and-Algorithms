import java.util.Scanner;

public class Strings {

  public static void main(String[] args) {
    char arr[] = { 'a', 'b', 'c', 'd' };
    String str = "abcd";
    String str2 = new String("xyz");
    Scanner sc = new Scanner(System.in);
    String Str3 = sc.nextLine();
    System.out.println(Str3);
    sc.close();
    String name = "Gaurav";
    String sirname = "Goel";
    String fullname = name + " " + sirname;
    System.out.println(arr);
    System.out.println(str);
    System.out.println(str2);
    System.out.println(fullname);
    
  }
}
