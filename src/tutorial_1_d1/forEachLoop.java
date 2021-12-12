package tutorial_1_d1;

import java.util.ArrayList;

public class forEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] animals = {"cat", "dog", "bird", "fish"};
		
		for(String i : animals) {
			System.out.println(i);
		}
		
		System.out.println("\n");
		
		ArrayList<String> fruits = new ArrayList<String>();
		
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("pear");
		fruits.add("grape");

		for(String i : fruits) {
			System.out.println(i);
		}
	}

}
