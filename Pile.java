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
public class Pile {

    //represent pile as 52 Card array - maximum number of cards it can ever be 
    //(will never actually be that close to this though)
    private Card[] pile = new Card[52];

    //create and initialise pile to contain 52 null/unknown Cards
    public Pile(){
        for(int i=0; i<pile.length; i++){
            pile[i] = new Card(0);
        }
    }
    
    //returns card from pile where chosenCard is value between 0-51.
    public Card getCard(int chosenCard){
        return pile[chosenCard];
    }
    
    //used to reinitialise deck to contain 52 null Cards
     public void nullifyPile(){
       for(int i=1; i<=pile.length; i++){
            pile[i-1] = new Card(0);
        }           
    }
     
     //method used to find next available pile space, i.e. where top of pile is / next null card is.
     //this is used so that a card can be played into this spot in the pile card array.
     //returns an integer representing the index at which the next card can be played.
     public int nextNull(){
         //set value to maximum it can be so it can be more easily checked if method is incorrect
         int index = 51;
         for(int i = 0; i<pile.length; i++){
             if(this.getCard(i).getCardNumber() == 0){
                 index = i;
                 break;
             }
         }
         System.out.printf("index value is %d\n", index);
         return index;
     }
     
     //used to set the card for a given position in the pile
     public void setPileCard(Card card, int pilePosition){
            pile[pilePosition].setCard(card.getCardNumber());              
    }
     
     //method to print the last 5 pile  cards to the terminal (if applicable)
     public void printTopCards(){
         int topNull = this.nextNull();
         
         if(topNull >= 5){
             //if there are at least 5 cards in the pile then print the top 5 (not including the null cards
             for(int i = topNull-5; i<topNull; i++){
                 this.getCard(i).stringCard();
             }
         }
         
         else {
                 //if not 5 available cards to print, just print the first 5 cards (including unitialised ones) to the terminal
              for(int i = 0; i<5; i++){
                 this.getCard(i).stringCard();
              }
        }
     }
    


}