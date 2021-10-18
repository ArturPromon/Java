package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Months2 {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};

        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter name of months January - December(example June): ");
        String chosenMonth = userInput.nextLine();


        List<String> monthsnum = Arrays.asList(months);

            if(monthsnum.contains(chosenMonth)){
                System.out.print(monthsnum.indexOf(chosenMonth) + 1);
            }else{
                System.out.print("false");
            }
        }
}
