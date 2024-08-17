package JavaBasic;

public class OperatorExample {

	public static void main(String[] args) {
		int x=10, y=6;
		System.out.println("Arithmatic Operator: ");
		System.out.println("x+y = "+(x+y));
		System.out.println("x-y = "+(x-y));
		System.out.println("x*y = "+(x*y));
		System.out.println("x/y = "+(x/y));
		System.out.println("x%y = "+(x%y));
		
		/*
		 * System.out.println("Classroom"+20+15+"Java Class");
		 * Classroom2015Java Class
		 * System.out.println("Classroom"+(20+15)+"Java Class");
		 * In System.out.println ::
		 * 1. Until we are not starting without String, normal addition operation will be performed.
		 * 2. If we found string, then from string concatenation operator will be performed.
		 */

		
		System.out.println("Unary Operator: ");
		System.out.println("Post-Increment of x: "+(x++)); //After this line x=11
		System.out.println("Pre-Increment of x: "+(++x)); //In this line x=12
		System.out.println("Post-Decrement of x: "+(x--)); //After this line x=11
		System.out.println("Pre-Decrement of x: "+(--x)); //In this line x=10
		
		System.out.println("Relational Operator: ");
		System.out.println("x==y : "+(x==y));
		System.out.println("x!=y : "+(x!=y));
		System.out.println("x>y : "+(x>y));
		System.out.println("x<y : "+(x<y));
		System.out.println("x>=y : "+(x>=y));
		System.out.println("x<=y : "+(x<=y));
		
		System.out.println("Logical Operator: ");
		System.out.println("(15>7)||(8>6) : "+((15>7)||(8>6)) );
		System.out.println("(5>8)&&(8>6) : "+((5>8)&&(8>6)) );
		System.out.println("(~4) :"+(~4));
		/*
		 * ~x = (-x)-1
		 * ~(4) = (-4)-1 = -5
		 * ~(-4) = (-(-4))-1 = 3
		 * 
		 */
		
		System.out.println("Bit-wise Operator: ");
		System.out.println("(4|8) :"+(4|8));
		System.out.println("(-4|8) :"+(-4|8));
		
		System.out.println("(5&9) :"+(5&9));
		System.out.println("(7^9) :"+(7^9));
		
		System.out.println("Shift Operator: ");
		System.out.println("5>>2 :"+(5>>2));
		/*
		 * 5/2 = 2 : 5>>1
		 * 2/2 = 1 : 5>>2
		 * 
		 */
		System.out.println("5<<2 :"+(5<<2));
		/*
		 * 5*2 = 10 : 5<<1
		 * 10*2 = 20 : 5<<2
		 * 
		 */
		System.out.println("5<<25 :"+(5<<25));
		/*
		 * 5/2 = 2 : 5>>1
		 * 2/2 = 1 : 5>>2
		 * 1/2 = 0 : 5>>3
		 * :
		 * :
		 * 0/2 = 0 : 5>>25
		 */
}


}
