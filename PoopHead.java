/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poophead;

/**
 *
 * @author Calum 15/08/17
 */
public class PoopHead {

    /**
     * @param args the command line arguments
     */
    public static void printAllInfo(PlayerHand hand, CurrentState state) {
        //prints all current state information and prints player's current hand .
        //state.getState();
        // hand.printPlayerHand(); 

    }

    //test method to implmement the order of play and play a card by that player
    public static void nextPlay(PlayerHand[] player, Pile pile, CurrentState state) {

        //get value of who is to play next.
        int nextTurn = state.getTurn();

        player[nextTurn].playCard(7, state, pile);
        //print current state
        //printAllInfo(player[nextTurn], state);

    }

    public static void main(String[] args) {

        //game properties:
        int NUMBER_OF_PLAYERS = 3;

        //initialise number of players for game
        PlayerHand[] player = new PlayerHand[NUMBER_OF_PLAYERS];

        for (int i = 0; i < player.length; i++) {
            player[i] = new PlayerHand();
        }

        //generate initial unshuffled deck
        Deck testDeck = new Deck();

        //create initial pile object
        Pile pile = new Pile();

        //testDeck.printDeck(); //check it
        //System.out.println("\n");
        //now shuffle deck and see if it has correctly been shuffled
        testDeck.shuffleDeck();
        //testDeck.printDeck();

        
    
        //deal 7 cards from deck inclusively starting from specified card (1-46 in deck (46+6 more = 52)) 
        Dealer.deal(testDeck, player[0], 1);
        Dealer.deal(testDeck, player[1], 8);
        Dealer.deal(testDeck, player[2], 15);

        //print out players hands and player numbers to check them
        System.out.printf("player 1: ");
        player[0].printPlayerHand(); //check it
        System.out.printf("player 2: ");
        player[1].printPlayerHand(); //check it second hand too
        System.out.printf("player 3: ");
        player[2].printPlayerHand(); //check third hand too
        System.out.printf("\n");

        //check CurrentState object functions properly, argument is number of players in game
        CurrentState state = new CurrentState(NUMBER_OF_PLAYERS);
        // state.getState();

        //play cards from each player in correct order.
        nextPlay(player, pile, state);
        nextPlay(player, pile, state);
        nextPlay(player, pile, state);

        System.exit(0);
    }

}
