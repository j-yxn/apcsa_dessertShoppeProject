public class IceCream extends DessertItem 
{
	private int price; // total price, in cents	

	public IceCream(String name, int p) 
	{
		// sets desired name and price
		super(name);
		price = p;
	}
	
	public int getPrice(){
		// retuns total price of the IceCream item
		return price;
	}
}
