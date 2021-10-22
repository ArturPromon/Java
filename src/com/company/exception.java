package com.company;

public class exception {
    public static void main(String[] args) {
        int num;
        int array[] = {1,2,3,5,6};

        try{

            System.out.println(array[5]);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        try{
            num = 100/0;
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }finally {
            System.out.print("Hello world!");
        }


    }
}
