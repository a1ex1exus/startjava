package lesson_4.game;

public class Player {
    private String name;
    private int[] numbers = new int[10];

    public void addNumber(int i, int userNumber) {
        if ((userNumber > 100) && (userNumber < 1)) {
            System.out.println("The number you entered is less than 1 or greater than 100. Repeat the enter.");
        } else {
            numbers[i] = userNumber;
        }
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return numbers;
    }
}