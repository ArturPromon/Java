package com.company;
import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] numbers = {62710589, 62710573, 62710591, 62710651, 62710657, 62710693, 62710619, 62710631, 62710633, 62710639};

//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//        System.out.print("Min: " + numbers[0] + " " + "Max: " + numbers[numbers.length -1]);


//         int min, max;
//        min = max = numbers[0];
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] < min)
//                min = numbers[i];
//            if(numbers[i] > max){
//                max = numbers[i];
//            }
//        }
//        System.out.println("min is: " + min + "; max is: " + max);

//        int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum = sum + numbers[i];
//        }
//        System.out.println(sum);
//        System.out.println("Среднее арифметическое " + sum / numbers.length);

        System.out.println("max: " + GetMax(numbers));
        System.out.println(GetMin(numbers));
    }
    public static int GetMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
               max = array[i];
            }
        }
        return max;
    }

    public static int GetMin(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
