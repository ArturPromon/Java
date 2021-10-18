package com.company;

import java.util.Arrays;

public class Main19_3 {
    public static void main(String[] args){
        //zadanie1
        int length = 1010;
        int [] prostqe = new int[length];
        //n index ili porjadkovqi nomer
        int n = 0;
        for (int i = 0; n < 1000;i++){
            if(proverka_prostogo(i)) {
                prostqe[n] = i;
                n++;
            }
        }

        //zadanie2 ili porjadkovqi nomer
        int kvadrat= prostqe[999] * prostqe[999];
        System.out.println(kvadrat);
        for(int i = kvadrat; n<prostqe.length;i++){
            if(proverka_prostogo(i)){
                prostqe[n] = i;
                n++;
            }
        }
        System.out.print(Arrays.toString(prostqe));

    }
    public static boolean proverka_prostogo(int n){
        if(n<2){
            return false;
        }

        for(int i = 2; i<n; i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }
}
