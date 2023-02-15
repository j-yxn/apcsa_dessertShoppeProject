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
	     * Candy(String name, int pricePerPound, double weight)
	     * 
	     * Cookie(String name, int pricePerDozen, int amount)
	     * 
	     * IceCream(String name, int price)
	     * 
	     * Sundae(String IceCream name, String Topping name, int IceCream price, int Topping price)
	    */
	    
	    check.enter(new Candy("Jolly Ranchers", 309, 3.22));
	    check.enter(new IceCream("Strawberry Ice Cream", 140));
	    check.enter(new Candy("Twizzlers", 240, 1.00));
	    check.enter(new Sundae("Caramel Fudge Sundae", "Choc. Ice Cream", 140, 90));
	   
	    	    
	    System.out.println(check);
	    
	    check.clearAll();
	}
}
