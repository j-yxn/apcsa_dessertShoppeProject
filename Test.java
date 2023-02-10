public class Test 
{	
	public static void main(String[] args) 
	  {  
	    Checkout check = new Checkout();
	   
	    /* To add an item to cart: enter(DessertItem item) 
	     * 
	     * Setup for Dessert Items: 
	     * 
	     * (All prices listed in cents)
	     * 
	     * Candy(String name, double weight, int pricePerPound)
	     * 
	     * Cookie(String name, int amount, int pricePerDozen)
	     * 
	     * IceCream(String name, int price)
	     * 
	     * Sundae(String IceCream name, int IceCream price, String Topping name, int Topping cost)
	    */
	    
	    check.enter(new Candy("Jolly Ranchers", 3.22, 309));
	    check.enter(new IceCream("Strawberry Ice Cream", 140));
	    check.enter(new Candy("Twizzlers", 1.00, 240));
	    check.enter(new Sundae("Vanilla Bean", 140, "Gummy Worms", 90));
	    check.enter(new Cookie("Chocolate Chip Cookie", 5, 1299));
	    check.enter(new Cookie("Raisin Cookie", 2, 1299));
	    	    
	    System.out.println(check);
	    
	    check.clearAll();
	}
}
