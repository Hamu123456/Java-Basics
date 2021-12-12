package tutorial_1_d1;

import java.util.Scanner;

public class ifStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		if(age >= 18 && age <65) {
			System.out.println("You are an adult.");
		}
		
		else if(age>=65) {
			System.out.println("OK Boomer!");
		}
		
		else { 
			System.out.println("You are not an adult.");
		}

	}

}
