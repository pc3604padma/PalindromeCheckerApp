import java . util.Scanner;
import java.util.Stack;


public class PalindromeCheckerApp {

public static void main(String[] args)
{
    String input = "noon";
    // Create a Stack to store characters.
    Stack<Character> stack = new Stack<>();

    // Push each character of the string into the stack.
    for (char c : input.toCharArray()) {
        stack.push(c);
    }

    // Assume palindrome initially.
    boolean isPalindrome = true;

    // Iterate again through original string to check the palindrome condition.
    for (char c : input.toCharArray()) {
        if (c != stack.pop()) {
            isPalindrome = false;
            break; // Exit loop on first mismatch
        }
    }

    // Print the result.
    System.out.println("Input: " + input);
    System.out.println("Is Palindrome?: " + isPalindrome);
}
}

