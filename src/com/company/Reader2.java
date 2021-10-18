package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Locale;

public class Reader2 {
    public static void main(String[] args){
        BufferedReader reader = null;

        try{
            reader = new BufferedReader(new FileReader("src/com/company/file.txt"));

            String line;
            int count = 0;
            char someChar = 'a';

            while((line = reader.readLine()) != null){
                System.out.println(line);
//                System.out.println(line.length());
//
//                String[] array = line.split("");
//                System.out.println(Arrays.toString(array));
            }

        }catch (Exception e){
            System.out.print("Error: " + e);
        }finally {
            try{
                reader.close();
            }catch (Exception e){
                System.out.print(e);
            }
        }
    }
}
