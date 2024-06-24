package Strings;

import java.util.Scanner;

class RevStringWord {
    public static void main(String args[]) {
        // Initialize the input string
        String s;

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Read the entire line of input and store it in the string 's'
        s = scanner.nextLine();

        // Initialize an empty string to store the reversed words
        String revString = "";

        // Loop through the string from the last character to the first
        for (int i = s.length() - 1; i >= 0; i--) {
            // Skip any trailing spaces at the end of the string
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            // If 'i' is less than 0, it means we've processed the entire string, so break the loop
            if (i < 0) {
                break;
            }

            // Mark the end position of the current word
            int j = i;

            // Move 'i' to the left until we encounter a space or the beginning of the string
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }


            // If revString is empty, set it to the current word (this handles the first word)
            if (revString.isEmpty()) {
                revString = s.substring(i + 1, j + 1);;
            } else {
                // If revString is not empty, add a space before the current word and append it
                revString = revString + " " +  s.substring(i + 1, j + 1);
            }
        }

        // Print the reversed string
        System.out.println(revString);
    }
}
