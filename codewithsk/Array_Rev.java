package com.codewithsk;
import java.util.*;
public class Array_Rev {
void ReverseStr(String[] nums){

    for(int i=0;i<nums.length;i++){
        System.out.println(nums[i]);
    }
    for(int i=0;i<nums.length/2;i++){
        String temp=nums[i];
        nums[i]=nums[nums.length-i-1];
        nums[nums.length-i-1]=temp;
    }
    System.out.print("Reverse an array:");
    for(int j=0;j<nums.length;j++){
        System.out.print(" "+nums[j]);
    }
    System.out.println();
}
void ReverseInt(int[] num){
    Arrays.sort(num);
    for(int i=0;i<num.length;i++){
        System.out.println(num[i]);
    }
    for(int i=0;i<num.length/2;i++){
        int temp=num[i];
        num[i]=num[num.length-i-1];
        num[num.length-i-1]=temp;
    }
    System.out.print("Reverse an array:");
    for(int j=0;j<num.length;j++){
        System.out.print(" "+num[j]);
    }
}
        public static void main(String[] args) {

           Array_Rev obj =new Array_Rev();
           String[] nums={"kam","kama","kamal"};
           obj.ReverseStr(nums);

           int[] num={4,2,5,1,3};
           obj.ReverseInt(num);
        }
    }

