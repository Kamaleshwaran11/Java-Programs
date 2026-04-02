package com.project.Unitconversion.Main;
import com.project.Unitconversion.Conv.Conv;

import java.util.Scanner;

public class Menu {

    public static void DisplayMenu(){
        Scanner sc=new Scanner(System.in);
        Conv conv=new Conv();
        System.out.println("<<<--Menu List-->>>");
        System.out.println("1.Length Converter");
        System.out.println("2.Weight Converter");
        System.out.println("3.Temperature Converter");
        System.out.println("4.Volume Converter");
        System.out.println("5.Speed Converter");
        System.out.println("6.Area Converter");
        System.out.println("7.Time Converter");
        System.out.println("8.Energy Converter");
        System.out.println("9.Pressure Converter");
        System.out.println("10.DigitalStorage Converter");
        System.out.println("11.exit");
        System.out.println("");
        System.out.print("Enter the option for this:");
        int choice=sc.nextInt();
            switch(choice){
            case 1:
                System.out.println("Length Converter..");
                conv.lengthconv();
                break;
            case 2:


                default:
                    System.out.println("Try again..");
                    break;

    }
}}
