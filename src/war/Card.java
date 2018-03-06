package war;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gg119
 */
public class Card {
    private int suit, value;
    private String[] cardSuit = {"Spades", "Diamonds", "Hearts", "Clubs"};
    private String[] cardValue = {"Ace", "2", "3", "4", "5",
                                   "6", "7", "8", "9", "10", "Jack", 
                                   "Queen", "King"};
    public Card(int cSuit, int cValue){
        suit = cSuit;
        value = cValue;
    }
    
    public int getSuit(){
        return suit;
    }
    
    public int getValue(){
        return value;
    }
    public String toString(){
        return "Suit: " + cardSuit[suit] + ", Value: " + cardValue[value];
    }
    
    public String getImage(){
        return "/game/images/" + cardValue[value] + cardSuit[suit]+".png";
        //P:/Game/src/game/images/7Diamonds.png
    }

}
