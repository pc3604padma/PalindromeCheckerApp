import java.util.*;


public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "madan";
        boolean isPalindrome = checkString(input, 0, input.length() - 1);
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome: " + isPalindrome);
    }

    private static boolean checkString(String s, int start, int end) {
        // Base case 1: If the start index crosses or meets the end index, the string is a palindrome
        if (start >= end) {
            return true;
        }

        // Base case 2: If characters at the current start and end positions don't match, it's not a palindrome
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive step: Check the inner substring
        return checkString(s, start + 1, end - 1);
    }
}

