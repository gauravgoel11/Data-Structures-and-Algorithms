import java.util.Scanner;


public class PrimeInRange {



    public static boolean prime(int t) {
        if (t <= 1) {
            return false;
        }
        if (t == 2) {
            return true;
        }
        if (t % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= t; i += 2) {
            if (t % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    
public static void PrintPrime(int i){


    for (int j = 2; j < i; j++) {
        if(prime(j)){
            System.out.print(j+" ");
        }

        
    }
}

    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        int i = sc.nextInt();
        PrintPrime(i);
        sc.close();
    }
}
