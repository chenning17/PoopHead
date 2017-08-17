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
public class PlayerHand {
    //represent hand as 7 Card array
    int size = 7;
    private Card[] hand = new Card[size];

    //initialise hand to contain first cards from deck
    public PlayerHand(){
        for(int i=1; i<=this.size; i++){
            hand[i-1] = new Card(0);
        }
    }
    
    //initialise hand to contain first cards from deck
    public void reduceHandSize(){
        this.size = 2;
        
    }
    
    public void setPlayerHand(Card[] cards){
        //find out how many cards have been inputted to function
        int numCards = cards.length;
        
       //copy given cards to hand array
        System.arraycopy(cards, 0, hand, 0, numCards);  
        
        //same as above method for copying arrays.
        /*   for(int i = 0; i<numCards; i++){
                 hand[i] = cards[i];             
             } 
        */
    }
    
     public void setPlayerCard(Card card, int handPosition){
       
       //copy given card to hand array, in chosen position in hand
            hand[handPosition] = card;             
    }
    
    public void printPlayerHand(){
        for(int i=0; i<this.size; i++){
            hand[i].stringCard();
        }
    }
 
    //arrange cards in hand by suit and value
    public void sortPlayerHand(){
        // Collections.shuffle(Arrays.asList(deck));
    }
    
    //returns card from deck where chosen cards are values between 1-length of player hand.
    public Card getCard(int chosenCard){
        return hand[chosenCard-1];
    }
}