package day04_variables2;

public class WarmupTask {
	
	/*
	 
	 1. Cucumber =2.5$  => float or double
	 2. Tomatoes =3$    => float or double
	 3. Onion    =1.5$
	 4. Green Papper   =2$
	 5. Carrot   =4$
	 */

	
	public static void main(String[] args) {
		// Cucumber 
		// int cucumber = 2.5; we can only assign whole numbers to int, byte,short
		
		float Cucunber = 2.5f; // float cannot contain double
		double Cucumber2 = 2.5f; // double can contain float ?
		double Cucumber3 = 2.5;
				
				//Onion: 1.5
				float Onion = 1.5F;
				double Onion2 = 1.5; //istersen f kullanabilirsin floattan buyuk oldugu icin olur
				
				// Green Pepper: 2$
				byte GreenPepper =2;
				short GreenPepper2 =2;
		        int GreenPepper3 =2;
		        long GreenPepper4 =2;
		        float GreenPepper5 =2; // only time we add f or F is, when are assigning decimals
		        double GreenPepper6 =2;
		        
		        System.out.println( GreenPepper);
		        System.out.println( GreenPepper2);
		        System.out.println(GreenPepper3);
		        System.out.println(GreenPepper4);
		        System.out.println( GreenPepper5);
		        System.out.println(GreenPepper6);
		     	        
		        
	}
}
