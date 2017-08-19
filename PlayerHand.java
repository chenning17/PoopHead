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

    //initialise hand to contain unknown cards
    public PlayerHand() {
        for (int i = 1; i <= this.size; i++) {
            hand[i - 1] = new Card(0);
        }
    }

    //reduce the sie of the hand.
    public void reduceHandSize() {
        this.size = 2;

    }

    public void setPlayerHand(Card[] cards) {
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

    public void setPlayerCard(Card card, int handPosition) {

        //copy given card to hand, in chosen position in hand
        hand[handPosition].setCard(card.getCardNumber());
    }

    public void printPlayerHand() {
        String handAsString = "";
        for (int i = 0; i < this.size; i++) {
            handAsString += hand[i].stringCard() + " ";
        }
        System.out.printf("%s\n", handAsString);
    }

    //arrange cards in hand by suit and value
    public void sortPlayerHand() {
        // Collections.shuffle(Arrays.asList(deck));
    }

    //returns card from hand where chosen cards are values between 1-length of player hand.
    public Card getCard(int chosenCard) {
        return hand[chosenCard - 1];
    }

    public void playCard(int cardPosition, CurrentState state, Pile pile) {
        //update the current state of the game
        state.update(this.getCard(cardPosition));

        //now update the pile cards so the top card (next null card) is now the card played by the player
        pile.setPileCard(this.getCard(cardPosition), pile.nextNull());

        // now print out current pile to terminal
        pile.printTopCards();

        //now replace the played card in the hand with a null one.
        Card nullCard = new Card(0);
        //cardPosition here is given as value 1-7 so need to subtract 1 to get correct index.
        this.setPlayerCard(nullCard, cardPosition - 1);

        //now need to replace played card by a new one from the deck.
        //****************************
    }

//    //method used to update the properties of a players hand when a card is played
//    public void update(){
//        
//    }
}
