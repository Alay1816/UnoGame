/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UnoCard;

/**
 *
 * @author alayp
 */
public class CardHand {
    private int no_of_cards = 60;
    
    Card[] deck = new Card[no_of_cards];
    
    public void generatedeck(){
        int count = 0;
        for(Card.Color c:Card.Color.values()){
            for(Card.Rank r:Card.Rank.values()){
                deck[count] = new Card(c,r);
                count++;
            }
        }
    }
}