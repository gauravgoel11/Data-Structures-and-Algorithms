import java.util.Scanner;

public class InputInJava {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in) ;
        String st = sc.next(); //for single word
        System.out.println(st);
        int input = sc.nextInt(); //for int value
        System.out.println(input);
        String line = sc.nextLine(); // for whole line   
        System.out.println(line);
        sc.close();
    }
}
 