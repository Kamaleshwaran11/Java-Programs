package com.codewithsk;

import java.io.BufferedReader;
import java.io.FileReader;


public class Bufferedcsvread {
    public static void main(String args[])throws Exception{
        FileReader csv2=new FileReader("sk.csv");
        BufferedReader bf=new BufferedReader(csv2);
        String line= bf.readLine();
        while(line!=null) {
            //String data= com.codewithsk.Arrays.toString(line.split(","));
            //System.out.println(data);
            System.out.println(line);
            line = bf.readLine();
        }
        /* while((line=bf.readLine())!=null){
           String[] data= line.split(",");
           for(String value:data){
           System.out.print(value+"\t");
        }
        System.out.println(); */

    }}

