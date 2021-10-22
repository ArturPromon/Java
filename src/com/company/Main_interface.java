package com.company;

public class Main_interface {
    public static void main(String[] args){
        MyPrint car = new MyPrint("Audi" , "A6");
        car.printCar();
        MyPrint bike = new MyPrint("Yamaha", "Z1");
        bike.printBike();
        car.readCar();
        bike.readBike();
    }
}
