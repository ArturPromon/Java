package com.company;

import java.util.Arrays;
import java.util.stream.IntStream;


public class Main20 {
    public static void main(String[] args){
        int[] array = new int[] {50,60,50,70,10,5,100};
        int sum = 0;
        boolean isTrue = true;
//        int i= 0;

        // -1 variant
//        while (isTrue){
//            sum += array[i];
//            i++;
//                if(i > array.length){
////                  isTrue = false;
//                    break;
//                }
//        }
                System.out.println(sum);
        //0 variant

//        while(i< array.length){
//            sum = sum + array[i];
//            i++;
//        }
        //        System.out.println(sum);

        //1 variant
        for(int i = 0; i < 7;i++){
            sum = sum + array[i];
        }

        //2 variant
        for(int element : array){
            sum = sum + element;
        }
//        System.out.println(sum);

        //3variant
        for(int i = 0; i < array.length;i++){
            sum += array[i];
        }

        //4 variant

        System.out.print(Arrays.stream(array).sum());

        //5 variant
        IntStream dannqe = IntStream.of(array);
        sum = dannqe.sum();
        System.out.print(sum);

    }
}
