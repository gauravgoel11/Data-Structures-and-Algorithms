public class SearchInSortedMatrix {

  public static void main(String[] args) {
    int matrix[][] = {
      { 1, 2, 3, 4 },
      { 5, 6, 7, 8 },
      { 9, 10, 11, 12 },
      { 13, 14, 15, 16 },
    };

    int key = 0;

    int row = 0;
    int colm = matrix[0].length - 1;
    boolean keyFound = false;

    while (row <= matrix.length - 1 && colm >= 0) {
      if (key == matrix[row][colm]) {
        System.out.println("Position is " + (row+1) + "," + (colm+1));
        keyFound = true;
        break;
      } else if (key > matrix[row][colm]) {
        row++;
      } else if (key < matrix[row][colm]) {
        colm--;
      }
    }

    if (!keyFound) {
      System.out.println("Key not found");
    }
  }
}
