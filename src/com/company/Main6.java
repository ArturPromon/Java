package com.company;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner to_sto_vvodit_polzovatel = new Scanner(System.in);
        int granica_pensii;
        System.out.print("Vvedite granicu pensii: ");
        granica_pensii = to_sto_vvodit_polzovatel.nextInt();
        for(int i = 0;i<granica_pensii;i++){
            System.out.println("Rabotaem poka nam " + i + " let");
        }

    }
}
