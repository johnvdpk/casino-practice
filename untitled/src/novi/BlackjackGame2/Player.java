package novi.BlackjackGame2;

import java.util.Random;
import java.util.Scanner;

public class Player {

    public Deck deck;
    private int cardInhand;

    public Player(){
        this.deck = new Deck();
    }


    public void turnPlayer() {

        Scanner inputScanner = new Scanner(System.in);
        Scanner enterScanner = new Scanner(System.in);
        Random random = new Random();


        int gameOver = 21;
        cardInhand = 0;


        while (cardInhand <= gameOver) {

            System.out.println("hit or stay?");
            String choice = inputScanner.nextLine().toLowerCase();

            switch (choice) {
                case "hit":
                    System.out.println("you chose to hit");
                    int takeRandomCardFromDeck = deck.cardDeck.get(random.nextInt(deck.cardDeck.size()));
                    cardInhand += takeRandomCardFromDeck;
                    System.out.println(cardInhand);

                    break;
                case "stay":
                    System.out.println("you chose to stay");
                    System.out.println("Your total score: " + cardInhand);
                    System.out.println("Type Enter and let the house play");
                    enterScanner.nextLine();
                    return;
            }
        }
    }

    public int getCardInhand() {
        return cardInhand;
    }
}