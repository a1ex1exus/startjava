import java.util.Scanner;

public class Calculator2in1 {
    public static void main(String[] args) {
        while(true) {
            System.out.println(" Enter any integer: ");
            Scanner keyboard = new Scanner(System.in);
            int number1 = keyboard.nextInt();
            System.out.println("Enter the sign of the action you want to perform:+,-,*,/,^,%");
            String mathSign =keyboard.next();
            System.out.println("Enter another integer: ");
            int number2 = keyboard.nextInt();
            int result;

            switch(mathSign) {
                case "+":
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
                float resultDevision;
                resultDevision = (float)number1 / number2;
                    if(number2 == 0) {
                        System.out.println("Division by zero is impossible. Enter a number other than zero");
                    } else {
                    System.out.printf(number1 + " / " + number2 + " = " + "%.2f\n", resultDevision);
                    }
                break;

                case "^":
                result = 1;
                    for(int i = 0; i < number2; i++) {
                    result *= number1; }
                System.out.println(number1 + " to the " + number2 + "th degree is equal " + result);
                break;

                case "%":
                result = number1 % number2;
                System.out.println("The remainder of dividing " + number1 + " by " + number2 + " is " + result);
                break;

                default:
                System.out.println("Error, enter another arithmetic sign");
            }

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
// // (!choice.equalsIgnoreCase("n")) || (!choice.equalsIgnoreCase("y"))
// while(!choice.equalsIgnoreCase("n") && !choice.equalsIgnoreCase("y")) {

// // f (some_string.equals("john") ||
// //     some_string.equals("mary") ||
// //     some_string.equals("peter"))

// // if(choice.equalsIgnoreCase("y")) {
// //                 continue;
