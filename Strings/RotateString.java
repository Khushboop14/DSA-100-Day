package Strings;
import java.util.Scanner;

public class RotateString {
    public static Boolean rotateString(String s, String g){
        if(s.length() == g.length() && (s+s).contains(g))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1, goal;
        str1 = sc.nextLine();
        goal = sc.nextLine();
        System.out.println(rotateString(str1,goal));

    }
}
