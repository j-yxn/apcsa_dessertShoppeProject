public class Cookie extends DessertItem 
{
	private int amt; // amount of Cookies
	private int perDozen; // price per dozen (12)		
	private int price; // total price, in cents
	
	public Cookie(String name, int pd, int a) 
	{
		// sets the desried name, price per dozenm and amount
		super(name);
		perDozen = pd;
		amt = a;
	}
	
	public int getPrice(){
		// returns the total price of the Cookie item 
		price = (int)Math.round(amt / 12.0 * perDozen);
		return price;
	}

	public int getAmount(){
		// returns the amount of Cookie items desired
		return amt;
	}

	public int getPerDozen(){
		// returns the price per dozen
		return perDozen;
	}	
}
