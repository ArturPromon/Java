package com.company;

import java.util.Arrays;

public class Main19_2 {
    public static void main(String[] args){
        int length = 4;
        int [] prostqe = new int[length];
        int n = 0;
        for (int i = 2; n < prostqe.length;i++){
            boolean isTrue = true;
            for(int j = 2; j<i; j++){
                if(i%j ==0){
                    isTrue = false;
                }
//                System.out.println("i: " + i);
//                System.out.println("j: " + j);

            }
            if(isTrue){
                prostqe[n] = i;
                n++;
            }
        }
        System.out.print(Arrays.toString(prostqe));
    }
}
