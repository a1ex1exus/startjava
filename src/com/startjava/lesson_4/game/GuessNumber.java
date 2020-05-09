package lesson_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    GuessNumber(Player player1, Player player2) {
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
            String player1Name = player1.getName();
            int number = enterNumber(keyboard, player1Name);
            player1.addNumberToArray(i, number);
            if (player1.checkNumber(number, randomNumber, i)) {
               guessed = true;
                break;
            }

            number = enterNumber(keyboard, player2.getName());
            player2.addNumberToArray(i, number);
            if (player2.checkNumber(number, randomNumber, i)) {
                guessed = true;
                break;
            }
        }
        if (!guessed) {
            finishGame(randomNumber);
        }
    }
    private int enterNumber(Scanner keyboard, String name) {
        System.out.println(name + ", enter any integer from 1 to 100.");
        return keyboard.nextInt();
    }

    void finishGame(int randomNumber) {
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