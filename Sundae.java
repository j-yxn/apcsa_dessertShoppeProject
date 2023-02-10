public class Sundae extends IceCream
{
	private String nameOfTopping;
	private int priceTopping;		
	private int price;
	
	public Sundae(String iceCreamName, int iceCreamPrice, String tn, int tp) 
	{
		super(iceCreamName, iceCreamPrice);
		nameOfTopping = tn;
		priceTopping = tp;		
	}
	
	public int getPrice() 
	{
		price = priceTopping + super.getPrice();
		return price;
	}
	
	public String getTopping() 
	{
		return nameOfTopping;
	}
}
