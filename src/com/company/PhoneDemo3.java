package com.company;

public class PhoneDemo3 {
    String number;
    int price;
    String model;

    PhoneDemo3(String number, int price, String model){
        this.number = number;
        this.price = price;
        this.model = model;
    }

    PhoneDemo3(String number, String model){
        this.number = number;
        this.model = model;
    }
}
