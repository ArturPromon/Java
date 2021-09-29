package com.company;

public class count {
    public static void main(String[] args) {
        String someString = "elephant elephant elephant elephant elephant";
        char someChar = 'e';
        int count = 0;

//        System.out.print(someString.length());

        for(int i = 0; i < someString.length();i++){
            if(someString.charAt(i) == someChar){
                count++;
                System.out.println(count);
            }else{
                System.out.println("Hello");
            }
        }


















        if(someString.charAt(0) == someChar){
            count++;
        }
        if(someString.charAt(1) == someChar){
            count++;
        }
        if(someString.charAt(2) == someChar){
            count++;
        }            if(someString.charAt(3) == someChar){
            count++;
        }            if(someString.charAt(4) == someChar){
            count++;
        }            if(someString.charAt(5) == someChar){
            count++;
        }

    }

}
