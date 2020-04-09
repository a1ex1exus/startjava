public class MyFirstGame {
    public static void main(String[] args) {
        int secretNumber = 87;
        int yourNumber = 33;
        
        if(yourNumber > secretNumber) {
            int i = yourNumber;
            do { 
                i--;
            System.out.println("The number you entered is greater than what the computer made.");
            } while(i == secretNumber);
        } else if(yourNumber < secretNumber) {
            int i = yourNumber;
            do { 
                i++;
            System.out.println("The number you entered is less than what the computer made.");
            } while(i == secretNumber);
        }
            System.out.println("You guessed!");
    }
}