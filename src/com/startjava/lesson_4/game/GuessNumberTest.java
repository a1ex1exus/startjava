package lesson_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Player 1, please enter your name:");
        String name = keyboard.nextLine();
        Player player1 = new Player(name);

        System.out.println("Player 2, please enter your name:");
        name = keyboard.nextLine();
        Player player2 = new Player(name);

        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;

        GuessNumber guessNumber = new GuessNumber(player1, player2, randomNumber);

        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            guessNumber.play();

            System.out.println("Do you want to continue? Press y or n");
            choice = keyboard.next();
            while (!choice.equalsIgnoreCase("n") && !choice.equalsIgnoreCase("y")) {
                System.out.println("You are mistaken. Press y or n");
                choice = keyboard.next();
            }
        }
        System.out.println("Goodbye! Until next time!");
    }
}