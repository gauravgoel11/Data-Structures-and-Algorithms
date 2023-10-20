import java.util.Scanner;

public class Functions2 {

    public static int sum(int a,int b){// a nad b are parameter
        int add = a+b;
        // System.out.println(sum);
        return add;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int d= sc.nextInt();
        System.out.println(sum(c,d));//c and d are arguments
         sc.close();
    }
}
 