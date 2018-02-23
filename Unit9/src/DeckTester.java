/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */	
		String[] ranks = {"1", "2", "3"};
		String[] suits = {"Hearts", "Spades", "Clubs"};
		int[] points = {1, 2, 3};
		Deck deck1 = new Deck(ranks, suits, points);
		System.out.println(deck1.toString());
		deck1.deal();
		System.out.println(deck1.toString());
		
		ranks[1] = "4";
		suits[2] = "Diamonds";
		points[0] = 9;
		Deck deck2 = new Deck(ranks, suits, points);
		System.out.println(deck2.toString());
		deck2.deal();
		System.out.println(deck2.toString());
		
		ranks[1] = "7";
		suits[0] = "Clubs";
		points[2] = 5;
		Deck deck3 = new Deck(ranks, suits, points);
		System.out.println(deck3.toString());
		deck3.deal();
		System.out.println(deck3.toString());
		
		/*
		String[] fullRanks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] fullSuits = {"Hearts", "Hearts", "Hearts", "Hearts", "Hearts", "Hearts", "Hearts", "Hearts", "Hearts", "Hearts", "Hearts", "Hearts","Diamonds","Diamonds","Diamonds","Diamonds","Diamonds","Diamonds","Diamonds","Diamonds","Diamonds","Diamonds","Diamonds","Diamonds","Spades","Spades","Spades","Spades","Spades","Spades","Spades","Spades","Spades","Spades","Spades","Spades","Clubs","Clubs","Clubs","Clubs","Clubs","Clubs","Clubs","Clubs","Clubs","Clubs","Clubs","Clubs"};
		int[] fullPoints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck deck4 = new Deck(fullRanks, fullSuits, fullPoints);
		deck4.shuffle();
		deck4.toString();
		*/
	}
}