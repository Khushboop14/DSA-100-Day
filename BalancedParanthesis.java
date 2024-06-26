package Strings;

import java.util.Stack;
import java.util.Scanner;

public class BalancedParanthesis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        while (n > 0) {
            String paranthesis = scanner.nextLine();
            if (isBalanced(paranthesis)) {
                System.out.println("Balanced");
            } else {
                System.out.println("Not Balanced");
            }
            n--;
        }

        scanner.close();
    }

    public static boolean isBalanced(String paranthesis) {
        Stack<Character> stack = new Stack<>();
        for (char ch : paranthesis.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char last = stack.pop();
                if ((ch == ')' && last != '(') ||
                        (ch == '}' && last != '{') ||
                        (ch == ']' && last != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
