/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UnoCard;

/**
 *
 * @author alayp
 */
public class GamePlayer {
    public static void main (String[] args){
        CardHand hand = new CardHand();
        hand.generatedeck();
        for(Card c:hand.deck){
            System.out.println(c.getRank()+" of "+c.getColor());
        }
    }
}