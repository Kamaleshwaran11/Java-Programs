

//calculate sum of prime numbers from M to N
//input: M and N
//output: sum of prime numbers from M to N

import java.util.*;
class Main {
    public static boolean isprime(int num){
        if(num<2){
            return false;
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        
        int count=0;
        int sum=0;
        int num=2;
        
        while(count<M+N){
            if(isprime(num)){
                count++;
            
            
            if(count>= M && count<=M+N){
                sum=sum+num;
            }
            }
        num++;
        }
        System.out.println(sum);
    }
}