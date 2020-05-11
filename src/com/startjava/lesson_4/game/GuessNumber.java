
//TODO:     GuessNumber
//TODO:      player1.addNumberToArray(i, number); можно поместить в enterNumber
//TODO:
// все методы, которые не вызываются за пределами класса сделай private
// в printNumbers(int[] numbers) можно передать игрока целиком и использовать
// там же его имя, а не в finishGame
// метод называется printNumbers, но он ничего не печатает.
// В нем же и выводи числа. Сохранять их предварительно в строку не нужно.



package lesson_4.game;

import java.util.Arrays;
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

            player1.enterNumber(player1.getName(), keyboard, i, int number, numbers);

            if (player1.checkNumber(player1.getName(), number, randomNumber, i))) {
               guessed = true;
                break;
            }

            player2.enterNumber(player2.getName(), keyboard, i, number, numbers);

            if (player2.checkNumber(player2.getName(), number, randomNumber, i))) {
                guessed = true;
                break;
            }
        }
        if (!guessed) {
            printNumbers(randomNumber);
        }
    }

     private int enterNumber(String name, Scanner keyboard, int i, int number, int[] numbers) {
        System.out.println(name + ", enter any integer from 1 to 100.");
        number = keyboard.nextInt();
        if ((number > 100) && (number < 1)) {
            System.out.println("The number you entered is less than 1 or greater than 100. Repeat the enter.");
        } else {
            numbers[i] = number;
        }
        return numbers[i];
    }

    private boolean checkNumber(String name, int randomNumber, int number,  int i) {
        if (randomNumber < number) {
            System.out.println(name + ", you entered number " + number + ". It is greater than the computer made up.");
            System.out.println("And now another player is trying to guess.");
            return false;
        } else if (randomNumber > number) {
            System.out.println(name + ", you entered number " + number + ". It is less than the computer made up.");
            System.out.println("Now another player is trying to guess.");
            return false;
        } else {
            System.out.println(name + ", you guessed number " + number + " from attempt number " + i + ". \nYou won!");
            return true;
        }
    }

    void printNumbers(int randomNumber) {
        System.out.println(player1.getName() + " ran out of attempts. Game over.");
        System.out.println("Computer made up a number: " + randomNumber);
        System.out.println(player1.getName() + " entered the numbers: " + Arrays.toString(player1.getNumbers()));
        System.out.println(player2.getName() + " entered the numbers: " + Arrays.toString(player2.getNumbers()));
    }
}