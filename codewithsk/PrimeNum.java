package com.codewithsk;

import java.util.Scanner;

public class PrimeNum {
    public static boolean prime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();

        if(prime(num)){
            System.out.println(num+ " is a prime num");
        }
        else{
            System.out.println(num+ " is not a prime");
        }
    }
}
