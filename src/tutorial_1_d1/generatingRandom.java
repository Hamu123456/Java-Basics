package tutorial_1_d1;

import java.util.Random;

public class generatingRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		int x = random.nextInt(6)+1; // limit the size of integer 
		System.out.println(x);
		
		double y = random.nextDouble();
		System.out.println(y); //generate a random double value between 0 and 1
		
		boolean z = random.nextBoolean();
		System.out.println(z);

	}

}
