package novi.higherlower;

import java.util.Random;
import java.util.Scanner;

public class HigherLowerGame {
    private Scanner inputScanner;
    private boolean gameIsRunning;

    private int randomNumber;
    private int numberOfGames;

    public HigherLowerGame(Scanner inputScanner) {

        this.inputScanner = inputScanner;

    }

    public void playGame() {
        numberOfGames = 0;
        gameIsRunning = true;
        Random random = new Random();
        randomNumber = random.nextInt(10);


        // Here you should generate the number to guess

        while (gameIsRunning) {
            System.out.println("Make a guess");

            int input = inputScanner.nextInt();
            System.out.printf("You typed: %s\n", input);

            numberOfGames ++;

            if (input == randomNumber) {
                System.out.println("Correct guess! The game ends.");
                gameIsRunning = false;
            } else {
                System.out.println("Incorrect guess. Try again. This is turn: " + numberOfGames);
             }    // Check if the guess is correct, if so end the game
            }
        }
    }

