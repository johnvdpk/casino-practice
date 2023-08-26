package novi.BlackjackGame2;

import java.util.Scanner;

public class WinOrLose {

    Scanner scanner = new Scanner(System.in);
    private Dealer dealer;
    private Player player;

    public WinOrLose(Dealer dealer, Player player) {
        this.dealer = dealer;
        this.player = player;
    }

    public void compareResults() {
        int houseCardInHand = dealer.getHouseCardInHand();
        int cardInhand = player.getCardInhand();

        System.out.println("\nYour cards are " + cardInhand);
        System.out.println("Dealers cards are " + houseCardInHand + "\n");

        if(houseCardInHand < cardInhand) {
            System.out.println("--------------------\nYou motherfucker, you win\n--------------------");
        } else if (houseCardInHand >= 22) {
            System.out.println("--------------------\nYou motherfucker, you win\n--------------------");

        } else if (cardInhand < houseCardInHand) {
            System.out.println("--------------------\nSorry you lose\n--------------------");

        } else {
            System.out.println("--------------------\n Draw \n--------------------");
        }

        System.out.println("Want to play again?\n PRESS ENTER\n");
        scanner.nextLine();

    }


}
