import java.util.Arrays;
import java.util.Stack;

public class Player 
{
	private Stack<Integer> myDeck;
	private String name;
	
	public Player(String name)
	{
		this.name = name;
	}
	
	public void setDeck(Stack<Integer> myDeck)
	{
		this.myDeck = myDeck;
	}
	
	@Override
	public String toString()
	{
		return name + "\'s Deck: \n" + Arrays.toString(myDeck.toArray());
	}
}
