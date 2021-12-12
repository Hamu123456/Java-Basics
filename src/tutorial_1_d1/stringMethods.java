package tutorial_1_d1;

public class stringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Bro";
		//Common String Methods as follows:
		//boolean result = name.equalsIgnoreCase("Bro");
		//int result = name.length();
		//char result = name.charAt(0);
		//int result = name.indexOf("o");
		//boolean result = name.isEmpty();
		//String result = name.toUpperCase();
		//String result = name.trim();
		String result = name.replace('o', 'a');
		
		System.out.println(result);

	}

}
