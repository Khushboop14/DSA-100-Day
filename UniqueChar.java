package Strings;

import java.util.Scanner;

public class UniqueChar {
    public static int findFirstUniqueCharIndex(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        int[] charCounts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (charCounts[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        int index = findFirstUniqueCharIndex(input);
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("No unique character found");
        }
    }
    }
