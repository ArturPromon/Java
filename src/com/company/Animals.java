package com.company;

public class Animals {
    public static void main(String[] args){
        Cats Liza = new Cats();
        Liza.age = 10;
        Dogs Ar4i = new Dogs();
        Dogs Katy = new Dogs();
        Ar4i.age = 6;
        System.out.println(Katy.age);
        System.out.println(Ar4i.age);
        System.out.println(Liza.age);


        Katy.say("Gav");

    }
}
