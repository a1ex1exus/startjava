import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    public Player player1;
    public Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;

        System.out.println("Ok, let's play!");
        int attemptNumber = 0;
        while(attemptNumber < 20) {
            attemptNumber++;
            System.out.println(player1.getName() + ", enter any integer from 1 to 100.");
            player1.setAttempt(keyboard.nextInt());
            if(randomNumber < player1.getAttempt()) {
                System.out.println(player1.getName() + ", you entered number " + player1.getAttempt() + ". It is greater than the computer made up.");
                System.out.println("And now another player is trying to guess.");
            } else if(randomNumber > player1.getAttempt()) {
                System.out.println(player1.getName() + ", you entered number " + player1.getAttempt() + ". It is less than the computer made up.");
                System.out.println("Now another player is trying to guess.");
            } else if (randomNumber == player1.getAttempt()) {
                System.out.println(player1.getName() + ", you guessed from attempt number " + attemptNumber + ". \nYou won!");
                break;
            }
            System.out.println(player2.getName() + ", enter any integer from 1 to 100.");
            player2.setAttempt(keyboard.nextInt());
            if(randomNumber < player2.getAttempt()) {
                System.out.println(player2.getName() + ", you entered number " + player2.getAttempt() + ". It is greater than the computer made up.");
                System.out.println("And now another player is trying to guess.");
            } else if(randomNumber > player2.getAttempt()) {
                System.out.println(player2.getName() + ", you entered number " + player2.getAttempt() + ". It is less than the computer made up.");
                System.out.println("Now another player is trying to guess.");
            } else if(randomNumber == player2.getAttempt()) {
                System.out.println(player2.getName() + ", you guessed from attempt number " + attemptNumber + ". \nYou won!");
                break;
            }
        }
    }
}