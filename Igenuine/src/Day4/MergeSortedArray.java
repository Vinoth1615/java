import java.util.Scanner;

class MergeSortedArray {
    public static void mergeArray() {
        // Initialize two arrays
        int[] arr1 = initializeArray();
        int[] arr2 = initializeArray();

        // Calculate the total size of the merged array
        int size = arr1.length + arr2.length;
        int[] merged = new int[size];

        // Merge `arr1` and `arr2` into `merged`
        int i = 0, j = 0, k = 0;

        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        // Display the merged array
        System.out.println("Merged Array:");
        displayArray(merged);

        // Sort the merged array
        int[] sortedResult = sort(merged);

        // Display the sorted array
        System.out.println("Sorted Array:");
        displayArray(sortedResult);
    }

    public static int[] sort(int[] arr) {
        int size = arr.length;

        // Sort the array using Bubble Sort
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) { // Swap if out of order
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] initializeArray() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = s.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array values:");

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        return arr;
    }

    public static void displayArray(int[] arr) {
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        mergeArray();
    }
}