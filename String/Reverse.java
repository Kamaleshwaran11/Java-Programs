package String;
import java.util.*;
public class Reverse {
    public static String reverseStr(String str) {
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            rev=ch+rev;
        }
        return rev;
    }
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string to reverse:");
    String input=sc.nextLine();

    System.out.println("Reverse the String:"+reverseStr(input));
}
}

