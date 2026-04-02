package com.codewithsk;
import java.util.*;
public class Arrays_Fun {

    public static void main(String args[]){
       // int[] num = new int[5];
        int[] num={100,620,322,24,126};
        System.out.println("length of an array:"+num.length); //length of an array



        for(int nums:num){
            System.out.print(" "+nums);
        }
System.out.println();
        Arrays.sort(num); //sort an array
        System.out.println("Sort an array:");
        for(int nums:num){
            System.out.print(" "+nums);
        }
    }}