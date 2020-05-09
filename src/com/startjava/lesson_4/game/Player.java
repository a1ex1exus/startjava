package lesson_4.game;

public class Player {
    private String name;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void addNumberToArray(int i, int number) {
        if ((number > 100) && (number < 1)) {
            System.out.println("The number you entered is less than 1 or greater than 100. Repeat the enter.");
        } else {
            numbers[i] = number;
        }
    }

    public boolean checkNumber(int number, int randomNumber, int i) {
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
}