import java.util.Arrays;

public class KthSmallest {

    // Function to return K'th smallest element
    static int kthSmallest(int[] arr, int K) {
        // Sort the array in ascending order (default)
        Arrays.sort(arr);

        // Return K'th smallest element
        return arr[K - 1];
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19};
        int K = 2;
        System.out.println("K'th Smallest Element is: " + kthSmallest(arr, K));
    }
}
