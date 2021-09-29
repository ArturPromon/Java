package com.company;

public class Mathematics {
    public static void main(String[] args) {

        int num1;
        //Math.floor - округление до наименьшего целого
        //Math.ceil - округление до наибольшего целого
        //Math.round - математическое округление
        //Math.max - Нахождение максимального значения
        //Math.min - Нахождение минимального значения
        //Math.random - рандом [0;1) - от 0 включительно до 1 исключительно, пример 0.3745...
        // [0;1) * 100 = [0;100) оттуда Math.random()*100

//        for(int i =0; i<5;i++) {
//            num1 = (int) Math.floor(Math.random()*3);
//            System.out.println(num1);
//        }

        double num2 = 99.999999999d;
        System.out.println((int)Math.floor(num2));
        // result = 99

        double num3 = 99.999999999d;
        System.out.println((int)Math.ceil(num3));
        // result = 100

        double num4 = 99.5000001d;
        System.out.println((int)Math.round(num4));
        // result = 100

        int num5;
        float num6;
        num5 = 50;
        num6 = 40.5f;

        System.out.println("maximum: " + Math.max(num5,num6));
        System.out.println("minimum: " + Math.min(num5,num6));

        int num7 = 9;
        System.out.print("Извлечение корня: "+Math.sqrt(num7));



    }
}
