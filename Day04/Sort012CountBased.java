// Java Program to sort an array of 0s, 1s and 2s
// by counting the occurrence of 0s, 1s and 2s

public class Sort012CountBased {

    // Function to sort the array of 0s, 1s and 2s
    static void sort012(int[] arr) {
        int n = arr.length;
        int c0 = 0, c1 = 0, c2 = 0;

        // Count 0s, 1s and 2s
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                c0 += 1;
            else if (arr[i] == 1)
                c1 += 1;
            else
                c2 += 1;
        }

        int idx = 0;

        // Place all the 0s
        for (int i = 0; i < c0; i++)
            arr[idx++] = 0;

        // Place all the 1s
        for (int i = 0; i < c1; i++)
            arr[idx++] = 1;

        // Place all the 2s
        for (int i = 0; i < c2; i++)
            arr[idx++] = 2;
    }

    // Main method to test the sorting
    public static void main(String[] args) {
        int[] a = { 0, 1, 2, 0, 1, 2 };
        int n = a.length;

        sort012(a); // sort the array

        // Print the sorted array
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
