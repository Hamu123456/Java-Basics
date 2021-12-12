package tutorial_1_d1;

/* An object is an instance of a class that may contain attributes
and  methods eg. phone, computer, car*/

public class CarObject {
	String make = "Tesla";
	String model = "Model X";
	int year = 2020;
	String color = "White";
	
	void drive() {
		System.out.println("You drive the car"); 
	}

	void brake() {
		System.out.println("You apply the brakes");
	}

}
