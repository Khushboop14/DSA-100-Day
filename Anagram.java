package Strings;
import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        String str1, str2;
        Scanner scanner = new Scanner(System.in);
        str1 = scanner.nextLine();
        str2 = scanner.nextLine();
        boolean result =  isAnagram( str1, str2);
        System.out.println(result);
    }
   public static boolean isAnagram(String s1, String s2){
       s1 = s1.replaceAll("\\s", "").toLowerCase();
       s2 = s2.replaceAll("\\s", "").toLowerCase();
       if (s1.length() != s2.length()) {
           return false;
       }
       char[] charAr1 = s1.toCharArray();
       char[] charAr2 = s2.toCharArray();
       Arrays.sort(charAr1);
       Arrays.sort(charAr2);
       return  Arrays.equals(charAr1, charAr2);
    }
}
