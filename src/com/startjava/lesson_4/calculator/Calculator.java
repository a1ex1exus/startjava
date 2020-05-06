package lesson_4.calculator;

public class Calculator {
    private int number1;
    private int number2;
    private String mathSign;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setMathSign(String mathSign) {
        this.mathSign = mathSign;
    }

    public void calculate() {
        switch (mathSign) {
            case "abs":
                System.out.println("Absolute value of the number " + number1 + " is " + Math.abs(number1));
                break;
            case "sqrt":
                System.out.println("Square root of " + number1 + " is " + Math.sqrt(number1));
                break;
            case "pow":
                System.out.println(number1 + " to the " + number2 + "th degree is equal " + Math.pow(number1, number2));
                break;
            case "cbrt":
                System.out.println("Cube root from " + number1 + " is " + Math.cbrt(number1));
                break;
            default:
                System.out.println("Error, enter another arithmetic operation");
        }
    }
}
