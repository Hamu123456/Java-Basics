package tutorial_1_d1;

import java.util.Random;

public class DiceRoller {
	
	// local variables are declared inside a method and visible only to that method
    // global variables are declared outside a method but within a class visible to all parts of a class
	
	Random random; // Global variable
	int number = 0;
	
	DiceRoller() {
	    random = new Random(); 
		roll();
	}
	
	void roll() {
	    number = random.nextInt(6)+1;
		System.out.println(number);
	}

}
