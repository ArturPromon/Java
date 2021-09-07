package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

//        Scanner num = new Scanner(System.in);
//        int first, second, result;
//        System.out.println("First number is secret!");
//        System.out.println("First number is secret");
//        first = 10;
//        System.out.println("Please enter second number:");
//        second = num.nextInt();
//        result = first + second;
//        System.out.print("Summa is " + result);
//        Scanner num = new Scanner(System.in);
//        int first, second, result;
//        System.out.println("First number is secret!");
//        first = 10;
//        System.out.println("Please enter second number:");
//        second = num.nextInt();
//        result = first + second;
//        System.out.println("Summa is " + result);
//        System.out.print("Secret number was 10");

//            Scanner number = new Scanner(System.in);
//            float nr1, nr2, result;
//            System.out.print("Enter first number: ");
//            nr1 = number.nextFloat();
//            nr2 = 10.5f;
//            System.out.println("Second number is secret!");
//            result = nr1 + nr2;
//            System.out.print("Summa is " + result);

         Scanner number2 = new Scanner(System.in);
         System.out.println("This is a game!");
         System.out.println("Game rules: Summa must be lower than 100,but one of 2 numbers is secret!");
         int num1, num2, result;
         System.out.print("First number is secret, please enter second number: ");
         num2 = number2.nextInt();
         num1 = 78;
         result = num1 + num2;
         if(num2<10){
             System.out.println("second number must be bigger than 10");
         }else{
             if(result<100){
                 System.out.println("You won the game!, because result was lower than 100");
                 System.out.println("Secret number was" + num1);
             }else{
                 System.out.println("Game over!, because result was bigger than 100!");
                 System.out.println("Secret number was" + num1);
             }
         }

    }
}
