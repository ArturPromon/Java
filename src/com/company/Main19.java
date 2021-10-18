package com.company;

import java.util.Arrays;

public class Main19 {
    public static void main(String[] args){
        //zadanie1
        int length = 1000;
        int [] prostqe = new int[length];
        //n index ili porjadkovqi nomer
        int n = 0;
        for (int i = 0; n < prostqe.length;i++){
            if(proverka_prostogo(i)) {
                prostqe[n] = i;
                n++;
            }
        }
        System.out.println(Arrays.toString(prostqe));

        //zadanie2 ili porjadkovqi nomer
        int kvadrat= prostqe[999] * prostqe[999];
        System.out.println(kvadrat);
        int [] kvadrat_10 = new int[10];
        //m index
        int m = 0;
        for(int i = kvadrat; m<kvadrat_10.length;i++){
            if(proverka_prostogo(i)){
                kvadrat_10[m] = i;
                m++;
            }
        }
        System.out.print(Arrays.toString(kvadrat_10));

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
