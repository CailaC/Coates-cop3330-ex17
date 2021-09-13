package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Caila Coates
 */

import java.util.Scanner;
import java.lang.Math;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println( "Enter a 1 if you are male or a 2 if you are female:" );
            int gender = input.nextInt();
        System.out.println( "How many ounces of alcohol did you have?");
            int a = input.nextInt();
        System.out.println("What is your weight, in pounds? ");
            int w = input.nextInt();
        System.out.println("How many hours has it been since your last drink?");
            int h = input.nextInt();
        //BAC Calculation

        double bac = 0.0;

        if(gender == 1)
            bac = (a * 5.14 / w * 0.73) - (.015 * h);

        if(gender == 2)
            bac = (a * 5.14 / w * 0.66) - (.015 * h);

        if(bac >= 0.08)
            System.out.printf("Your BAC is %.6f \nIt is not legal for you to drive. ", bac);
        else if(bac < 0.08)
            System.out.printf("Your BAC is %.6f \nIt is legal for you to drive. ", bac);
    }
}
