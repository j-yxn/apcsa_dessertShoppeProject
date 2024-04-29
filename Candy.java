public class Candy extends DessertItem {
	private double weight; // weight
	private int perPound; // price per pound 	
	private int price; // total price, in cents
	
	public Candy(String name, int p, double w) {
		// sets desired name, weight, and price per pound
		super(name);
		perPound = p;	
		weight = w;
	}
	
	public int getPrice() {
		// returns total price of the Candy item
		price = (int)Math.round(weight * perPound);
		return price;
	}
	
	public int getPerPound() {
		// returns the price per pound of the Candy item
		return perPound;
	}
	
	public double getWeight() {
		// returns the weight of the Candy item
		return weight;
	}
}
