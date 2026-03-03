import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String input = scanner.nextLine();

        // Normalize input
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Algorithm 1
        long startTime1 = System.nanoTime();
        boolean result1 = isPalindromeUsingReverse(processedInput);
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;

        // Algorithm 2
        long startTime2 = System.nanoTime();
        boolean result2 = isPalindromeUsingTwoPointers(processedInput);
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;

        // Algorithm 3
        long startTime3 = System.nanoTime();
        boolean result3 = isPalindromeRecursive(processedInput, 0, processedInput.length() - 1);
        long endTime3 = System.nanoTime();
        long duration3 = endTime3 - startTime3;

        // Display Results
        System.out.println("\n===== Performance Comparison =====");
        System.out.println("Input: " + input);

        System.out.println("\nAlgorithm 1: StringBuilder Reverse");
        System.out.println("Is Palindrome? " + result1);
        System.out.println("Execution Time: " + duration1 + " ns");

        System.out.println("\nAlgorithm 2: Two-Pointer Technique");
        System.out.println("Is Palindrome? " + result2);
        System.out.println("Execution Time: " + duration2 + " ns");

        System.out.println("\nAlgorithm 3: Recursive Method");
        System.out.println("Is Palindrome? " + result3);
        System.out.println("Execution Time: " + duration3 + " ns");

        scanner.close();
    }

    // Algorithm 1
    public static boolean isPalindromeUsingReverse(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Algorithm 2
    public static boolean isPalindromeUsingTwoPointers(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Algorithm 3
    public static boolean isPalindromeRecursive(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return isPalindromeRecursive(str, left + 1, right - 1);
    }
}