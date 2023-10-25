import java.util.Scanner;

public class ArrayQuestion2 {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};

        Scanner sc = new Scanner(System.in);
        int i =sc.nextInt();

        for (int index = i; index < arr.length; index++) {
            System.out.print(arr[index]+" ");
            
        }
        for (int index = 0; index < i; index++) {
            System.out.print(arr[index]+" ");
            
        }

    }
}
+