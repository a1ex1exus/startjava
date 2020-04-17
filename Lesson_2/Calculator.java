import java.util.Scanner;

public class Calculator {
    Scanner keyboard = new Scanner(System.in);

    private int number1 = keyboard.nextInt();
    private int number2 = keyboard.nextInt();
    private String mathSign = keyboard.next();
    private int result;

// Sledujuschie 3 stroki otnosjatsa k 26,27 strokam CalculatorTest.java
    private String choice = keyboard.next();
    public String getChoice() {
    return choice;
    }

    public int getNumber1() {
    return number1;
    }
    public int getNumber2() {
    return number2;
    }
    public String getMathSign() {
    return mathSign;
    }
//BLock s metodami:
       while(true) {
            switch (mathSign) {

//public void addition() {}
                case "+":
                int result;
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                    break; 

//public void substruction() {}
                case "-":
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                    break;

//public void multyplyng() {}
                case "*":
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                    break;

//public void division() {}
                case "/":
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                    break;

//public void exponentiation() {}
                case "^":
                result = number1;
                    for(int i = 1; i < number2; i++) {
                    result *= number1;
                    }
                System.out.println(number1 + " to the " + number2 + "th degree is equal " + result);
                    break;

//public void modulo() {}
                case "%":
                result = number1 % number2;
                System.out.println("The remainder of dividing " + number1 + " by " + number2 + " is " + result);
                    break;

//public void errorAnotherMathSign() {}
                default:
            System.out.println("Error, enter another arithmetic sign");

//Running the script to continue or finish

//public void inputMistake() {}
                while(!choice.equalsIgnoreCase("n") && !choice.equalsIgnoreCase("y")) {
                System.out.println("You are mistaken. Press y or n");
                choice = keyboard.next();
                }
//public void exit() {}
                if(choice.equalsIgnoreCase("n")) {
                    System.out.println("Goodbye! Until next time!");
                    break;
//public void toContinue() {}
                } 
                if(choice.equalsIgnoreCase("y")) {
                    continue;
                }
        }
    }
}
