import java.util.*;


public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "man a plan a canal Panama";
        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        boolean isPalindrome = true;
        for (int i = 0; i < normalized.length() / 2; i++) {
            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break; // Exit the loop as soon as a mismatch is found
            }
        }
        System.out.println("Input: " + input + " " + isPalindrome);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}

