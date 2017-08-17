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
    
//    public static void createPlayer(){
//        Card[] hand = new Card[7];
//    }
//    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //generate initial unshuffled deck
        Deck testDeck = new Deck();
        testDeck.printDeck(); //check it
        System.out.println("\n");
        
        //now shuffle deck and see if it has correctly been shuffled
        testDeck.shuffleDeck();
        testDeck.printDeck();
        
        //check suit and value functions return correct values for last card in shuffled deck
        System.out.printf("suit is %d\n", testDeck.getCard(52).getCardSuit());
        System.out.printf("value is %d\n", testDeck.getCard(52).getCardValue());
        
        
          System.out.println("\n");
        //generate initial unshuffled player hand
        PlayerHand testHand = new PlayerHand();
        testHand.printPlayerHand(); //check it
        System.out.println("\n");
        
         Dealer.deal(testDeck, testHand, 46);
          testHand.printPlayerHand(); //check it
               
        //check suit and value functions return correct values for last card in shuffled deck
        System.out.printf("suit is %d\n", testHand.getCard(7).getCardSuit());
        System.out.printf("value is %d\n", testHand.getCard(7).getCardValue());
        
         System.exit(0);
    }
    
}
