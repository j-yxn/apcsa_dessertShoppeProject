import java.util.*;
public class Checkout {
	private ArrayList<DessertItem> dessert = new ArrayList<DessertItem>(); // ArrayList of DessertItem, stores all the desserts desired
	private int totalItems; // int variable of total items in dessert ArrayList
	private String storeName = "Sweets Heaven"; // store name on receipt header
	private int maxReceiptWidth = 30; // maximum spaces the receipt will print
	
	public Checkout() {
		// sets the total amount of DessertItems to 0
		totalItems = 0;
	}
	
	public int numberOfItems() {
		// returns the number of items in the ArrayList currently
		return totalItems;
	}
	
	public void enter(DessertItem item) {
		// adds desired DessertItme into the dessert ArrayList
		// adds 1 to the totalItems variable
		dessert.add(totalItems, item);
		totalItems++;
	}
	
	public void clearAll() {
		// for loop to clear the whole dessert ArrayList
		// sets the totalItems to 0
		for(int i = 0; i < totalItems; i++)
			dessert.set(i, null);			
		totalItems = 0;
	}
	
	public int totalCost() {
		// for loop to calculate all the prices inside the dessert ArrayList
		int sum = 0;
		for(int i = 0; i < totalItems; i++)
			// gets the price of each dessert inside the ArrayList
			sum += dessert.get(i).getPrice(); 
		return sum;
	}
	
	public int totalTax() {
		// returns the total tax rate (0.06 / 6%)
		return (int)Math.round(this.totalCost() * 6.0 / 100.00); 
	}
	
	public String centsConversion(int cents) {
		// converts and returns the cent value to dollar value
		String convert = "";			
		int dollarAmount = cents / 100;
		int remainingCents = cents % 100;
		convert += dollarAmount + ".";	
		if (remainingCents < 10)
			convert += "0";			
		convert += remainingCents;
				
		return convert;
	}
	
	public String dessertListing() {
		// returns the listing of DessertItem in dessert ArrayList
		String str = ""; // logging
		for(int i = 0; i < totalItems; i++) {
			String itemName = dessert.get(i).getName();	// items of every line
			String itemPrice = centsConversion(dessert.get(i).getPrice());	// price of every item
			
			if (dessert.get(i) instanceof Candy) {	// if current DessertItem in ArrayList is Candy 	
				double getLb = ((Candy) dessert.get(i)).getWeight();
				str += getLb + "lbs @ ";
				str += centsConversion(((Candy) dessert.get(i)).getPerPound());
				str	+= "/lb\n";				
				while(itemName.length() < maxReceiptWidth - itemPrice.length())
					itemName += " "; // spaces out the receipt so prices will be aligned properly
				str += itemName + itemPrice + "\n"; 	// adds the Candy name and price into the log
			} else if (dessert.get(i) instanceof Cookie) {	// if current DessertItem in ArrayList is Cookie 		
				int getAmt = ((Cookie)dessert.get(i)).getAmount();				
				str += getAmt + "ct @ ";
				str += centsConversion(((Cookie)dessert.get(i)).getPerDozen()) + "/dz\n";				
				while(itemName.length() < maxReceiptWidth - itemPrice.length())
					itemName += " "; // spaces out the receipt so prices will be aligned properly
				str += itemName + itemPrice + "\n";  // adds the Cookie name and price into the log			
			} else if (dessert.get(i) instanceof Sundae) { 	// if current DessertItem in ArrayList is Sundae
				String getTopping = ((Sundae)dessert.get(i)).getTopName();
				str += itemName + " w/\n";				
				while(getTopping.length() < maxReceiptWidth - itemPrice.length())
					getTopping += " ";  // spaces out the receipt so prices will be aligned properly
				str += getTopping + itemPrice + "\n"; // adds the Sundae name, IceCream name, andd price into the log		
			} else { 	// if current DessertItem in ArrayList is IceCream
				while(itemName.length() < maxReceiptWidth - itemPrice.length())
					itemName += " "; // spaces out the receipt so prices will be aligned properly
				str += itemName + itemPrice + "\n";  // adds the IceCream name and price into the log
			}			
		}		
		return str; // return log
	}
	
	public String finalItems() {
		String str = ""; // logging
		String numberOfItems = "" + totalItems; // cast totalItems into String
		str += "Number of Items:"; // adds to log	
		while(str.length() < maxReceiptWidth - numberOfItems.length())
			str += " "; // spaces out the receipt so values will be aligned properly
		str += numberOfItems + "\n"; // adds the casted totalItems variable to the log 
		return str; // return log
	}
	
	public String subtotal() {
		String str = ""; // logging
		str = "Subtotal:";	
		String cost = centsConversion(totalCost()); // implements conversion method to find final price before tax
		while(str.length() < maxReceiptWidth - cost.length())
			str += " "; // spaces out the receipt so values will be aligned properly
		str += cost; // adds the casted price to the log
		return str; // return log
	}
	
	public String finalTax() {
		String str = ""; // logging
		str = "Tax:";		
		String tax = centsConversion(totalTax()); // implements conversion method to find tax		
		while(str.length() < maxReceiptWidth - tax.length())		
			str += " "; // spaces out the receipt so values will be aligned properly
		str += tax; // adds the casted tax price to the log
		return str; // return log
	}
	
	public String finalCost() {
		String str = ""; // logging
		str = "Total Cost:"; 
		String totalCost = centsConversion(totalCost() + totalTax()); // implements conversion method to find final price after tax
		while(str.length() < maxReceiptWidth - totalCost.length())
			str += " "; // spaces out the receipt so values will be aligned properly
		str += totalCost; // adds the casted tax price to the log
		return str;	// return log	
	}
	
	public String toString() {
		String receipt = ""; // logging 
		receipt += "------------------------------\n";
		receipt += "        " + storeName + "\n"; // storeName = Sweets Heaven
		receipt += "------------------------------\n"; 
		receipt += dessertListing(); // matches the DessertItem to each item in the dessert ArrayList
		receipt += "------------------------------\n";
		receipt += finalItems(); // count of all items inside ArrayList 
		receipt += "\n" + subtotal(); // cost before tax
		receipt += "\n" + finalTax(); // tax
		receipt += "\n------------------------------\n";
		receipt += finalCost(); // final cost with tax
		receipt += "\n------------------------------\n";
		
		return receipt; // return log
	}
}
