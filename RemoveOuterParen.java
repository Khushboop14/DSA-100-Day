//package Strings;
//
//import java.util.Scanner;
//
//public class RemoveOuterParen{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        while (n > 0) {
//            String paran = scanner.nextLine();
//            n--;
//        }
//
//        public static String removeOuterParen(String s) {
//            StringBuilder result = new StringBuilder();
//            int open = 0;
//            int temp = 0;
//
//            for (int i = 0; i < s.length(); i++) {
//                if (s.charAt(i) == '(') {
//                    if (open == 0) {
//                        temp = i;
//                    }
//                    open++;
//                } else if (s.charAt(i) == ')') {
//                    open--;
//                    if (open == 0) {
//                        result.append(s.substring(temp + 1, i));
//                    }
//                }
//            }
//
//            return result.toString();
//        }
//    }
//}
//
//
//
//
//
