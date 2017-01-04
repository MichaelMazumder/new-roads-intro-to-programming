public class CardTester{
  public static void main(String[] args){
    
    Card c = new Card();
    c.setColor("Black");
    c.setSuit("Clubs");
    c.setRank('1'); 
    System.out.println(c.toString());
    
    Card c1 = new Card();
    c1.setColor("Red");
    c1.setSuit("Spades");
    c1.setRank('2');
    System.out.println(c1.toString());
    
    Card c2 = new Card();
    c2.setColor("Black");
    c2.setSuit("Hearts");
    c2.setRank('3');
    
    System.out.println(c2.toString());
    
    Card c3 = new Card();
    c3.setColor("Black");
    c3.setSuit("Diamond");
    c3.setRank('4');
    
    System.out.println(c3.toString());
    
    Card c4 = new Card(); 
    c4.setColor("Red");
    c4.setSuit("Clubs");
    c4.setRank('7');
    
    System.out.println(c4.toString());
  }
}