package com.startjava.lesson_1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        int secretNumber = 89;
        int yourNumber = 85;

        if(yourNumber > secretNumber) {
            System.out.println("The number you entered is greater than what the computer made.");
            do { 
                yourNumber--;
                System.out.println("Your attempt:" + yourNumber);
            } while(yourNumber > secretNumber);
        } else if(yourNumber < secretNumber) {
            System.out.println("The number you entered is less than what the computer made.");
            do { 
                yourNumber++;
                System.out.println("Your attempt:" + yourNumber);
            } while(yourNumber < secretNumber);
        }
        System.out.println("You guessed!");
    }
}