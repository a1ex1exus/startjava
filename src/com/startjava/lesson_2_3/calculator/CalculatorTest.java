package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String choice = "y";
        while(choice.equalsIgnoreCase("y")) {
            Calculator calculator = new Calculator();
            System.out.println("Enter any integer: ");
            calculator.setNumber1(keyboard.nextInt());
            System.out.println("Enter the sign of the action you want to perform:+,-,*,/,^,%.");
            calculator.setMathSign(keyboard.next().charAt(0));
            System.out.println("Enter any another integer: ");
            calculator.setNumber2(keyboard.nextInt());
           
            calculator.calculate();

            System.out.println("Do you want to continue? Press y or n");
            choice = keyboard.next();
            while(!choice.equalsIgnoreCase("n") && !choice.equalsIgnoreCase("y")) {
                System.out.println("You are mistaken. Press y or n");
                choice = keyboard.next();
            }      
        }  
        System.out.println("Goodbye! Until next time!");
    }
}