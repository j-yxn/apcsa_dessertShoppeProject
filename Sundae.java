public class Sundae extends IceCream
{
	private int priceTopping; // price for desired topping		
	private String nameTopping; // name for desired topping		
	private int price; // total price, in cents
	
	public Sundae(String iceCreamName, String toppingName, int iceCreamPrice, int toppingPrice) 
	{
		// sets the IceCream name, price, and topping price
		super(iceCreamName, iceCreamPrice);
		nameTopping = toppingName;
		priceTopping = toppingPrice;		
	}
	
	public String getTopName()
	{
		return nameTopping;
	}
	
	public int getPrice(){
		// returns the total price of the Sundae item
		price = priceTopping + super.getPrice();
		return price;
	}
}
