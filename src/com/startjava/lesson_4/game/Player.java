
//TODO:
// addNumberToArray setNumber
// checkNumber верни в класс игры
// в checkNumber вместо трех return можно сделать два

package lesson_4.game;

public class Player {
    private String name;
    public int[] numbers = new int[10];

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