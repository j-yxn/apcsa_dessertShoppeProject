public class Candy extends DessertItem 
{
	private double weight;
	private int perPound;		
	private int price;
	
	public Candy(String name, double w, int p) 
	{
		super(name);
		weight = w;
		perPound = p;		
	}
	
	public int getPrice() 
	{
		price = (int)Math.round(weight * perPound);
		return price;
	}
	
	public int getPerPound() 
	{
		return perPound;
	}
	
	public double getWeight() 
	{
		return weight;
	}
}