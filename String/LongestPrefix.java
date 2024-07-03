package Strings;

import java.util.Scanner;

public class LongestPrefix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextLine();
        }
        String result = longestCommonPrefix(arr, n);
        System.out.println("Longest Common Prefix: " + result);
        scanner.close();
    }

    public static String longestCommonPrefix(String[] arr, int n){
        if (n == 0){
            return "-1";
        }

        String prefix = arr[0];
        for (int i = 1; i < n; i++) {
            int j = 0;
            while (j < prefix.length() && j < arr[i].length() && prefix.charAt(j) == arr[i].charAt(j)) {
                j++;
            }
            prefix = prefix.substring(0, j);

            if (prefix.isEmpty()) return "-1";
        }

        return prefix;
    }
}
