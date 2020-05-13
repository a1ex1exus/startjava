package lesson_4.game;

public class Player {
    private String name;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public Player (String name, int[] numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    public Player getAll(String name, int [] numbers) {
        return Player(name, numbers);
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return numbers;
    }
 }

