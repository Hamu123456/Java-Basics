package tutorial_1_d1;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// method is a block of code that is executed whenever it is called upon
        String name = "John";
        int age = 18;
		hello(name, age);
		
		int a = 1;
		int b = 2;
		System.out.println("The sum of a and b is " + add(a,b));
	}
	
	static void hello(String name, int age) {
		System.out.println("Hello " + name);
		System.out.println("Your age is " + age);
	}
	
	static int add(int a, int b) {
		int sum = a + b;
		return sum;		
	}

}
