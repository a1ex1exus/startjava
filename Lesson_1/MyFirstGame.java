public class MyFirstGame {
    public static void main(String[] args) {
        int secretNumber = 87;
        int yourNumber = 87;
        if(yourNumber > secretNumber) {
            System.out.println("The number you entered is greater than what the computer made");
        } else if(yourNumber < secretNumber) {
            System.out.println("The number you entered is less than what the computer made");
        } else if(yourNumber == secretNumber) {
            System.out.println("You guessed!");
        }
    }
}
