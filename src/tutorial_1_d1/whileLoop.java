package tutorial_1_d1;

import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while loop executes a block of code as long as a condition remains true
		Scanner scanner = new Scanner(System.in);
		String name = "";
		//String name = scanner.nextLine();
		
		while(name.isBlank()) {
			System.out.println("Enter your name: ");
			name = scanner.nextLine();
		}
		
		System.out.println("Hello " + name);

	}

}
