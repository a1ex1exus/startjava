

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator CalculatorOne = new Calculator();

        System.out.println("Enter any integer: ");
        System.out.println(CalculatorOne.getNumber1());

        System.out.println("Enter the sign of the action you want to perform:+,-,*,/,^,%");
        System.out.println(CalculatorOne.getMathSign());

        System.out.println("Enter another integer: ");
        System.out.println(CalculatorOne.getNumber2());

        calculatorOne.addition();
        calculatorOne.substruction();
        calculatorOne.multyplyng();
        calculatorOne.division();
        calculatorOne.exponentiation();
        calculatorOne.modulo();

        System.out.println("Do you want to continue? Press y or n");
        System.out.println(CalculatorOne.getChoice());

        calculatorOne.imputMistake();
        calculatorOne.exit();
        calculatorOne.toContinue();
    }
}
