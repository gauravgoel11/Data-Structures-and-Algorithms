import java.util.Scanner;

public class DiagonalSum {

  public static void arrInsertion(int row, int colm, int matrix[][]) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("please enter Matrix");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < colm; j++) {
        matrix[i][j] = Sc.nextInt();
      }
    }
    // for (int i = 0; i < matrix.length; i++) {
    //     for (int j = 0; j < matrix[0].length; j++) {
    //         System.out.print(matrix[i][j]+ " ");

    //     }
    //     System.out.println(" ");
    Sc.close();
    // }

  }

  public static void diagonalSum(int matrix[][]) {
    int sum = 0;

    // Loop for the secondary diagonal
    for (int i = 0; i < matrix.length; i++) {
      for (int j = matrix[0].length - 1; j >= 0; j--) {
        if (i + j == matrix.length - 1) {
          sum = sum + matrix[i][j];
        }
      }
    }

    // Loop for the main diagonal
    for (int k = 0; k < matrix.length; k++) {
      sum = sum + matrix[k][k];
    }

    System.out.println(sum);
  }

  public static void main(String[] args) {
    int row;
    int colm;
    Scanner Sc = new Scanner(System.in);

    System.out.print("please enter row :  ");
    row = Sc.nextInt();
    System.out.print("please enter Column :  ");
    colm = Sc.nextInt();
    int matrix[][] = new int[row][colm];
    arrInsertion(row, colm, matrix);
    diagonalSum(matrix);

    Sc.close();
  }
}
