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
		
		String[] ranks1 = {"1", "2", "3"};
		String[] suits1 = {"Hearts", "Spades", "Clubs"};
		int[] points1 = {1, 2, 3};
		Deck deck1 = new Deck(ranks1, suits1, points1);
		System.out.println(deck1.toString());
		deck1.deal();
		System.out.println(deck1.toString());
		
		String[] ranks2 = {"4", "5", "6"};
		String[] suits2 = {"Hearts", "Spades", "Clubs"};
		int[] points2 = {1, 2, 3};
		Deck deck2 = new Deck(ranks2, suits2, points2);
		System.out.println(deck2.toString());
		deck2.deal();
		System.out.println(deck2.toString());
		
		String[] ranks3 = {"1", "2", "3"};
		String[] suits3 = {"Diamonds"};
		int[] points3 = {1, 2, 3};
		Deck deck3 = new Deck(ranks3, suits3, points3);
		System.out.println(deck3.toString());
		deck3.deal();
		System.out.println(deck3.toString());
		
		
		String[] fullRanks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] fullSuits = {"Hearts", "Diamonds", "Spades", "Clubs"};
		int[] fullPoints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck deck4 = new Deck(fullRanks, fullSuits, fullPoints);
		deck4.shuffle();
		System.out.println(deck4.toString());
	}
}
