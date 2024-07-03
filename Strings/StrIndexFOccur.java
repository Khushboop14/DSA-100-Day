package Strings;
import java.util.Scanner;

public class StrIndexFOccur {
        public int strStr(String haystack, String needle) {
            if (needle.isEmpty()) {
                return 0;
            }

            int hLen = haystack.length();
            int nLen = needle.length();

            for (int i = 0; i <= hLen - nLen; i++) {
                int j;
                for (j = 0; j < nLen; j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        break;
                    }
                }
                if (j == nLen) {
                    return i;
                }
            }

            return -1;
        }

        public static void main(String[] args) {
            StrIndexFOccur solution = new StrIndexFOccur();
            Scanner scanner = new Scanner(System.in);
            String haystack = scanner.nextLine();
            String needle = scanner.nextLine();
            int result = solution.strStr(haystack, needle);
            System.out.println("Index of needle in haystack: " + result);

        }
    }
