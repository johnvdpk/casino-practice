package novi.BlackjackGame2;

import java.util.Random;

public class Dealer {


    private int houseCardInHand;
    public Deck deck;

    public Dealer(){
        this.deck = new Deck();
    }

    public void turnHouse() throws InterruptedException {
        Random random = new Random();
        houseCardInHand = 0;

        while(houseCardInHand <= 16) {
            Thread.sleep(1000);
            System.out.println("House says hit");
            int houseTakeRandomCardFromDeck = deck.cardDeck.get(random.nextInt(deck.cardDeck.size()));
            houseCardInHand += houseTakeRandomCardFromDeck;
            System.out.println(houseCardInHand);
        }

        if (houseCardInHand >= 16 && houseCardInHand <=21){
            System.out.println("House says Stay");
            System.out.println(houseCardInHand);

        } else if (houseCardInHand >= 22) {
            System.out.println("house is busted");
        }

    }


    public int getHouseCardInHand() {
        return houseCardInHand;
    }
}
