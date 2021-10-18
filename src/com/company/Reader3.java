package com.company;

import java.io.BufferedReader;
import java.io.FileReader;


public class Reader3 {
    public static void main(String[] args){
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader("src/com/company/file.txt"));
            String line;
            int count = 0;
            char someChar = 'a';
            while((line = reader.readLine()) != null){
                System.out.println(line);
                for(int i = 0; i < line.length();i++){
                    if(line.charAt(i) == someChar){
                        count++;
                    }
                }
                System.out.println(count);
                count = 0;
            }
            reader.close();
        }catch (Exception e){
            System.out.print("Error: " + e);
        }
    }
}
