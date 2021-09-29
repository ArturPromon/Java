package com.company;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};

        Scanner userInput = new Scanner(System.in);

        System.out.println("Choose the number of month from 1 to 12: ");
        int chosenMonth = userInput.nextInt();
        if(chosenMonth>12){
            System.out.print("Enter the number of month from 1 to 12 next time");
        }else if(chosenMonth<1){
            System.out.print("Enter the number of month from 1 to 12 next time");
        }else{
            System.out.print("The month is: " + months[chosenMonth - 1]);
        }
    }
}
