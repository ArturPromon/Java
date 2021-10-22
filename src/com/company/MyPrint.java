package com.company;

public class MyPrint implements Print,Read {
    String mark;
    String model;

    MyPrint(String mark, String model){
        this.mark = mark;
        this.model = model;
    }

    public void printCar(){
        System.out.println(mark+ " " + model);
    }

    public void printBike(){
        System.out.println(mark+ " " + model);
    }

    public void readCar(){
        System.out.println("Bmw x5");
    }

    public void readBike(){
        System.out.println("Yamaha Z2");
    }
}
