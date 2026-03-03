import java.util.*;
import java.util.Stack;

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {


public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instantiate the strategy
        PalindromeStrategy strategy = new StackStrategy();

        System.out.print("Input: ");
        String input = scanner.nextLine();

        // Perform the check
        boolean result = strategy.check(input);

        System.out.println("Is Palindrome: " + result);

        scanner.close();
    }
}
