package com.company;

public class PhoneParametrs extends PhoneDemo{
    String system = "Windows";
    String system2;
    int core;
    int memory;

    PhoneParametrs(){

    }

    PhoneParametrs(int core, int memory, String system2){
        this.system2 = system2;
        this.core = core;
        this.memory = memory;
    }

    PhoneParametrs(int core, int memory, String system2, String number, int price, String model){
        super(number, price, model);
        this.system2 = system2;
        this.core = core;
        this.memory = memory;
    }

    public void tellModel(String name){
        System.out.print(name+ " " + super.model);
    }

    public void getPhone8() {
        System.out.print(system2);
        System.out.print(super.model);
        System.out.print(super.number);
        System.out.print(super.price);
    }
}
