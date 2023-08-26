package novi.BlackjackGame2;

public class WinOrLose {

    Dealer dealer = new Dealer();
    Player player = new Player();
    public void compareResults() {
        int houseCardInHand = dealer.getHouseCardInHand();
        int cardInhand = player.getCardInhand();


        if(houseCardInHand < cardInhand) {
            System.out.println("--------------------\nYou motherfucker, you win\n--------------------");
        } else if (houseCardInHand >= 22) {
            System.out.println("--------------------\nYou motherfucker, you win\n--------------------");

        } else if (cardInhand < houseCardInHand) {
            System.out.println("--------------------\nSorry you lose\n--------------------");

        } else {
            System.out.println("--------------------\n Draw \n--------------------");
        }
    }


}
