import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private Player player1;
    private Player player2;
  
    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

        public void play() {

            int randomNumber;
            Scanner keyboard = new Scanner(System.in);
            Random rand = new Random();
            randomNumber = rand.nextInt(100) + 1;

            System.out.println("Ok, let's play!");
            for(int i = 0;  ; i++) {
                int attempNumber1 = (i )/2+1;
                int attempNumber2 = (i + 1)/2;

                if(i%2 == 0) {
                    System.out.println(player1.getName() + ", enter any integer from 1 to 100.");
                    int attempt1 = keyboard.nextInt();
                   
                        if(randomNumber != attempt1) {
                            if(randomNumber < attempt1) {
                                System.out.println(player1.getName() + ", you entered number " + attempt1 + ". It is greater than the computer made up.");
                                System.out.println("And now another player is trying to guess.");
                                continue;
                            } 
                            if(randomNumber > attempt1) {
                                System.out.println("You entered number " + attempt1 + ". It is less than the computer made up.");
                                System.out.println("Now another player is trying to guess.");
                                continue;
                            }
                        } else {
                            System.out.println("You guessed from attempt number " + attempNumber1 + ". \nYou won!");
                            break;
                        }
                }
                
                if(i%2 == 1) {
                    System.out.println(player2.getName() + ", enter any integer from 1 to 100.");
                    int attempt2 = keyboard.nextInt();
                        if(randomNumber != attempt2) {
                            if(randomNumber < attempt2) {
                                System.out.println(player2.getName() + ", you entered number " + attempt2 + ". It is greater than the computer made up.");
                                System.out.println("And now another player is trying to guess.");
                                continue;
                            } 
                            if(randomNumber > attempt2) {
                                System.out.println(player2.getName() + " you entered number " + attempt2 + ". It is less than the computer made up.");
                                System.out.println("Now another player is trying to guess.");
                                continue;
                            }
                        } else {
                            System.out.println("You guessed from attempt number " + attempNumber2 + ". \nYou won!");
                            break;
                       }
                }
            }
        }
    
}
        
