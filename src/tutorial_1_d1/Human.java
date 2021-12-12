package tutorial_1_d1;

public class Human {
	private String Name; // attributes must be set to private
	private int age;
	double height;
	private double weight;
	
	// constructor must be set to public to allow everyone to access
	public Human(String Name, int age, double height, double weight){
		this.Name = Name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// method must be set to public
	public void eat() {
		System.out.println(this.Name + " is eating." );
	}
	
	public void drink() {
		System.out.println(this.Name + " is drinking.");
	}
	
	 public double bmi() {
		double bmi = (this.weight)/(Math.pow(this.height/100, 2));
		System.out.println(this.Name + " has a BMI of " + bmi);
		return bmi; // always include the return type at the end of the method
	}

}
