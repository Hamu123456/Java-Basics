package tutorial_1_d1;

public class Pizza {
	/* overloaded constructors are constructors within a class with the same  
	 name, but have different parameters - name + parameters = signature */
	
	String bread;
	String sauce;
	String cheese;
	String topping;
	
	Pizza(String bread, String sauce, String cheese, String topping) {
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	    	
	}
	
	// Pizza without toppings
	Pizza(String bread, String sauce, String cheese) {
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
	    	
	}

}
