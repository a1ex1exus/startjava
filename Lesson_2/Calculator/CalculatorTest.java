import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        while(true) {
            Calculator calculator = new Calculator();
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter any integer: ");
            calculator.setNumber1(keyboard.nextInt());
            System.out.println("Enter the sign of the action you want to perform:+,-,*,/,^,%.");
            calculator.setMathSign(keyboard.next().charAt(0));
            System.out.println("Enter any another integer: ");
            calculator.setNumber2(keyboard.nextInt());
           
            calculator.calculate();

            System.out.println("Do you want to continue? Press y or n");
            String choice = keyboard.next();
            while(!choice.equalsIgnoreCase("n") && !choice.equalsIgnoreCase("y")) {
                System.out.println("You are mistaken. Press y or n");
                choice = keyboard.next();
            }      
            if(choice.equalsIgnoreCase("n")) {
                System.out.println("Goodbye! Until next time!");
                break;
            }
            if(choice.equalsIgnoreCase("y")) {
                continue;
            }
        }
    }
}