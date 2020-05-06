package lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            Calculator calculator = new Calculator();
            System.out.print("Enter separated by a space ");
            System.out.print("any integer, math operation, \nif necessary another integer or zero: ");
            String[] mathOperation = new String[5];
            mathOperation[0] = keyboard.nextLine();
            String a = mathOperation[0];

            String[] parts = a.split(" ");
            String part1 = parts[0];
            String part2 = parts[1];
            String part3 = parts[2];

            calculator.setNumber1(Integer.parseInt(part1));
            calculator.setMathSign(part2);
            calculator.setNumber2(Integer.parseInt(part3));

            calculator.calculate();

            System.out.println("Do you want to continue? Press y or n");
            choice = keyboard.next();
            while (!choice.equalsIgnoreCase("n") && !choice.equalsIgnoreCase("y")) {
                System.out.println("You are mistaken. Press y or n");
                choice = keyboard.next();
            }
        }
        System.out.println("Goodbye! Until next time!");
    }
}
