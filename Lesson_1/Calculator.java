public class Calculator {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        boolean isPlus = false;
        boolean isMinus = false;
        boolean isMultiply = false;
        boolean isDivision = false;
        boolean isExponention = true;
        boolean isRemainder = false;
        int sum;
        int diff;
        int multip;
        int divis;
        int mod;

            if(isPlus) {
                sum = a + b;
                    System.out.println(a + " + " + b + " = " + sum);
            }
                else if(isMinus) {
                    diff = a - b;
                        System.out.println(a + " - " + b + " = " + diff);
                }
                    else if(isMultiply) {
                        multip = a * b;
                            System.out.println(a + " * " + b + " = " + multip);
                    }
                        else if(isDivision) {
                            divis = a / b;
                                System.out.println(a + " / " + b + " = " + divis);
                        }
                            else if(isExponention) {
                                int result = a;
                                for(int i = 1; i <= b; i++) {
                                    result *= a;
                            }
                                        System.out.println(a + " to the " + b + "th degree is equal " + result);
                            } else {
                                     mod = a % b;
                                            System.out.println("The remainder of dividing " + a + " by " + b + " is " + mod);
                                }
    }
}