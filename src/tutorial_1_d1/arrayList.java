package tutorial_1_d1;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList is a resizable array
		// Elements can be added and removed after compilation phase
		// store reference data types
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		//food.set(0, sushi);  set sushi to replace the food from index 0
	    //food.remove(2);  remove the food from index 2
		//food.clear(); clear all the items in the food array
		
		for (int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
		
		//2D ArrayList is a dynamic list of list
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("bread");
		bakeryList.add("potato");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomato");
		produceList.add("cabbage");
		produceList.add("capsicum");
		
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("tea");
		drinksList.add("coffee");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		
		System.out.println(groceryList); // prints out the whole 2d array
		System.out.println(groceryList.get(0).get(1)); // retrieve an element in the list through index
		

	}

}
