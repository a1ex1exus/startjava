package lesson_4.game;

import java.util.Random;
import java.util.Scanner;

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
        boolean guessed = false;

        System.out.println("Ok, let's play! You have 10 attempts.");

        for (int i = 0; i < player1.getNumbers().length; i++) {
            System.out.println(player1.getName() + ", enter any integer from 1 to 100.");
            int userNumber = keyboard.nextInt();
            player1.addNumber(i, userNumber);
            if (randomNumber < userNumber) {
                System.out.println(player1.getName() + ", you entered number " + userNumber + ". It is greater than the computer made up.");
                System.out.println("And now another player is trying to guess.");
            } else if (randomNumber > userNumber) {
                System.out.println(player1.getName() + ", you entered number " + userNumber + ". It is less than the computer made up.");
                System.out.println("Now another player is trying to guess.");
            } else  {
                System.out.println(player1.getName() + ", you guessed number " + userNumber + " from attempt number " + i + ". \nYou won!");
                guessed = true;
                break;
            }

            System.out.println(player2.getName() + ", enter any integer from 1 to 100.");
            userNumber = keyboard.nextInt();
            player2.addNumber(i, userNumber);
            if (randomNumber < userNumber) {
                System.out.println(player2.getName() + ", you entered number " + userNumber + ". It is greater than the computer made up.");
                System.out.println("And now another player is trying to guess.");
            } else if (randomNumber > userNumber) {
                System.out.println(player2.getName() + ", you entered number " + userNumber + ". It is less than the computer made up.");
                System.out.println("Now another player is trying to guess.");
            } else {
                System.out.println(player2.getName() + ", you guessed number " + userNumber + " from attempt number " + i + ". \nYou won!");
                guessed = true;
                break;
            }
        }
        if (!guessed) {
            gameOver(randomNumber);
        }
    }

    void gameOver(int randomNumber) {
        System.out.println(player1.getName() + " ran out of attempts. Game over.");
        System.out.println("Computer made up a number: " + randomNumber);
        System.out.println(player1.getName() + " entered the numbers: " + printNumbers(player1.getNumbers()));
        System.out.println(player2.getName() + " entered the numbers: " + printNumbers(player2.getNumbers()));
    }

    String printNumbers(int[] numbers) {
        String outputArray = "";
        for (int number : numbers) {
            outputArray += number + " ";
        }
        return outputArray;
    }
}