public class Card{
  private String color;
  private String suit; 
  private char rank; 
  
  public Card(){
    color = "red";
    suit = "diamonds";
    rank = 'A';
  }
  public String getColor(){
    return color;
  }
  public void setColor(String newColor){
    color = newColor;
  }
  public String getSuit(){
    return suit;
  }
  public void setSuit(String newSuit){
    suit = newSuit;
  }
  public char getRank(){
    return rank;
  }
  public void setRank(char newRank){
    rank = newRank;
  }
 
  public String toString(){
    return color + " " + suit + " " + rank; 
  }

}