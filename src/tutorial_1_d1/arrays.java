package tutorial_1_d1;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Arrays Example 
		String[] cars = {"Camaro", "Toyota", "Honda"};
		
	    cars[0] = "Tesla";
	    
	    for (int i=0; i<=(cars.length-1); i++) { // print the elements of the array
	    	System.out.println(cars[i]);
	    }
	    
	    String[] bicycles = new String[3];
	    bicycles[0] = "Giant";
	    bicycles[1] = "Polygon";
	    bicycles[2] = "Canondale";
	    
	    System.out.println(bicycles[0]);
	    
	    // 2D Arrays = an array of arrays
	    String [][] names = new String[3][3];
	    
	    names[0][0] = "Alvin";
	    names[0][1] = "Bob";
	    names[0][2] = "Charlie";
	    names[1][0] = "Doggy";
	    names[1][1] = "Elle";
	    names[1][2] = "Fareth";
	    names[2][0] = "George";
	    names[2][1] = "Harry";
	    names[2][2] = "Ian";
	    
	    for(int a=0; a<names.length-1; a++) {
	    	System.out.println();
	    	for(int b=0; b<=names[a].length; b++) {
	    		System.out.print(names[a][b] + " ");
	    	}
	    }
	   
	    

	}

}
