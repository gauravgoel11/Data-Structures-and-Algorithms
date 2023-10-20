import java.util.*;

public class Factorial {


    public static void fact(int i){

        int fact=1 ;
        if (i<0) {System.out.println("factorial doesn't exist");
            
        }
        else if(i==0){fact =1;
            System.out.println("factorial is 1 ");

        }
        else{
            for (int j = 1; j <= i; j++) {
                fact = fact*j;
            }
            System.out.println("factorial is "+fact);
        }

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
        sc.close();

//my factorial code

    }
}
