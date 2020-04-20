public class GuessNumber {

    public GuessNumber(int randomNumber, int attempt) {
        this.randomNumber = randomNumber;
        this.attempt = attempt;
    }

    public void play () {

        while(randomNumber != attempt) {
            if(randomNumber < attempt) {
            System.out.println("You entered number " + attempt + ". It is greater as a computer number.");
            System.out.println("And now another player is trying to guess.");
            } if(randomNumber > attempt) {
            System.out.println("You entered number " + attempt + ". It is less as a computer number.");
            System.out.println("Now another player is trying to guess.");
            }
        }   System.out.println("You guessed.\nYou won!");
    }
        
}