/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poophead;

/**
 *
 * @author Calum
 * 15/08/17
 */
public class PoopHead {

    /**
     * @param args the command line arguments
     */
    
//  public static String special(Card card){
//      /* check to see if card is one of the special cards, i.e. has a special effect on play
//       * card value is returned in range 2-14, special cards are: 2 (reset pile), 
//       * 7 (play 7 or lower), 8 (invisible / see-through), 10 (burn pile), J (reverse direction of play).
//       */
//        int value = card.getCardValue();
//        
//        String result;
//        
//        switch(value){
//        case 2: result = "Reset pile";
//            break;
//        case 7: result = "Play 7 or lower";
//            break;
//        case 8: result = "Card is invisible";
//            break;
//        case 10: result = "Burn pile";
//            break;
//        case 11: result = "Reverse direction";
//            break;
//        default: result = "Not a special card";
//            break;
//        }
//        
//        return result;
//    }
  
    public static void main(String[] args) {
        // TODO code application logic here
        
        //generate initial unshuffled deck
        Deck testDeck = new Deck();
        //testDeck.printDeck(); //check it
        //System.out.println("\n");
        
        //now shuffle deck and see if it has correctly been shuffled
        testDeck.shuffleDeck();
        //testDeck.printDeck();
        
        //check suit and value functions return correct values for last card in shuffled deck
        //System.out.printf("suit is %d\n", testDeck.getCard(52).getCardSuit());
        //System.out.printf("value is %d\n", testDeck.getCard(52).getCardValue());
        
        
        //System.out.println("\n");
                
        //generate initial unshuffled player hand
        PlayerHand testHand = new PlayerHand();
       // testHand.printPlayerHand(); //check it
        //System.out.println("\n");
        
        //deal 7 cards from deck inclusively starting from specified card (1-46 in deck (46+6 more = 52)) 
        Dealer.deal(testDeck, testHand, 46);
        testHand.printPlayerHand(); //check it
               
        //check suit and value functions return correct values for last card in hand
        //System.out.printf("suit is %d\n", testHand.getCard(7).getCardSuit());
        //System.out.printf("value is %d\n", testHand.getCard(7).getCardValue());
         
        //check special effect of last card in hand
        //System.out.printf("special effect is %s\n", testHand.getCard(7).special());
        
        //check CurrentState object functions properly
        CurrentState state = new CurrentState(7);
        state.getState();
        
        testHand.playCard(7, state);
        state.getState();
        
         testHand.playCard(6, state);
        state.getState();
        
         testHand.playCard(5, state);
        state.getState();
        
         testHand.playCard(4, state);
        state.getState();
        
        testHand.playCard(3, state);
        state.getState();
        
         testHand.playCard(2, state);
        state.getState();
        
         testHand.playCard(1, state);
        state.getState();
        
        
        System.exit(0);
    }
    
}
