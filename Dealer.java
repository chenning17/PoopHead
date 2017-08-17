/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poophead;

/**
 *
 * @author Calum
 */
public class Dealer {
    
    //method to deal first 7 cards from given deck to a PlayerHand.
    public static void deal(Deck deck, PlayerHand hand, int currentDeckPosition){
        //currentDeckPosition should be number in range 1-52 representing how many cards have been dealt already
        //hand.size should be = 7 or whatever size is given to the PlayerHand initialisation function.
        for(int i=0; i<hand.size; i++){
            hand.setPlayerCard(deck.getCard(currentDeckPosition+i), i);
        }
    }
}
