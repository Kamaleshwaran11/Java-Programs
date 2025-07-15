package String;

import java.util.*;
class Duplicate {
    public static String duplicate(String str){
        StringBuilder strbuild=new StringBuilder();
        boolean[] ans=new boolean[256];

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);

            if(!ans[c]){
                strbuild.append(c);
                ans[c]=true;
            }

        }
        return strbuild.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Duplicate obj=new Duplicate();
        String s=obj.duplicate(str);
        System.out.println("Original String:" +str);
        System.out.println("Remove duplicate:"+s);
    }
}