package com.company;

public class Functions {
    public static void main(String[] args){
        System.out.println(function0(10000,500));
        System.out.println(function1(10000,500));

    }
    public static int function0 (int num1, int num2){
        int result;
        result = num1 + num2;
        return result;
    }
    public static int function1 (int num1, int num2){
        int result;
        result = num1 - num2;
        return result;
    }
}
