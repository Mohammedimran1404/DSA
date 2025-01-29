package StringPrograms;

import java.util.HashSet;
import java.util.Set;

public class CountingOnlyRepeatedCharacters {
    public static void main(String[] args) {
        // Input string
        String input = "aaafffacvwww";

        // Call the compress method and print the result
        String compressed = compressString(input);
        System.out.println(compressed);
    }

    public static String compressString(String input) {
        // Initialize a StringBuilder for the result
        StringBuilder result = new StringBuilder();

        // Get the length of the input string
        int length = input.length();

        // Iterate through the string
        for (int i = 0; i < length; i++) {
            // Count occurrences of the current character
            char currentChar = input.charAt(i);
            int count = 1;

            while (i + 1 < length && input.charAt(i + 1) == currentChar) {
                count++;
                i++;
            }

            // Append the character to the result
            result.append(currentChar);

            // Append the count if greater than 1
            if (count > 1) {
                result.append(count);
            }
        }

        // Return the compressed string
        return result.toString();
    }
}
