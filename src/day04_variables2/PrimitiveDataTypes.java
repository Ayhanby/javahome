package day04_variables2;

public class PrimitiveDataTypes {
	public static void main(String[] args) {
		
	
	
	/*
	 
	 Primitives: byte, short. int, long, float, double, boolean, char
	 
	 boolean :
	 
	 asciitable.com
	 */
	 boolean result = true;
	 boolean result2 =false;
	 boolean result3 = 9>3;
	   
	 System.out.println(result);  //TRUE
	 System.out.println(result2); //FALSE
	 System.out.println(result3);  //
	 
	 
	 
	 
	 
	 char char1 = 'a';
			 
			 System.out.println(char1);
	 
	 char char2 ='g';
	 char char3 ='#';
	 
	 // char with characters
	 
	 char char4 = 67;
	 
	 // prints the charecter that is corresponding to 67 from ASCII table
	 
	 System.out.println( char4 );
	 
	 char char5 = 'C'; // prints the character as it is
	 System.out.println(char5);
	 
	 char char6 = '{';
	 System.out.println(char6);
	 
	 char char7 = 123;
	 System.out.println(char7);  // prints the character that has the number of 123 from ASCII Table
	 
	 // initiaZILING CHAR TO OTHER PRIMITIVES : byte, short, int, long , float,double
	 
	 char MyChar1 = 'b';
	 
	 int MyInt = MyChar1; // the number that represents b is initalized to the int
	 System.out.println(MyInt);  //98
	 
	 // byte MyByte = MyChar1 ; // char`s memory is 2 byte, byte` memory is 1 bytes
	 byte MyByte2 = 'b'; // b`s corresponding number is 98 from ASCII table
	 System.out.println( MyByte2 );
	 
	 // short ShortNum = MyChar1; // char` memory is could be bigger than short , range is great
	 short ShortNum2 = 'b'; // b`s corresponding number is 98 from ASCII table
	 
	 
	 long LongNum = MyChar1; // long`s memory is 8 bytes
	 long LongNum2 = 'b'; //98
	 System.out.println(LongNum);
	 
	 System.out.println("================================");
	  
	 float floatNum = MyChar1;
	 float floatNum2 = 'b';
	 System.out.println( floatNum2 );
	 
	 double doubleNum = MyChar1;
	 double doubleNum2 = 'b';
	 System.out.println( doubleNum2 ); // 98.0
	 
	 

	 
	 
	}		 
    
	
	

}
