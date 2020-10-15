
public class Main
{
	public static void main(String[] args)
	{
		Player evan = new Player("Evan");
		Player alex = new Player("Alex");
		Dealer dealer = new Dealer(evan, alex);
		
		System.out.println(evan.toString());
		System.out.println(alex.toString());
		
	}

}
