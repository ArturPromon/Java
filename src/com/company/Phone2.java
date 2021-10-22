package com.company;

public class Phone2 {
    public static void main(String[] args){
        Phone2_Parameters param = new Phone2_Parameters();
        param.intelcore.working();
        param.kingston.working();
        System.out.println("Sto-to delaem v telefone");
        param.intelcore.notworking();
        param.kingston.notworking();
    }
}
