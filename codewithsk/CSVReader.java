package com.codewithsk;

import java.io.File;
import java.util.Scanner;

public class CSVReader {
    public static void main(String args[])throws Exception
    {
File csv1 =new File("sk.csv");
Scanner sc=new Scanner(csv1);
sc.useDelimiter(",");

while(sc.hasNext()){
    System.out.print(sc.next()+"\t");
}
sc.close();
    }
}
