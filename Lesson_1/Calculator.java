public class Calculator {
    public static void main(String[] args) {
        int a = 33;
        int b = 7;
        char sign = '/';
        int result;
        float resultDivision;

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
            resultDivision = (float) a / b;
            System.out.printf(a + " / " + b + " = " + "%.2f",resultDivision);
        } else if(sign == '^') {
            int result1 = a;
                for(int i = 1; i <= b; i++) {
                result1 *= a;
                }
            System.out.println(a + " to the " + b + "th degree is equal " + result1);
        } else { 
            result = a % b;
            System.out.println("The remainder of dividing " + a + " by " + b + " is " + result);
        }
    }
}