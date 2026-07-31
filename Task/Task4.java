import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text: ");
        String text = scanner.nextLine();
        System.out.println("You entered: " + text);

        StringBuilder sb1 = new StringBuilder(text);
        String reversedText = sb1.reverse().toString();
        // System.out.println("Reversed text: " + reversedText);

        if (text.equals(reversedText)) {
            System.out.println("This is Case Sensitive: Your input is a palindrome.");
        } else {
            // NESTED IF: if hindi pumasa sa unang state dahil sa case sensitive
            if (text.equalsIgnoreCase(reversedText)) {
                System.out.println("This is IgnoreCase: Your input is palindrome");
            } else {
                // Not Palindrome in any form
                System.out.println("Your text input is not a palindrome.");
            }
        }
        scanner.close();
    }
}
