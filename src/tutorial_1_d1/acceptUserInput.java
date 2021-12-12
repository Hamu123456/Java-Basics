package tutorial_1_d1;

import java.util.Scanner;

public class acceptUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); //creating a scanner to accept user input
		
		System.out.println("What is your name?");
		String name = scanner.nextLine(); //assigning the user input into a string variable
		System.out.println("Hello " + name);
		
		System.out.println("How old are you?");
		int age = scanner.nextInt(); //assigning the user input into an int variable
		scanner.nextLine(); //add this line of code to ensure that the next scan code is able to execute well after the scanner.nextInt
		System.out.println("You are "+age+" years old");
		
		System.out.println("What is your favourite food?");
		String food = scanner.nextLine();
		System.out.println("You like "+food);

	}

}
