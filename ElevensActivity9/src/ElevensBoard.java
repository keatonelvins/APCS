import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public ElevensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 	//calls parent class constructor
	 	System.out.println("Keaton Elvins\nPeriod 2\n3/23/18\nComputer 2");
	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		if(selectedCards.size() == 3){
			if(containsTripletSum11(selectedCards) == true)
				return true;
			return false;
		}
		else if (selectedCards.size() == 2){
			if(containsFacePair(selectedCards) == true)
				return true;
			return false;
		}
		else
			return false;
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		if(containsTripletSum11(super.cardIndexes()) == true)
			return true;
		else if (containsFacePair(super.cardIndexes()) == true)
			return true;
		else
			return false;
	}

	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	private boolean containsTripletSum11(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */ 
		for (int i = 0; i < selectedCards.size(); i++) {
			int first = selectedCards.get(i).intValue();
			for(int j = i + 1; j < selectedCards.size(); j++) {
				int second = selectedCards.get(j).intValue();
				for(int k = j + 1; k < selectedCards.size(); k++){
					int third = selectedCards.get(k).intValue();
					if (cardAt(first).pointValue() + cardAt(second).pointValue() + cardAt(third).pointValue() == 11) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean containsFacePair(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		int isJack = 0;
		int isQueen = 0;
		int isKing = 0;
		for (Integer intObj : selectedCards) {
			int cardIndex = intObj.intValue();
			String cardRank = cardAt(cardIndex).rank();
			if(cardRank.equals("jack"))
				isJack++;
			if(cardRank.equals("queen"))
				isQueen++;
			if(cardRank.equals("king"))
				isKing++;
		}
		if(isJack == 2 || isQueen == 2 || isKing == 2)
			return true;
		return false;
	}
}
