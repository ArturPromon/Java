package com.company;

public class PhoneDemo {
    String number;
    int price;
    String model = "Xiaomi";

    PhoneDemo(){
    }

    PhoneDemo(String n, int p, String m){
        number = n;
        price = p;
        model = m;
    }
    public void calling(String name){
        System.out.println("Calling " + name);
    }

    public String getNumber(){
        return number;
    }

    public void getPhone8(){

    }
}


