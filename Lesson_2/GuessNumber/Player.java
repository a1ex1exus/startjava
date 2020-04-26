public class Player {

    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        if((number > 100) && (number < 1)) {
            System.out.println("The number you entered is less than 1 or greater than 100. Repeat the enter.");
        } else { 
            this.number = number;
        }    
    }

    public int getNumber() {
        return number;
    }
}