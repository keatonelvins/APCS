/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("4", "Hearts", 4);
		System.out.println(card1.toString());
		
		Card card2 = new Card("4", "Hearts", 4);
		System.out.println(card2.toString());
		
		Card card3 = new Card("7", "Diamonds", 7);
		System.out.println(card3.toString());
		
		System.out.println("Card 3 = Card 2 : " + card3.matches(card2));
		
		System.out.println("Card 1 = Card 2 : " + card1.matches(card2));
	}
}
