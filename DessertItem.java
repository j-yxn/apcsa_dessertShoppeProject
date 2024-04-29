public abstract class DessertItem implements Comparable<DessertItem> {
	 private String name;
	 public DessertItem(String name) {
		 // takes in the name of the DessertItem
	 	 this.name = name;
	 }
	
	 public abstract int getPrice(); 
	 // abstract method getPrice(), prices are calcualated differently for all items

	 public final String getName(){
		 // returns the name of the DessertItem
		 return name;
	 }
	 
	 public int compareTo(DessertItem other) {
		 // Compares prices of current item with desired item
		 if(this.getPrice() > other.getPrice())
			 // if current price is numerically larger than the other, returns 1 (positive)
			 return 1;
		 else if (this.getPrice() < other.getPrice())
			 // vice versa, but returns -1 (negative)
			 return -1;
		 else 
			 // if two prices are equal, return 0
			 return 0;
	 }
}  	
