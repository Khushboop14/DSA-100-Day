package Strings;
import java.util.Scanner;
public class MaxMinOccurence {
    public static char maxCharFun(String s){
        s = s.replaceAll("\\s", ""); // replace space with empty
        int arr[] = new int[256];
        int maxFreq = -1;
        char ch = ' ';
        for(int i = 0 ; i < s.length(); i++){

            /*
             if string is aabbbcc:
             arr[s.charAt(0)] and on 0th index there is a. whose ASCII value is 96. so it will be
             arr[96], at 96th index its value is 0. so its value will be updated by 1,
             and the value of arr[96] will be 1.
             and will be update to 2 and so on for multiple a in the string present.
            */

           int a =  arr[s.charAt(i)]++;

           /*
              If current character's frequency is greater than maxFreq
              Or if current character's frequency is equal to maxFreq but is lexicographically smaller than maxChar
            */
            if (arr[s.charAt(i)] > maxFreq ||
                    (arr[s.charAt(i)] == maxFreq && s.charAt(i) < ch)){
                maxFreq = arr[s.charAt(i)]; //update maxFreq.
                ch = s.charAt(i);
            }

        }

        return ch;
    }

    public static char minCharFun(String s){
        s = s.replaceAll("\\s", ""); // replace space with empty
        int arr[] = new int[256];
        int minFreq = Integer.MAX_VALUE;
        char ch = ' ';
        for(int i = 0 ; i < s.length(); i++){
            int a =  arr[s.charAt(i)]++;
            if (arr[s.charAt(i)] < minFreq && arr[s.charAt(i)] > 0) {
                minFreq = arr[s.charAt(i)]; // Update minFreq
                ch = s.charAt(i);
            }

        }

        return ch;
    }
    public static void main(String args[]) {
        String str ;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        char maxchar = maxCharFun(str);
        char minchar = minCharFun(str);

        System.out.println("Maximum character occurs in the string" +str + "is :  "+ maxchar);
        System.out.println("Maximum character occurs in the string" +str + "is :  "+ minchar);

    }
}
