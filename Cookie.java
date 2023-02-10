public class Cookie extends DessertItem 
{
	private int amt;
	private int perDozen;		
	private int price;
	
	public Cookie(String name, int a, int pd) 
	{
		super(name);
		amt = a;
		perDozen = pd;
	}
	
	public int getPrice() 
	{
		price = (int)Math.round(amt / 12.0 * perDozen);
		return price;
	}

	public int getAmount() 
	{
		return amt;
	}

	public int getPerDozen() 
	{
		return perDozen;
	}	
}