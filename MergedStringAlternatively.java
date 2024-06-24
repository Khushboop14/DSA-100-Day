package Strings;
import java.util.Scanner;

public class MergedStringAlternatively {

        public static String mergeAlternately(String word1, String word2) {
            // declares StringBuffer type variable
            //(StringBuffer is a class in Java that provides mutable sequences of characters,
            //making it suitable for constructing strings through concatenation.)

            StringBuffer merged = new StringBuffer();

            //storing the word with minimum length from word1 and word2
            int minLength = Math.min(word1.length(), word2.length());
            for (int i = 0; i < minLength; i++) {

//used append method of string buffer class which append the
//single character in the StringBuffer (merged) string.
                merged.append(word1.charAt(i));
                merged.append(word2.charAt(i));
            }

            //subString() will extract the substring from the orignal string from minLength to end
            // and will append to the StringBuffer.

            merged.append(word1.substring(minLength)).append(word2.substring(minLength));

            // The toString() method of the StringBuffer class is used to convert
            // the StringBuffer object to a regular String.
            //This is necessary because mergeAlternately method is supposed to return a String, not a StringBuffer.

            return merged.toString();
        }

        public static void main(String args[]) {
            String word1, word2;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first word:");
            word1 = sc.nextLine();
            System.out.println("Enter second word:");
            word2 = sc.nextLine();
            String result = mergeAlternately(word1, word2);
            System.out.println("Merged string: " + result);
            sc.close();
        }
    }


