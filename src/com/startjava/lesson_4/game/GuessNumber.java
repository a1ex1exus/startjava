package lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    Scanner keyboard = new Scanner(System.in);
    private final Player player1;
    private final Player player2;
    private final int randomNumber;

    public GuessNumber(Player player1, Player player2, int randomNumber) {
        this.player1 = player1;
        this.player2 = player2;
        this.randomNumber = randomNumber;
    }

    public void play() {
        System.out.println("Ok, let's play! You have 10 attempts.");
        boolean guessed = false;

        for (int i = 0; i < player1.getNumbers().length; i++) {
            player1.setAttempt(player1.getAttempt() + 1);
            enterNumber(player1, i);
            if (checkNumber(player1, i)) {
                guessed = true;
                break;
            }
            player2.setAttempt(player2.getAttempt() + 1);
            enterNumber(player2, i);
            if (checkNumber(player2, i)) {
                guessed = true;
                break;
            }
        }
        if (!guessed) {
            System.out.println(player1.getName() + " ran out of attempts. Game over.");
        }

        System.out.println("Computer made up a number: " + randomNumber);
        printNumbers(player1);
        printNumbers(player2);

    }

    private void enterNumber(Player pl, int i) {
        System.out.println(pl.getName() + ", enter any integer from 1 to 100.");
        int number = keyboard.nextInt();
        while ((number > 100) || (number < 1)) {
            System.out.println("The number you entered is less than 1 or greater " +
                    "than 100. Repeat the enter.");
            number = keyboard.nextInt();
        }
        pl.getNumbers()[i] = number;
    }

    private boolean checkNumber(Player pl, int i) {
        String name = pl.getName();
        int number = pl.getNumbers()[i];
        int attempt = pl.getAttempt();
        if (randomNumber == number) {
            System.out.println(name + ", you guessed number " + number
                    + " from attempt number " + attempt + ". \nYou won!");
            return true;
        } else if (randomNumber < number) {
            System.out.println(name + ", you entered number " + number
                    + ". It is greater than the computer made up.");
            System.out.println("And now another player is trying to guess.");
        } else {
            System.out.println(name + ", you entered number " + number
                    + ". It is less than the computer made up.");
            System.out.println("Now another player is trying to guess.");
        }
        return false;
    }

    private void printNumbers(Player pl) {
        int[] numbers = Arrays.copyOf(pl.getNumbers(), pl.getAttempt());
        System.out.println(pl.getName() + " entered the numbers: "
                + Arrays.toString(numbers));
        Arrays.fill(pl.getNumbers(), 0, pl.getAttempt(), 0);
        pl.setAttempt(0);
    }
}