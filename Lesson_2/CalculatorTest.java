import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Enter any integer: ");
        calculator1.number1 = keyboard.nextInt();
        System.out.println("Enter the sign of the action you want to perform:+,-,*,/,^,%");
        calculator1.mathSign = keyboard.nextLine();
        System.out.println("Enter another integer: ");
        calculator1.number2 = keyboard.nextInt();
        do {
            calculator1.calculate();
            System.out.println("Do you want to continue? Press y or n");
            String choice = keyboard.next();
            if(!choice.equalsIgnoreCase("n") && !choice.equalsIgnoreCase("y")) {
                System.out.println("You are mistaken. Press y or n");
                choice = keyboard.next();
                }
            if(choice.equalsIgnoreCase ("n")) {
                System.out.println("Goodbye! Until next time!");
                break;
            } else {}
        } while (true); 
    }
}
