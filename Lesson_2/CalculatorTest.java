import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Enter any integer: ");
        calculator.number1 = keyboard.nextLine().charAt(0);
        System.out.println("Enter the sign of the action you want to perform:+,-,*,/,^,%");
        calculator.mathSign = keyboard.next();
        System.out.println("Enter another integer: ");
        calculator.number2 = keyboard.nextInt();
        char choice = keyboard.nextLine().charAt(0);
        do {
            calculator.calculate();
        } while (
            (System.out.println("Do you want to continue? Press y or n");
            if(!choice.equalsIgnoreCase('n') && !choice.equalsIgnoreCase('y')) {
                System.out.println("You are mistaken. Press y or n");
                }
            if(choice.equalsIgnoreCase ('n')) {
                System.out.println("Goodbye! Until next time!");
                break;
            }
            )
    }
}
