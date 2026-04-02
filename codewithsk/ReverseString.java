package com.codewithsk;


public class ReverseString {
    public static void main(String args[]){
        String org="kamalesh";
        String rev="";
        char ch;

        for(int i=0;i<org.length();i++)
        {
            ch=org.charAt(i);
            rev=ch+rev;

        }
        System.out.println(rev);

        StringBuilder stb=new StringBuilder();
        stb.append(org);
        stb.reverse();
        System.out.println(stb);
    }
}
