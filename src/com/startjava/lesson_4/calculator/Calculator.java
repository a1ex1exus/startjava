package lesson_4.calculator;

public class Calculator {
    private int number1;
    private int number2;
    private String mathSign;

    public Calculator(int number1, String mathSign, int number2) {
        this.number1 = number1;
        this.mathSign = mathSign;
        this.number2 = number2;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber1() {
        return number1;
    }

    public void setMathSign(String mathSign) {
        this.mathSign = mathSign;
    }

    public String getMathSign() {
        return mathSign;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber2() {
        return number2;
    }

    public void calculate() {
        switch(mathSign) {
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
                float resultDiv = (float) number1 / number2;
                System.out.printf(number1 + " / " + number2 + " = " + "%.2f\n", resultDiv);
                break;
            case "^":
                result = (int) Math.pow(number1, number2);
                System.out.println(number1 + " to the " + number2 + "th degree is equal " + result);
                break;
            case "%":
                result = (int) Math.IEEEremainder(number1, number2);
                System.out.println("The remainder of dividing " + number1 + " by " + number2 + " is " + result);
                break;
            default:
                System.out.println("Error, enter another arithmetic sign");
        }
    }
}

