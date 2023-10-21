import java.util.Scanner;

/**
 * PrimeNumber
 */
public class PrimeNumber {

    public static boolean prime(int t){
        if (t==2 || t==1) {
            return true;
        }
        else{
            for (int i = 2; i <= t-1; i++) {
                if (t%i==0) {
                    return false;
                    
                }     
            }
            return true;
        } 
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
       boolean b= prime(t);
       System.out.println(b);
        sc.close();
    }
}
