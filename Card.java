/*
 * Class to represent a card from a standard 52-card deck.
 */
package poophead;

/**
 *
 * @author Calum
 */
public class Card {

    private int cardNumber = 0;

    //public methods
    //create card using specified card number 1-52
    public Card(int inputCardNumber) {
        this.cardNumber = inputCardNumber;
    }

    //method to copy card value from a given card
    public void copyCard(Card card) {
        this.cardNumber = card.getCardNumber();
    }

    //method to set a card's number
    public void setCard(int cardValue) {
        this.cardNumber = cardValue;
    }

    //get card values as number between 1-52 (can also be 0 to represent a null card)
    public int getCardNumber() {
        return (cardNumber);
    }

    //print card in a string representation.
    public String stringCard() {

        String[] cardNames = new String[]{
            "-- ",
            "2h ", "3h ", "4h ", "5h ", "6h ", "7h ", "8h ", "9h ", "10h", "Jh ", "Qh ", "Kh ", "Ah ",
            "2c ", "3c ", "4c ", "5c ", "6c ", "7c ", "8c ", "9c ", "10c", "Jc ", "Qc ", "Kc ", "Ac ",
            "2d ", "3d ", "4d ", "5d ", "6d ", "7d ", "8d ", "9d ", "10d", "Jd ", "Qd ", "Kd ", "Ad ",
            "2s ", "3s ", "4s ", "5s ", "6s ", "7s ", "8s ", "9s ", "10s", "Js ", "Qs ", "Ks ", "As "};
        //convert card number to correct value in array of cards.
        // System.out.println(cardNames[cardNumber]);
        return cardNames[cardNumber];
    }

    //method to return suit as 1-4 where 1= hearts, 2 = clubs, 3 = diamonds, 4 = spades.
    public int getCardSuit() {
        int suit = 0;

        if (cardNumber == 0) {
            //do nothing
        } else if (cardNumber < 14) {
            suit = 1; //must be hearts
        } else if (cardNumber < 27) {
            suit = 2; //must be clubs
        } else if (cardNumber < 40) {
            suit = 3; //must be diamonds
        } else if (cardNumber < 53) {
            suit = 4; //must be spades
        }
        return suit; //if returns 0 then above conditions have not been met and an error has occurred
    }

    //method to return card value as number between 2 and 14 (Ace is high and represented by value 14)
    public int getCardValue() {
        int value = -1;

        if (cardNumber == 0) {
            //do nothing
        } else if (cardNumber < 14) {
            value = cardNumber; //must be hearts
        } else if (cardNumber < 27) {
            value = cardNumber - 13; //must be clubs
        } else if (cardNumber < 40) {
            value = cardNumber - 26; //must be diamonds
        } else if (cardNumber < 53) {
            value = cardNumber - 39; //must be spades
        }
        return value + 1; //if returns 0 then above conditions have not been met and an error has occurred
    }

    public String special() {
        /* check to see if card is one of the special cards, i.e. has a special effect on play
       * card value is returned in range 2-14, special cards are: 2 (reset pile), 
       * 7 (play 7 or lower), 8 (invisible / see-through), 10 (burn pile), J (reverse direction of play).
         */
        int value = this.getCardValue();

        String result;

        switch (value) {
            case 2:
                result = "Reset pile";
                break;
            case 7:
                result = "Play 7 or lower";
                break;
            case 8:
                result = "Card is invisible";
                break;
            case 10:
                result = "Burn pile";
                break;
            case 11:
                result = "Reverse direction";
                break;
            default:
                result = "Not a special card";
                break;
        }

        return result;
    }
}
