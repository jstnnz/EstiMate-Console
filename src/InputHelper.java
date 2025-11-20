package src;
import java.util.Scanner;

/**
 * Helper class for robust input validation and re-prompting.
 */
public class InputHelper {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Prompt for a non-empty string.
     */
    public static String promptString(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            if (input != null && !input.trim().isEmpty()) {
                return input.trim();
            }
            System.out.println("Input cannot be empty. Please try again.");
        }
    }

    /**
     * Prompt for a positive double value.
     */
    public static double promptPositiveDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                double value = Double.parseDouble(scanner.nextLine());
                if (value > 0) {
                    return value;
                }
                System.out.println("Value must be positive. Please try again.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please try again.");
            }
        }
    }

    /**
     * Prompt for a menu option (integer in range).
     */
    public static int promptMenuOption(String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            try {
                int value = Integer.parseInt(scanner.nextLine());
                if (value >= min && value <= max) {
                    return value;
                }
                System.out.println("Option must be between " + min + " and " + max + ".");
            } catch (NumberFormatException e) {
                System.out.println("Invalid option. Please enter a number.");
            }
        }
    }
}
