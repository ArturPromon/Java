package com.company;

import java.util.Scanner;

public class months3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter name of months January - December(example June): ");
        String chosenMonth = userInput.nextLine();
        switch (chosenMonth){
            case "January":
                System.out.print("1");
                break;
            case "February":
                System.out.print("2");
                break;
            default:
                System.out.print("Error");
        }
    }
}
