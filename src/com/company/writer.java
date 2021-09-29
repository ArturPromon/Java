package com.company;

import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;

public class writer {
    public static void main(String[] args) {
        try{
            File file = new File("src/com/company/file.txt");

                //Proverka na sozdanie faila odin raz
            if(!file.exists()){
                file.createNewFile();
            }

            String[] months = {"January", "February", "March", "April", "May", "June", "July",
                    "August", "September", "October", "November", "December"};

            int [] matrix2 ={7,8};

            PrintWriter sometext = new PrintWriter(file);

            int num = 100/10;
            sometext.println(Arrays.toString(matrix2));
            sometext.close();

        }catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
