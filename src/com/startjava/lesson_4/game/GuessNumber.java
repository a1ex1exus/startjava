package lesson_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

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

        for(int i = 0; i < player1.getNumbers().length; i++) {

            enterNumber(player1.getName(), keyboard, i, player1.getNumbers());

            if(checkNumber(player1.getName(), randomNumber, player1.getNumbers(), i)) {
                guessed = true;
                break;
            }

            enterNumber(player2.getName(), keyboard, i, player2.getNumbers());

            if(checkNumber(player2.getName(), randomNumber, player2.getNumbers(), i)) {
                guessed = true;
                break;
            }
        }
        if(!guessed) {
            printNumbers(randomNumber);
        }
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

    private boolean checkNumber(String name, int randomNumber, int[] numbers, int i) {
        if(randomNumber == numbers[i]) {
            System.out.println(name + ", you guessed number " + numbers[i] + " from attempt number " + (i + 1) + ". \nYou won!");
            return true;
        } else if (randomNumber < numbers[i]) {
            System.out.println(name + ", you entered number " + numbers[i] + ". It is greater than the computer made up.");
            System.out.println("And now another player is trying to guess.");
        } else {
            System.out.println(name + ", you entered number " + numbers[i] + ". It is less than the computer made up.");
            System.out.println("Now another player is trying to guess.");
        }
        return false;
    }

    private void printNumbers(int randomNumber) {
        System.out.println(player1.getName() + " ran out of attempts. Game over.");
        System.out.println("Computer made up a number: " + randomNumber);
        System.out.println(player1.getName() + " entered the numbers: " + Arrays.toString(player1.getNumbers()));
        System.out.println(player2.getName() + " entered the numbers: " + Arrays.toString(player2.getNumbers()));
    }
}