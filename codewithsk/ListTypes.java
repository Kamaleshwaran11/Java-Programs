package com.codewithsk;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTypes {
    public static void main(String args[]){
        ArrayList<Integer> A=new ArrayList<>();
        A.add(23);
        A.add(34);
        A.add(12);
        A.add(0,22);

        System.out.println(A);
        ArrayList<Integer> B=new ArrayList<>();
        B.add(223);
        B.add(334);
        B.add(124);
        B.add(0,232);

        System.out.println(B);

        //two ArrayList In One
        A.addAll(1,B);
        System.out.println(A);
System.out.println(A.get(4));

        List<String> S=new ArrayList<>();
        S.add("kam");
        S.add("sk");
        S.add(0,"sss");
        System.out.println(S);

        List<String> L=new LinkedList<>();
        L.add("ss");
        L.add("kamalesh");
        System.out.println(L);
        L=new ArrayList<>(L);


    }
}
