package JavaPractice;

import java.util.Scanner;


public class HassNextLine {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter multiline text (terminate with Ctrl+D or Ctrl+Z)
        System.out.println("Enter multiline text (terminate with Ctrl+D or Ctrl+Z):");

        // Read multiline input until Ctrl+D or Ctrl+Z is pressed
        StringBuilder multilineText = new StringBuilder();
        int line = 0;
        while (scanner.hasNextLine()) {
            multilineText.append(scanner.nextLine()).append("\n");
            line++;
        }
        System.out.println(line);

        // Close the scanner to release resources
        scanner.close();

        // Count the number of lines
        int numberOfLines = countLines(multilineText.toString());

        // Print the result
        System.out.println("Number of lines: " + numberOfLines);
    }

    // Function to count lines in a multiline string
    private static int countLines(String text) {
        // Split the string by the newline character
        String[] lines = text.split("\n");

        // Return the number of lines
        return lines.length;
    }
}
