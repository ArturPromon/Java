package com.company;

import java.util.Scanner;

public class igra {
    public static void main(String[] args) {
        boolean isTrue = true;
        boolean play = true;
        Scanner to_sto_vvel_polzovatel = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        int num1, num2, result;


        while(play) {
            System.out.println("This is a game!");
            System.out.println("Game rules: Summa must be lower than 100,but one of 2 numbers is secret!");
            System.out.print("First number is secret, please enter second number: ");
            num2 = to_sto_vvel_polzovatel.nextInt();
            num1 = (int) Math.floor(Math.random() * 100);
            while (isTrue) {
                if (num2 < 10) {
                    System.out.println("second number must be bigger than 10");
                    System.out.print("Enter second number again: ");
                    num2 = to_sto_vvel_polzovatel.nextInt();

                } else {
                    result = num1 + num2;
                    if (result < 100) {
                        System.out.println("You won the game!, because result was " + result);
                        System.out.println("Secret number was " + num1);
                    } else {
                        System.out.println("Game over!, because result was bigger than 100!");
                        System.out.println("Secret number was " + num1);
                    }
                    isTrue = false;
                }
            }
            System.out.println("Would you like to play again? Yes/No");
            play = in.nextLine().equalsIgnoreCase("Yes");
        }
    }
}
