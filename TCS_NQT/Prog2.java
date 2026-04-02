//Give an purchase amount, apply a discount based on slabs and print the final payable ampunt rounded by 2 decia=mal places.
//Slabs:
//5%discount =[amount <1000]
//10%discount=[1000<=amount<5000]
//15%discount=[amount>=5000]

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the amt:");
        double amt=sc.nextInt();
        double discount=0.0;
        
        if(amt<1000){
            discount=amt*0.05;
        }
        else if(amt>=1000 && amt<5000){
            discount=amt*0.10;
        }
        else{
            discount=amt*0.15;
        }
        
        double final_amt=amt-discount;
        
        System.out.printf("discount amnt: %.2f" ,final_amt);
    }
}