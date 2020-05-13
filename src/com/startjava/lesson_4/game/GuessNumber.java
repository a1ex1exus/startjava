package lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

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

        for(int i = 0; i < player1.getNumbers().length; i++) {
            Scanner keyboard = new Scanner(System.in);
            enterNumber(player1.Player(name, int[] numbers),keyboard, i);

            if(checkNumber(player1.Player(name, numbers), i)) {
                break;
            }

            enterNumber(player2.Player(name, numbers), keyboard, i);

            if(checkNumber(player2.Player(name, numbers), i)) {
                break;
            }
        }

        printNumbers();

    }

    private void enterNumber(String name, Scanner keyboard, int i, int[] numbers) {
        System.out.println(name + ", enter any integer from 1 to 100.");
        int number = keyboard.nextInt();
        while((number > 100) || (number < 1)) {
            System.out.println("The number you entered is less than 1 or greater than 100. Repeat the enter.");
            number = keyboard.nextInt();
        }
        numbers[i] = number;
    }

    private void checkNumber(String name, int[] numbers, int i) {
        if(randomNumber == numbers[i]) {
            System.out.println(name + ", you guessed number " + numbers[i] + " from attempt number " + (i + 1) + ". \nYou won!");
        } else if (randomNumber < numbers[i]) {
            System.out.println(name + ", you entered number " + numbers[i] + ". It is greater than the computer made up.");
            System.out.println("And now another player is trying to guess.");
        } else {
            System.out.println(name + ", you entered number " + numbers[i] + ". It is less than the computer made up.");
            System.out.println("Now another player is trying to guess.");
        }
    }

    private void printNumbers() {
        System.out.println(player1.getName() + " ran out of attempts. Game over.");
        System.out.println("Computer made up a number: " + randomNumber);
        System.out.println(player1.getName() + " entered the numbers: " + Arrays.toString(player1.getNumbers()));
        System.out.println(player2.getName() + " entered the numbers: " + Arrays.toString(player2.getNumbers()));
    }
}