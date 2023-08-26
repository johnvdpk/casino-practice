package novi.BlackjackGame2;

import java.util.Scanner;

public class BlackjackGame {
    private Scanner inputScanner;

    private boolean gameIsRunning;

    private Deck deck;
    private Player player;
    private Dealer dealer;

    public BlackjackGame(Scanner inputScanner) {
        this.inputScanner = inputScanner;
        this.deck = new Deck();
    }


    public void PlayGame() {
        gameIsRunning = true;

        player = new Player();
        dealer = new Dealer();


    }


}