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
public class CurrentState {
    
    //number of players in the game, used alongside playerTurn to help decide who is to play next
    private int numberOfPlayers = 7;
    
    //used to identify who's turn it is to play next, (should be value 0-6 for max 7 player game)
    private int playerTurn = 0;
    
    //direction of play is either: 1 clockwise, or -1 anticlockwise
    private int direction = -1;
    
   
    
    //previous card, not the top card that can be seen, needed in case an 8 is played
    private Card previousCard = new Card(0);
    
    //current top card, used to identify what cards can be played next
    private Card currentCard = new Card(0);
   
    /*used in case player wants to play more than one card at a time, 
     *important especially when playing 2 or more Jacks as double reverse cancels 
     *out also in case 4 of a kind are played then pile is burnt/.
     */
    private int numberCardsPlayed = 1;
    
    
    public CurrentState(int numPlayers){
        //used to generate this object, and initialise number of players in game
        this.numberOfPlayers = numPlayers;
    }
    
    public void getState(){
        //used to display to the terminal the current state of the current game
        //displays turn direction value, player to play next, the last two cards 
        //to be played and any special effect of the last played card.
        int dir = this.direction;
        int turn = this.playerTurn;
        System.out.printf("\ndirection of play is %d\n", dir);
        System.out.printf("current players turn is player %d\n", turn);
        this.previousCard.stringCard();
        this.currentCard.stringCard();
         System.out.printf("special effect is %s\n", this.currentCard.special());
    }
    
    
     
    //used to update all the above propetties of the current state of the game.
    public void update(Card currCard){
        //first update previous card to be the card previously at the top of the pile
        this.previousCard.copyCard(this.currentCard);
        //now update the new current card, the card that is now visible on the top of the pile       
         this.currentCard.copyCard(currCard);
      
        //update direction
        if(currCard.getCardValue() == 11){
            //card is a jack so reverse the current direction of play.
            this.direction *= -1;
        }
        
        //***NOTE: if pile is burnt same player gets to play again so don't update the playerTurn variable in this case***//
        
        //update turn using new direction of play value in loop 0,1,2,3,4,5,6,0,1 etc. 
        //for clockwise direction or reverse for anticlockwise
        this.playerTurn = (this.playerTurn + direction + this.numberOfPlayers) % this.numberOfPlayers;
       
        
         
    }
   
    
}
