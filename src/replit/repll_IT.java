package replit;

import java.util.Scanner;

public class repll_IT {
	
	public static void main(String[] args) {
		 Scanner scan = new Scanner (System.in);
		    
	    System.out.println("Enter a number");
		    
	    int a = scan.nextInt();
	
		if(a>=1) {
			System.out.println(a + " is positive");
			
		}else if (a<=-1) {
			System.out.println("Enter a number");
			
			  System.out.println(a + " is negative");  
		}else {
			System.out.println("it is zero");
			
		}
		
		
		 System.out.println("Enter a number");
		    
		    int b = scan.nextInt();
		
			if(b>=1) {
				System.out.println(b + " is positive");
				
			}else if (b<=-1) {
				System.out.println("Enter a number");
				
				  System.out.println(b + " is negative");  
			}else {
				System.out.println("it is zero");
				
			}
			 System.out.println("Enter a number");
			    
			    int c = scan.nextInt();
			
				if(c>=1) {
					System.out.println(c + " is positive");
					
				}else if (c<=-1) {
					System.out.println("Enter a number");
					
					  System.out.println(c + " is negative");  
				}else {
					System.out.println("it is zero");
					
				}
	}
	

}
