import java.util.Scanner;

/**
 * BinomialCoefficent
 */
public class BinomialCoefficent {

    public static int fact(int n){

        int fact=1 ;
        if (n<0) {System.out.println("factorial doesn't exist");
            
        }
        else if(n==0){fact =1;
            // System.out.println("factorial is 1 ");

        }
        else{
            for (int j = 1; j <= n; j++) {
                fact = fact*j;
            }
            // System.out.println("factorial is "+fact);
        }
        return fact;
        
    }
    public static void binomialcoefficent(int n,int r){

        int bc = fact(n)/(fact(r)*fact(n-r));
        System.out.println(bc);
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter n");
        int n=sc.nextInt();
        System.out.println("please enter r");
        int r = sc.nextInt();
        binomialcoefficent(n, r);
        sc.close();
    }
}
