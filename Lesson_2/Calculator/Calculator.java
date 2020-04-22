public class Calculator {
    private int number1;
    private int number2;
    private char mathSign;
    private int result;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }
  
    public void  setMathSign(char mathSign) {
        this.mathSign = mathSign;
    }

    public void calculate() {
        switch(mathSign) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break; 
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case '/':
                float resultDevision = (float)number1 / number2;
                System.out.printf(number1 + " / " + number2 + " = " + "%.2f\n", resultDevision);
                break;
            case '^':   
                result = number1;
                for(int i = 1; i < number2; i++) {
                    result *= number1;
                }
                System.out.println(number1 + " to the " + number2 + "th degree is equal " + result);
                break;
            case '%':
                result = number1 % number2;
                System.out.println("The remainder of dividing " + number1 + " by " + number2 + " is " + result);
                break;
            default:
                System.out.println("Error, enter another arithmetic sign");
        }
    }
}
