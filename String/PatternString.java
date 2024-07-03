package Strings;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatternString {

        public static List<String> pattern(String S) {
            List<String> pattern = new ArrayList<>();

            for (int i = S.length(); i > 0; i--) {
                pattern.add(S.substring(0, i));
            }

            return pattern;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            List<String> patternList = pattern(input);
            for (String line : patternList) {
                System.out.println(line);
            }
        }
    }


