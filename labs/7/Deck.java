
package lab7;

public class Deck {
    // Store the size of a deck and the cards it contains
    private int count;
    private Object[] cards;
    
    /* Creates a Deck object of the specified size 
    and containing the specified cards */
    public Deck(int count, Object[] cards) {
            this.count = count;
            this.cards = cards;
    }
}
