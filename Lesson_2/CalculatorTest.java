 import java.util.Scanner;

 public class CalculatorTest {
    public static void main(String[] args) { 
        System.out.println("Enter any integer: ");
        Scanner keyboard = new Scanner(System.in);
        int number1 = keyboard.nextInt();
        System.out.println("You entered the number: " + number1);
        System.out.println("Enter the sign of the action you want to perform:+,-,*,/,^,%");
        String mathSign = keyboard.next();
        System.out.println("You entered the sign: " + mathSign);
        System.out.println("Enter another integer: ");
        int number2 = keyboard.nextInt();

        switch (mathSign) {
            case "+":
            int result;
            result = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            case "-":
            result = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            case "*":
            result = number1 * number2;
            System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            case "/":
            result = number1 / number2;
            System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            case "^":
                result = number1;
                for(int i = 1; i < number2; i++) {
                result *= number1;
                }
            System.out.println(number1 + " to the " + number2 + "th degree is equal " + result);
                break;

            case "%":
            result = number1 % number2;
            System.out.println("The remainder of dividing " + number1 + " by " + number2 + " is " + result);
                break;

            default:
            System.out.println("Error, enter another arithmetic sign");
        }
    }
}