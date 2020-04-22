import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private Player player1;
            Player player2;
  
    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        int randomNumber;
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        randomNumber = rand.nextInt(100) + 1;

        System.out.println("Ok, let's play!");

        while(true) {
            System.out.println("Enter any integer from 1 to 100.");
            int attempt = keyboard.nextInt();
            if(randomNumber != attempt) {
                if(randomNumber < attempt) {
                    System.out.println("You entered number " + attempt + ". It is greater as a computer number.");
                    System.out.println("And now another player is trying to guess.");
                    continue;
                } 
                if(randomNumber > attempt) {
                    System.out.println("You entered number " + attempt + ". It is less as a computer number.");
                    System.out.println("Now another player is trying to guess.");
                    continue;
                }
            } else {
                System.out.println("You guessed.\nYou won!");
                break;
            }

        }            
    }
        
}