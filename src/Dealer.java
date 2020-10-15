import java.util.Stack;
import java.util.Collections;
import java.util.Arrays;

public class Dealer 
{
	private Stack<Integer> deck;
	private Player player1;
	private Player player2;

	public Dealer(Player player1, Player player2)
	{
		this.player1 = player1;
		this.player2 = player2;
		this.deck = new Stack<>();
		configure();
		dealCards();
	}
	
	private void configure()
	{
		for(int i = 1; i < 11; i++) {
			deck.push(i);
		}
	}
	
	private void dealCards()
	{
		Collections.shuffle(deck);
		Collections.shuffle(deck);
		
		Stack<Integer> p1Deck = new Stack<>();
		Stack<Integer> p2Deck = new Stack<>();
		
		for(int i = 0; i < 10; i++) {
			if(i < 5) {
				p1Deck.push(deck.pop());
			} else {
				p2Deck.push(deck.pop());
			}
		}
		
		player1.setDeck(p1Deck);
		player2.setDeck(p2Deck);
	}

}
