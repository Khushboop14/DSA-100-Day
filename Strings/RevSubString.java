package Strings;

import java.sql.SQLOutput;
import java.util.Scanner;


public class RevSubString {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String s = scanner.nextLine();
        int lIndex = scanner.nextInt();
        int rIndex= scanner.nextInt();
        String rev = revSubString(s, lIndex, rIndex);
        System.out.println(rev);
    }

    private static String revSubString(String s, int lIndex, int rIndex) {
        //extract the substring from the string
       String substrTorev =  s.substring(lIndex, rIndex+1);

       //rev the substring using reverse() of StringBuffer class
        String revsubstr = new StringBuffer(substrTorev).reverse().toString();

        // rebuild the string
        String result = s.substring(0 , lIndex) + revsubstr + s.substring(rIndex+1);
       return result;
    }
}
