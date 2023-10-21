import java.util.Scanner;

/**
 * BinaryToDecimal
 */
public class BinaryToDecimal {


    public static void binarytodec(int i){
        int pow=0;
        int dec =0;

        while (i>0) {
            int last = i%10;
            dec =  dec + (((int)Math.pow(2, pow))*last);
            pow = pow+1;
            i = i/10;
            
        }
        System.out.println(dec);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        int i = sc.nextInt();
        binarytodec(i);
        sc.close();
        
    }
}
