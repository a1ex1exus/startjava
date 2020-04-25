public class Player {

    private String name;
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAttempt(int attempt) {
        if((attempt > 100) && (attempt < 1)) {
            System.out.println("The number you entered is less than 1 or greater than 100. Repeat the enter.");
        } else { 
            this.attempt = attempt;
        }    
    }
    public int getAttempt() {
        return attempt;
    }
}