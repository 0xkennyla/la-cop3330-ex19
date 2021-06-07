/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kenny La
 */
package org.example;
import java.util.Scanner;

public class Exercise19 {
    public static void main (String []args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your weight:");
        double weight = scan.nextDouble();
        System.out.println("Enter your height:");
        double height = scan.nextDouble();

        double BMI = (weight / (height*height)) * 703;

        if(BMI<25 && BMI>18.5)
            System.out.println("You are within the ideal weight range.");
        else if (BMI>=25)
            System.out.println("You are overweight. You should see your doctor.");
        else
            System.out.println("You are underweight. You should see your doctor.");
    }
}
