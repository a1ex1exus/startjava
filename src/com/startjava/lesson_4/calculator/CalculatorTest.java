package lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String choice = "y";
        while(choice.equalsIgnoreCase("y")) {
            System.out.print("Enter math expression of type 'a + b': ");
            String string = keyboard.nextLine();

            String[] mathExpression = string.split(" ");
            String number1 = mathExpression[0];
            String mathSign = mathExpression[1];
            String number2 = mathExpression[2];

            Calculator calculator = new Calculator(
                    Integer.parseInt(number1),
                    mathSign,
                    Integer.parseInt(number2)
            );

            calculator.calculate();

            System.out.println("Do you want to continue? Press y or n");
            choice = keyboard.nextLine();
            while(!choice.equalsIgnoreCase("n") && !choice.equalsIgnoreCase("y")) {
                System.out.println("You are mistaken. Press y or n");
                choice = keyboard.nextLine();
            }
        }
        System.out.println("Goodbye! Until next time!");
    }
}
