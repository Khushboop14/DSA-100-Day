package Strings;

import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args) {
//        String str = "dad";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str;
        str = sc.nextLine();
        String revstr = revString(str);
        if(revstr.equals(str)){
            System.out.println("String "+ str + " is Palindrome");
        }
        else{
            System.out.println("String "+ str + " is not Palindrome");
        }
    }

    public static String revString(String str1){
        String rev = "";
        for(int i = str1.length()-1; i >= 0 ; i-- ){
            rev = rev+str1.charAt(i);
        }
            return rev;
    }
}
