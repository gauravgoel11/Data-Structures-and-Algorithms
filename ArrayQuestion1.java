public class ArrayQuestion1 {

  public static boolean checkrepeatedelement(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          return true; // Return true if a repeated element is found.
        }
      }
    }
    return false; // No repeated elements were found.
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3 };
    boolean b = checkrepeatedelement(arr);
    System.out.println(b);
  }
}
