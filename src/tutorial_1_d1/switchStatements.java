package tutorial_1_d1;

import java.util.Scanner;

public class switchStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a day: ");
		String day = scanner.nextLine().toLowerCase(); //change to lower case to standardize the input
		
		switch(day) {
		
		case "sunday": System.out.println("It is Sunday");
		break;
		
		case "monday": System.out.println("It is Monday");
		break;
		
		case "tuesday": System.out.println("It is Tuesday");
		break;
		
		case "wednesday": System.out.println("It is Wednesday");
		break;
		
		case "thursday": System.out.println("It is Thursday");
		break;
		
		case "friday": System.out.println("It is Friday");
		break;
		
		case "saturday": System.out.println("It is Saturday");
		break;
		
		default: System.out.println("That is not a day!");
		
		
		}

	}

}
