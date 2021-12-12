package tutorial_1_d1;

import java.util.Scanner;

public class logicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// logical operators are used to connect two or more expressions
		// && = (AND) both conditions must be true
		// || = (OR) either condition must be true
		// ! = (NOT) reverses boolean value of condition
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the temperature outside?");
		int temp = scanner.nextInt();
		
		if (temp>30) {
			System.out.println("It is hot outside");
		}
		
		else if (temp>=20 && temp<=30) {
			System.out.println("It is warm outside");
		}
		
		else if (temp<20) {
			System.out.println("It is cold outside");
		}
		
		System.out.println("Please select Yes (Y) or No (N) if you want to continue");
		String response = scanner.next();
		
		if (response.equals("Y") || response.equals("y") ) {
			System.out.println("You selected 'Yes'");
		}
		
		else if (response.equals("N") || response.equals("n") ) {
			System.out.println("You selected'No'");
		}
		
		else {
			System.out.println("You have not selected an appropriate response!");
		}
		
		System.out.println("You are playing a game, press Q or q to quit.");
		String option = scanner.next();
		
		if (!option.equals("Q") && !option.equals("q")) {
			System.out.println("You are still playing the game");
		}
		
		else {
			System.out.println("You have quit the game");
		}

	}

}
