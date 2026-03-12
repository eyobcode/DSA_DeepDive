/*
 * BIG O ANALYSIS DEMO - Deep Dive Edition
 * Run this file to see real timing differences
 */
public class BigO_Analysis {

    public static void main(String[] args) {
        int n = 100_000;

        System.out.println("=== BIG O DEMO (n = " + n + ") ===");

        // O(1) - Constant
        long start = System.nanoTime();
        System.out.println("O(1) - Array access: " + accessArray(n));
        printTime(start);

        // O(n) - Linear
        start = System.nanoTime();
        linearSearch(n);
        printTime(start);

        // O(n²) - Quadratic
        start = System.nanoTime();
        quadratic(n);
        printTime(start);

        // O(log n) - Binary Search (demo on sorted array)
        start = System.nanoTime();
        binarySearchDemo(n);
        printTime(start);
    }

    private static int accessArray(int n) {
        int[] arr = new int[n];
        return arr[42]; // O(1)
    }

    private static void linearSearch(int n) {
        for (int i = 0; i < n; i++) {
            // O(n)
        }
    }

    private static void quadratic(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count++; // O(n²)
            }
        }
    }

    private static void binarySearchDemo(int n) {
        // Simulate binary search on 1..n
        int low = 1, high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            low = mid + 1; // just for demo
        }
    }

    private static void printTime(long start) {
        long time = System.nanoTime() - start;
        System.out.printf("Time taken: %.2f ms%n", time / 1_000_000.0);
    }
}
