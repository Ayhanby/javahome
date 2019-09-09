package saturday_study_08_24_19;

import java.util.Scanner;

public class study_4 {


	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Inpiut first number:");
		
		int num1 = in.nextInt();
		
		System.out.println("Input second number: ");
		
		int num2 = in.nextInt();
		
		System.out.println(num1+" + "+num2+" = "+(num1+num2));
		System.out.println(num1+" - "+num2+" = "+(num1-num2));
		System.out.println(num1+" x "+num2+" = "+num1*num2);
		System.out.println(num1+" / "+num2+" = "+num1/num2);
		System.out.println(num1+" mod "+num2+" = "+num1%num2);
		
		/*Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
	*/
	}

}
