import java.util.*;

public class Checkout 
{
	private ArrayList<DessertItem> dessert = new ArrayList<DessertItem>();
	private int itemsTotal;
	private String storeName = "Sweets Heaven";
	private int maxReceiptWidth = 30;
	
	public Checkout() 
	{
		itemsTotal = 0;
	}
	
	public int numberOfItems() 
	{
		return itemsTotal;
	}
	
	public void enter(DessertItem item) 
	{
		dessert.add(itemsTotal, item);
		itemsTotal++;
	}
	
	public void clearAll() 
	{
		for(int i = 0; i < itemsTotal; i++)
		{
			dessert.set(i, null);			
		}
		itemsTotal = 0;
	}
	
	public int totalCost() 
	{
		int sum = 0;
		for(int i = 0; i < itemsTotal; i++) 
		{
			sum += dessert.get(i).getPrice(); 
		}
		return sum;
	}
	
	public int totalTax() 
	{
		return (int)Math.round(this.totalCost() * 6.0 / 100.00); // Multiplies the tax rate (0.06) with the total cost 
	}
	
	public static String centsConversion(int cents) 
	{
		String convert = "";			
		int dollars = cents / 100;
		cents = cents % 100;
			
		if (dollars > 0) 
		{
			convert += dollars;
		}			
		convert += ".";
		if (cents < 10)
		{
			convert += "0";
		}			
		convert += cents;
			
		return convert;
	}
	
	public String dessertListing()
	{
		String str = "";
		for(int i = 0; i < itemsTotal; i++)
		{
			String itemName = dessert.get(i).getName();		// items of every line
			String priced = centsConversion(dessert.get(i).getPrice());	// price of every item
			
			if (dessert.get(i) instanceof Candy) //if current DessertItem in ArrayList is Candy
			{	
				double getLb = ((Candy) dessert.get(i)).getWeight();
				String convert = centsConversion(((Candy) dessert.get(i)).getPerPound());
				str += (getLb + " lbs @ " + convert + " / lb\n");
				
				while(itemName.length() < maxReceiptWidth - priced.length())
				{
					itemName += " ";
				}
				str += itemName + priced + "\n";	
			}
			
			else if (dessert.get(i) instanceof Cookie) //if current DessertItem in ArrayList is Cookie 
			{		
				int getAmt = ((Cookie)dessert.get(i)).getAmount();
				String convert = (centsConversion(((Cookie)dessert.get(i)).getPerDozen()));
				str += (getAmt + " @ " + convert + " / dz\n");
				
				while(itemName.length() < maxReceiptWidth - priced.length())
				{
					itemName += " ";
				}
				str += itemName + priced + "\n";			
			}	
			
			else if (dessert.get(i) instanceof Sundae) // if current DessertItem in ArrayList is Sundae
			{	
				String getTopping = ((Sundae)dessert.get(i)).getTopping();
				str += itemName + " Sundae w/\n";
				
				while(getTopping.length() < maxReceiptWidth - priced.length())
				{
					getTopping += " ";
				}
				str += getTopping + priced + "\n";				
			}
			
			else //if current DessertItem in ArrayList is IceCream
			{	
				while(itemName.length() < maxReceiptWidth - priced.length())
				{
					itemName += " ";
				}
				str += itemName + priced + "\n";
			}			
		}
		
		return str;
	}
	
	public String finalItems()
	{
		String str = "";
		String no = "" + itemsTotal;
		str += "Number of Items:";
				
		while(str.length() < maxReceiptWidth - no.length())
		{
			str += " ";
		}	
		str += no + "\n";	
		
		return str;
	}
	
	public String beforeCost()
	{
		String str = "";
		str = "Cost:";	
		String cost = centsConversion(totalCost());
			
		while(str.length() < maxReceiptWidth - cost.length())
		{
			str += " ";
		}	
		str += cost;
		
		return str;
	}
	
	public String finalTax()
	{
		String str = "";
		str = "Tax:";		
		String tax = centsConversion(totalTax());	
		
		while(str.length() < maxReceiptWidth - tax.length())
		{
			str += " ";
		}	
		str += tax;
		
		return str;
	}
	
	public String finalCost()
	{
		String str = "";
		str = "Total Cost:";
		String totalCost = centsConversion(totalCost() + totalTax());	// print total cost
		
		while(str.length() < maxReceiptWidth - totalCost.length())
		{
			str += " ";
		}	
		str += totalCost;
		
		return str;		
	}
	
	public String toString() 
	{
		String finalR = "";	// logging 
		
		finalR += "        " + storeName + "\n";
		finalR += "------------------------------\n"; 
		finalR += dessertListing();
		finalR += "------------------------------\n";
		finalR += finalItems();
		finalR += "\n" + beforeCost();
		finalR += "\n" + finalTax();
		finalR += "\n------------------------------\n";
		finalR += finalCost();
		
		return finalR;
	}
}