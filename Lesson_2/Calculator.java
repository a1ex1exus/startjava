public class Calculator {
    int number1;
    int number2;
    String mathSigh;
    int result;

    public String calculate() {
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