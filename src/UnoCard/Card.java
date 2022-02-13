/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UnoCard;

/**
 *
 * @author alayp
 */
public class Card {
    
    //Enum is a OOP that is used to define a constant set of values that can be used anywhere in the program
    public enum Color {RED, YELLOW, GREEN, BLUE};
    public enum Rank {ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,SKIP,REVERSE,DRAW_TWO,DRAW_FOUR,WILDCARD};
    
    private Color color;
    private Rank rank;
    
    public Card(Color c, Rank r){
        this.color = c;
        this.rank = r;
    }
    //Getter function can be used in another program to reterive the value of the variable 
    public Rank getRank(){
        return rank;
    }
    
    public Color getColor(){
        return color;
    }
}
