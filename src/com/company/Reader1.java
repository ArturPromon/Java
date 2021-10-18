package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader1 {
    public static void main(String[] args){
        BufferedReader reader = null;
        String s;
        String s1;

        try{
            reader = new BufferedReader(new FileReader("src/com/company/file.txt"));
            s = reader.readLine();
            s1 = reader.readLine();

            System.out.println(s);
            System.out.print(s1);


        }catch (Exception e){
            System.out.print("Error:" + e);
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
