package tutorial_1_d1;

public class SwapVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "water";
		String y = "Kool-Aid";
		String temp;
		
		temp = x;
		x=y;
		y=temp;
		
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);

	}

}
