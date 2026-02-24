import java.util.*;


public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "refer";

// Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

// Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.add(c);
        }

// Flag to track palindrome result
        boolean isPalindrome = true;

// Continue comparison while more than one element exists
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();
            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

// Print the result (as shown in the image output)
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}

