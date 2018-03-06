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
import java.util.*;

public class Deck {
    
     ArrayList<Card> deck = new ArrayList<>();
     
      ArrayList<Card> player1cards = new ArrayList<>();
    ArrayList<Card> player2cards = new ArrayList<>();

    public Deck(){
      
        for(int i = 0; i <= 3; i++){
            for(int j = 0; j <= 12; j++ ){
               Card card = new Card(i, j);
               deck.add(card);
            }
            
        } 
        
        for(int i = 0; i <= 25; i++){
            player1cards.add(deck.get(i));
           
        }
        
        for(int i = 26; i <= 51; i++){
            player2cards.add(deck.get(i));
           
        }
        
    }
    
    
    public void shuffle(){
        Collections.shuffle(deck);
        Collections.shuffle(player1cards);
        Collections.shuffle(player2cards);
    }
    public void printAllCards(){
        for(int i = 0; i < deck.size(); i++){
            System.out.println(deck.get(i));
        }
    }
}
