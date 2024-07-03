package Strings;

import java.util.Scanner;

public class LargestOddNumber {
    public static String largestOddNumber(String num) {
        int i  = num.length()-1 ;
        for(; i >= 0 ; i--){
            if(num.charAt(i)%2 == 1){
                break;
            }
        }
        return num.substring(0, i+1 );

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        System.out.println(largestOddNumber(num));

    }
}


