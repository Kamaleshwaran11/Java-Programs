package com.codewithsk;
import java.lang.*;
public class Strings {
    public static void main(String args[]){

        String n="hi,this is mr.tamizhan " + "from chennai";
        System.out.println(n);//output for string
        System.out.println(n.length());//string length
        System.out.println(n.endsWith("w"));
        System.out.println(n.indexOf("c"));
        System.out.println(n.replace('m','t'));
        System.out.println(n.replace("from","to"));
    }
}
