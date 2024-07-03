package Strings;

import java.lang.*;
import java.util.*;

public class BasicStringOperation {
    public static void main(String[] args) {
        String A, B;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter string A : ");
        String a = scanner.nextLine();
        System.out.print("enter string B : ");
        String b = scanner.nextLine();


        //sum of the length of string
        int sumlenstr = sumOfLenOfString(a,b);
        String compare = compareTo(a,b);
        String capital = capitalize(a,b);
        System.out.println("Sum of length of String A and B is :"+ sumlenstr);
        System.out.println("Is String A is Greater then String B? :"+ compare);
        System.out.println("Capitalization of String A and String B: "+capital);


    }
    //Sum of length of the String
    public static int sumOfLenOfString(String A, String B){
        int sumlen = A.length()+B.length();
        return sumlen;
    }
    // if String A is lexogicaly greater the String B ?
    public static String compareTo(String A, String B){
        return A.compareTo(B) > 0 ? "Yes" : "No";

    }
    //Capitalize the String A and B.
    public static String capitalize(String A, String B){
        String a = A.toUpperCase();
        String b = B.toUpperCase();
        return a + " " + b;
    }

}