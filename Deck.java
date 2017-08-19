/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poophead;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Calum
 */
public class Deck {

    //represent deck as 52 Card array
    private Card[] deck = new Card[52];

    //initialise deck to contain 1 of each of the 52 cards
    public Deck() {
        for (int i = 1; i <= deck.length; i++) {
            deck[i - 1] = new Card(i);
        }
    }

    public void printDeck() {
        for (int i = 0; i < deck.length; i++) {
            deck[i].stringCard();
        }
    }

    //shuffle around cards contained in deck so that their order is randomised.
    public void shuffleDeck() {
        Collections.shuffle(Arrays.asList(deck));
    }

    //returns card from deck where chosen cards are values between 1-52.
    public Card getCard(int chosenCard) {
        return deck[chosenCard - 1];
    }

    public void setNullCard(int deckPosition) {
        //create a new null card to replace the card dealt from the deck to a player.
        Card nullCard = new Card(0);
        //set card in deck to be null as it has now been given to a player.
        deck[deckPosition] = nullCard;
    }

}
