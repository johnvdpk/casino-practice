package novi.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BlackjackgameOld {

    private Scanner inputScanner;

    private List<Integer> cardDeck;

    public BlackjackgameOld(Scanner inputScanner) {
        this.inputScanner = inputScanner;
        cardDeck = new ArrayList<>();
      }

    public List<Integer> cardDeck() {

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

        return cardDeck;
    }



    public void playGame() throws InterruptedException {

        Scanner enterScanner = new Scanner(System.in);
        Random random = new Random();


        int gameOver = 21;
        int cardInhand = 0;

        int houseCardInHand = 0;



        while(cardInhand <= gameOver) {

            System.out.println("hit or stay?");
            String choice = inputScanner.nextLine().toLowerCase();

            switch (choice) {
                case "hit":
                    System.out.println("you chose to hit");
                    int takeRandomCardFromDeck = cardDeck.get(random.nextInt(cardDeck.size()));
                    cardInhand += takeRandomCardFromDeck;
                    System.out.println(cardInhand);

                    break;
                case "stay":
                    System.out.println("you chose to stay");
                    System.out.println("Your total score: " + cardInhand);
                    System.out.println("Type Enter and let the house play");
                    enterScanner.nextLine();
                                    while(houseCardInHand <= 16) {
                                        Thread.sleep(1000);
                                        System.out.println("House says hit");
                                        int houseTakeRandomCardFromDeck = cardDeck.get(random.nextInt(cardDeck.size()));
                                        houseCardInHand += houseTakeRandomCardFromDeck;
                                        System.out.println(houseCardInHand);
                                    }

                                    if (houseCardInHand >= 16 && houseCardInHand <=21){
                                        System.out.println("House says Stay");
                                        System.out.println(houseCardInHand);

                                    } else if (houseCardInHand >= 22) {
                                        System.out.println("house is busted");
                                    }

                                    if(houseCardInHand < cardInhand) {
                                        System.out.println("--------------------\nYou motherfucker, you win\n--------------------");
                                    } else if (houseCardInHand >= 22) {
                                        System.out.println("--------------------\nYou motherfucker, you win\n--------------------");

                                    } else if (cardInhand < houseCardInHand) {
                                        System.out.println("--------------------\nSorry you lose\n--------------------");

                                    } else {
                                        System.out.println("--------------------\n Draw \n--------------------");
                                    }

                                    return;
                default:
                    System.out.println("Sorry I don't get you, try again");
            }




        }

        System.out.println("You're Busted");

        }



    }


