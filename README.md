# PoopHead

A fun card game based on the game s***head (rules vary for different versions of the game). 


Currently have set up the deck and ability to deal a set of cards to players. 

Players can now play cards to pile, and update the game properties (direction of play, who's turn it is, etc.)


Next step is to implement the rules of play:
        
        -> 2 resets 
        
        -> 7 or lower
        
        -> 8 see-through
        
        -> 10 burn deck
        
        -> J reverse direction
        
        -> Ace is high
        
        -> 4 of a kind burns deck
        
        -> must have 3 cards in hand at all times while original deck still 
           exists
        
        -> dealt three face down cards and 3 face up cards, can swap face up 
           ones with ones originally dealt to hand
        
        -> can choose to play more than one card at a time if same value
        
        -> cards must be played with equal or greater value than previously 
           played card unless altered by the other rules above. If no card can 
           be played, must pick up the pile.


Hopefully once rules have been implemented can visualise the game.

TODO:

-> properly implement having multiple players (done to a certain extent for now)

-> make hands print out method on one line as easier to read / see.

-> implement rules properly (only obeys Jack change of direction at the moment)

-> add in new class to hold the three face down and three face up cards each player is dealt at start of game.

-> ability to properly resize a players hand, e.g. in case player has to pick up pile.

-> ability to play more than one of the same card at a time if player wants to

-> some sort of visualisation / non terminal interface.

