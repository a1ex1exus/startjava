import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Player player1 = new Player();
        System.out.println("Player 1, please enter your name.");
        String name = keyboard.nextLine();
        player1.setName(name);

        Player player2 = new Player();
        System.out.println("Player 2, please enter your name.");
        name = keyboard.nextLine();
        player2.setName(name);

        GuessNumber guessnumber = new GuessNumber();
        Random rand = new Random();
        for(int i = 0; i < 1; i++) {
        int randomNumber = rand.nextInt(100) + 1;
        guessNumber.setRandomNumber(randomNumber);

        System.out.println("Enter any integer from 1 to 100.");
        int attempt = keyboard.nextInt();
        player1.setEnteredNumber(attempt);
        guessNumber.setAttempt(attempt);

        player1.play();

        while(true) {
            System.out.println("Do you want to continue? Press y or n");
            String choice = keyboard.next();
            while(!choice.equalsIgnoreCase("n") && !choice.equalsIgnoreCase("y")) {
                System.out.println("You are mistaken. Press y or n");
                choice = keyboard.next();
                } if(choice.equalsIgnoreCase("n")) {
                System.out.println("Goodbye! Until next time!");
                break;
                } if(choice.equalsIgnoreCase("y")) {
                continue;
                }
            }
        }


    }


}