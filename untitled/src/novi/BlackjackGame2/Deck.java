package novi.BlackjackGame2;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    public List<Integer> cardDeck;


    public Deck() {

        cardDeck = new ArrayList<>();

        // for loop voor de kaarten 2 t/m 10 in String value
        for (int i = 2; i <= 10; i++) {
            cardDeck.add(Integer.valueOf(i));
        }

        // Voeg speciale kaarten toe
        cardDeck.add(10); //farmer
        cardDeck.add(10); //queen
        cardDeck.add(10); //king
        cardDeck.add(11); //ace
        // Weet nog niet hoe ik de integers ook kan benoemen in het spel.


    }

    public void printCardDeck() {
        for(Integer card : cardDeck) {
            System.out.println(card);
        }
    }

}
