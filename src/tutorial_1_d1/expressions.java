package tutorial_1_d1;

public class expressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// expressions = operands & operators
		// operands = values, variables, numbers, quantity
		// operators = + - * / %
		
		int friends = 0;
		
		int add_1_friend = friends + 1;
		
		System.out.println("I have added " + add_1_friend + " into the team.");
		
		// incremental addition
		int apples = 1;
		apples++;
		System.out.println("Number of apples is " + apples);
		
		// decremental subtraction
		int oranges = 1;
		oranges--;
		System.out.println("Number of oranges is " + oranges);
		
		// integer division, number will be truncated if there is remainder
		int a = 10;
		a = a/3;
		System.out.println(a);
		
		// use a double for division with remainder to get decimal 
		double b = 10;
		b = b/3;
		System.out.println(b);
		
		
		

	}

}
