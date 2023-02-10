public class IceCream extends DessertItem 
{
	private int price;		

	public IceCream(String name, int p) 
	{
		super(name);
		price = p;
	}
	
	public int getPrice() 
	{
		return price;
	}
}