package com.codewithsk;

import java.io.BufferedReader;
import java.io.FileReader;

public class PdfBufferReader {
    public static void main(String args[])throws Exception{
        FileReader fr=new FileReader("kamal.pdf");
        BufferedReader bf=new BufferedReader(fr);
        String line= bf.readLine();

        while(line!=null){
            System.out.println(line);
            line= bf.readLine();
        }
    }

}
