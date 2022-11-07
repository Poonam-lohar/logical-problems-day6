package com.bridgelabz;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in); //create object for scanner class
            System.out.println("For Degree Celsius to Fahrenheit Enter 1 ");
            System.out.println("For Fahrenheit to Degree Celsius Enter 2 ");
            System.out.print("Enter conversion you want : ");
            int conv = sc.nextInt();
            if (conv == 1) {
                System.out.print("Enter temperature in celsius: ");//100=212.0
                double Celsius = sc.nextDouble();
                double Fahrenheit = (Celsius * 9/5)  + 32;
                System.out.print("Temperature is :  " + Fahrenheit + " Fahrenheit");
            } else {
                System.out.print("Enter temperature in Fahrenheit :  ");//100=38
                double Fahrenheit = sc.nextDouble();
                double Celsius = (Fahrenheit-32) * 5/9;
                System.out.print("Temperature is :  " + Celsius + " Celsius");
            }
        }
    }