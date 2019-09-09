package day08;

public class ShortHand {
	public static void main(String[] args) {
		
		int ivar = 100;
		System.out.println(ivar);
		double dvar =123;
		System.out.println(dvar);
		float fvar= 200;
		System.out.println(fvar);
		//ivar=fvar;
		fvar=ivar;
		System.out.println(fvar);
		dvar=fvar;
		//fvar=dvar;
		dvar=ivar;
		//ivar=dvar;
		
		
		
		
		System.out.println(ivar);
		
		//long a= 30L;
		//long b= (short)a;
	//	System.out.println(b);
		
		//double a,b,c=10.5;
		//System.out.println(b);
		
		/*float a = 100.987_6543f;
		short b=(byte)a;
		byte c = (byte)b;
		System.out.println(c);
		*/
	//	byte a = 200;
	//	double b= a/2.0 + a++ + --a*a*3+100;
		
		//int a=9;
	//	System.out.println(a);
				
				System.out.println((int)(10.0/3));
				
				int x =10;
				int y = x++;
				System.out.println(y++ + " " + x++ + " " +y + " " + y++ + y);
						
		
		
	}

}
