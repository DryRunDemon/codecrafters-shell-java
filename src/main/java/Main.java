import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("$ ");
            String input = scanner.nextLine().trim();

            // Check for 'exit' command
            if (input.startsWith("exit")) {
                String[] tokens = input.split("\\s+");
                int exitCode = 0; // Default to 0
                if (tokens.length >= 2) {
                    try {git
                        exitCode = Integer.parseInt(tokens[1]);
                    } catch (NumberFormatException e) {
                        // If the argument is not a valid number, keep exitCode = 0
                    }
                }
                System.exit(exitCode);
            }

            System.out.println(input + ": command not found");
        }
    }
}
