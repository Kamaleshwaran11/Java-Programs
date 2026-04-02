//import the java package--->
package com.project.calci;
import java.util.*;
public class calci {
    //main function() --->
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to kamc calci !!");
        System.out.print("How many Numbers for using this calci : ");
        int num=sc.nextInt();
        double[] numbers=new double[num];

        for(int i=0;i<num;i++){
            System.out.print("For the " +(i+1) + " num :");
            numbers[i]=sc.nextDouble();
            }
while(true){
            System.out.println("Here the Your Choice:");
            System.out.println("1.ADD");
            System.out.println("2.SUB");
            System.out.println("3.MULTI");
            System.out.println("4.DIVI");
            System.out.println("5.EXIT");
            int choice=sc.nextInt();

            double result =numbers[0];

            switch(choice){
                case 1:
                    for(int a=1;a<num;a++) {
                        result += numbers[a];
                    }
                        System.out.println("Here the result of addition:" +result);
                    break;
                case 2:
                    for(int b=1;b<num;b++){
                        result -= numbers[b];
                    }
                    System.out.println("Here the result of Substarction:"+result);
                    break;
                case 3:
                   // System.out.println(num*num);
                    for(int c=1;c<num;c++){
                        result *= numbers[c];
                    }
                    System.out.println("here the result of Multiplication:"+result);
                    break;
                case 4:
                    for(int d=1;d<num;d++){
                        result /= numbers[d];
                    }
                    System.out.println("Here the result of divsion:"+result);
                    break;
                case 5:
                    System.out.println("ThanK-You for Using this Calci- kamc");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Option:TRY AGAIN !!!");

            }
        }

    }}


