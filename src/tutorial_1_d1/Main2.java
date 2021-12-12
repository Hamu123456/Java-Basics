package tutorial_1_d1;

public class Main2 {

	public static void main(String[] args) {
		Human Angie = new Human("Angie", 20, 160, 50);
		
	    System.out.println(Angie.height);
	    
	    Angie.eat();
	    Angie.bmi();
	    System.out.println("\n");

	    
	    System.out.print("A random dice roll: ");
	    DiceRoller diceRoller = new DiceRoller();
	    System.out.println("\n");
	    
	    Pizza pizza1 = new Pizza("thick crust", "tomato", "mozzerella", 
	    		                  "peppeeroni");
	    
	    System.out.println(pizza1.bread);
	    System.out.println(pizza1.sauce);
	    System.out.println(pizza1.cheese);
	    System.out.println(pizza1.topping);
	    
	    
	}
	
	

}
