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
        int[] numbers1 = new int[0];
        int[] numbers2 = new int[0];
        boolean guessed = false;

        for (int i = 0; i < player1.getNumbers().length; i++) {
            enterNumber(player1, i);
            if (checkNumber(player1, i)) {
                guessed = true;
                numbers1 = Arrays.copyOf(player1.getNumbers(), i + 1);
                numbers2 = Arrays.copyOf(player2.getNumbers(), i);

                Arrays.fill(player1.getNumbers(), 0, i + 1, 0);
                Arrays.fill(player2.getNumbers(), 0, i, 0);
                break;
            }

            enterNumber(player2, i);
            if (checkNumber(player2, i)) {
                guessed = true;
                numbers1 = Arrays.copyOf(player1.getNumbers(), i + 1);
                numbers2 = Arrays.copyOf(player2.getNumbers(), i + 1);

                Arrays.fill(player1.getNumbers(), 0, i + 1, 0);
                Arrays.fill(player2.getNumbers(), 0, i + 1, 0);
                break;
            }
        }
        if (!guessed) {
            System.out.println(player1.getName() + " ran out of attempts. Game over.");
        }

        printNumbers(numbers1, numbers2);

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
        if (randomNumber == number) {
            System.out.println(name + ", you guessed number " + number
                    + " from attempt number " + (i + 1) + ". \nYou won!");
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

    private void printNumbers(int[] numbers1, int[] numbers2) {
        System.out.println("Computer made up a number: " + randomNumber);
        System.out.println(player1.getName() + " entered the numbers: "
                + Arrays.toString(numbers1));
        System.out.println(player2.getName() + " entered the numbers: "
                + Arrays.toString(numbers2));
    }
}