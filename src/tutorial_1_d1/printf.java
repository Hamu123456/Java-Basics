package tutorial_1_d1;

public class printf {

	public static void main(String[] args) {
		/* printf() is used to control, format, and display text to the 
		   console window, you need a matching conversion character to 
		   display a certain object variable or value */
		
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Bro";
		int myInt = 50;
		double myDouble = 1000;
		// [conversion character]
		System.out.printf("%b", myBoolean);
		System.out.printf("%c", myChar);
		System.out.printf("%s", myString);
		System.out.printf("%d", myInt);
		System.out.printf("%f", myDouble);
		

	}

}
