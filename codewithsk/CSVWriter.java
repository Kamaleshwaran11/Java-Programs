package com.codewithsk;

import java.io.FileWriter;

public class CSVWriter {
    public static void main(String args[])throws Exception{
//        String csvFileName=System.getProperty("user.dir")+"kamalesh1.csv";
        FileWriter fw=new FileWriter("kamal.csv");
        fw.append("s.no,name,dept \n"); //header
        fw.append("1,kam,cse");
        fw.close();
        System.out.println("CSV File created");
    }
}
