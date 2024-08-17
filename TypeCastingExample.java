package JavaBasic;

public class TypeCastingExample {

	public static void main(String[] args) {
		byte b = 1;
		short s = 100;
		char c = 'a';
		int i = 10;
		long k = 10000;
		float f = 54.5f;
		double d =5.89;
		
		/*
		 * Widening Type Casting / Implicit Type Casting / Automatic Type Casting
		 * 
		 * byte(1) -> short(2) -> char(2) -> int(4) -> long(8) -> float(4) -> double(8)
		 * 
		 * Narrowing Type casting / Explicit Type Casting
		 * 
		 * byte(1) <- short(2) <- char(2) <- int(4) <- long(8) <- float(4) <- double(8)
		 * 
		 */
		double r1 = b;
		System.out.println("Output: byte to double : "+ r1);
		
		int r2 = c;
		System.out.println("Output: character to int : "+ r2);
		
		float r3 = k;
		System.out.println("Output: long to float : "+ r3);
		
		long r4 = (long)f;
		System.out.println("Output: float to long : "+ r4);
		
		long r5 = (long) d;
		System.out.println("Output: double to long : "+ r5);
	}

}
