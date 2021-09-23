package com.company;

import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        int num1, num2, answer;
        char operator;
        boolean isTrue = true;

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = reader.nextInt();
        System.out.print("Enter second number: ");
        num2 = reader.nextInt();
        System.out.print("Enter an operator (+, -, *, /): ");
        operator = reader.next().charAt(0);
        switch (operator){
            case '+': answer = num1 + num2;
                System.out.print(answer);
                break;
            case '-': answer = num1 - num2;
                System.out.print(answer);
                break;
            case '*': answer = num1 * num2;
                System.out.print(answer);
                break;
            case '/': answer = num1 / num2;
                System.out.print(answer);
                break;
            default: while(isTrue){
                System.out.println("Error! Incorrect operator! Please enter an operator again!");
                System.out.print("Enter an operator (+, -, *, /): ");
                operator = reader.next().charAt(0);
                switch (operator) {
                    case '+':
                        answer = num1 + num2;
                        System.out.print(answer);
                        break;
                    case '-':
                        answer = num1 - num2;
                        System.out.print(answer);
                        isTrue = false;
                        break;
                    case '*':
                        answer = num1 * num2;
                        System.out.print(answer);
                        isTrue = false;
                        break;
                    case '/':
                        answer = num1 / num2;
                        System.out.print(answer);
                        isTrue = false;
                        break;
                }
            }
        }
    }
}
