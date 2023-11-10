import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int row;
        int colm;
        System.out.print("please enter row :  ");
        row=Sc.nextInt();
        System.out.print("please enter Column :  ");
        colm=Sc.nextInt();
        int matrix[][]=new int[row][colm];
        System.out.println("please enter Matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                matrix[i][j]=Sc.nextInt();
                
            }   
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+ " ");
                
            }
            System.out.println(" ");
        }     
        Sc.close();
    }
    
}