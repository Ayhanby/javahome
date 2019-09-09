package day06_AritmeticOperators;

public class PrimitivesCasting {
	
	/*
	 
	 
	 casting: converting larger primitive to smaller sizes
	          datatype variablename = (datatype) value
	          
	          castings: Explicit & implicit
	 
	 primitives: byte, short, int, long, float, double
	 
	
	 */
	
	public static void main(String[] args) {
		
		int a=10;
		byte b = (byte) a; // explicit casting
		
		System.out.println(b);
		
		
		
		a=128;
		b = (byte) a; // explicit casting
		//+128 byte in icinde olmadigi icin -128 yapiyor
		
		System.out.println(b);
		
		
		// double DecimalNumber=10.5;
		// float FloatNumber = (float) DecimalNumber;
		
	//	System.out.println(FloatNumber);
		
		double DecimalNumber=10.5;
		float FloatNumber = (int) DecimalNumber;
		
		System.out.println(FloatNumber);
		
		long LongNum = 300L;
		
		int IntNum = (int)LongNum;
		
		System.out.println(IntNum);
		
		
		// implicit casting:
		
		
		
		
		byte ByteNum = 100;
		int IntNum2 = ByteNum;
		
		// same with:
		
		int IntNum3 = (int) ByteNum;
			
		
		short ShortNum = 100;
		//long LongNum2 = ShortNum2;
			
				
				
double LargestNumber = 100.8765;
		
		byte ByteValue = (byte) LargestNumber;
		
		System.out.println(ByteValue);  //100
		
		float FloatValue = (float) LargestNumber;
		
		System.out.println(FloatValue); // 100.8765
		
		
		
		
		
		
		  
		
			
			
			
			
		
		
		
		
		
	}
	
	

}
