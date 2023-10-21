import java.util.Scanner;

public class DecimalToBinary {

    
    public static void decToBinary(int i){
        int power =0;
        int bin =0;
        while (i>0) {
            bin = bin +((int)Math.pow(10,power)*(i%2));
            i=i/2;
            power++;
        }
        System.out.println(bin);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        int i = sc.nextInt();
        decToBinary(i);
        sc.close();
    }
}
