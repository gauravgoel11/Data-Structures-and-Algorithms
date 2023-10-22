public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int target = 10;
        int position = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                position = i + 1; // Add 1 to i to get the 1-based position.
                break;
            }
        }

        if (position != -1) {
            System.out.println("Position is " + position);
        } else {
            System.out.println("Element not found, returning -1");
        }
    }
}
