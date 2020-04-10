public class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        char sign = '^';
        int result;

        if(sign == '+') {
            result = a + b;
            System.out.println(a + " + " + b + " = " + result);
        } else if(sign == '-') {
            result = a - b;
            System.out.println(a + " - " + b + " = " + result);
        } else if(sign == '*') {
            result = a * b;
            System.out.println(a + " * " + b + " = " + result);
        } else if(sign == '/') {
            float resultDivision;
            resultDivision = (float) a / b;
            System.out.printf(a + " / " + b + " = " + "%.2f", resultDivision);
        } else if(sign == '^') {
            result = a;
            for(int i = 1; i <= b; i++) {
                result *= a;
            }
            System.out.println(a + " to the " + b + "th degree is equal " + result);
        } else { 
            result = a % b;
            System.out.println("The remainder of dividing " + a + " by " + b + " is " + result);
        }
    }
}