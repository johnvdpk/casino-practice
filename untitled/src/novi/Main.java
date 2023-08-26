package novi;

import java.util.Scanner;

import novi.BlackjackGame2.*;
public class Main {

    public static void main(String[] args) throws InterruptedException {

        Deck deck = new Deck();

        Scanner inputScanner = new Scanner(System.in);
        BlackjackGame game = new BlackjackGame(inputScanner);
        Player player = new Player();
        Dealer dealer = new Dealer();
        WinOrLose winOrLose = new WinOrLose(dealer, player);

        player.turnPlayer();
        dealer.turnHouse();
        winOrLose.compareResults();

    }
}
