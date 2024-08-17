package StringBufferProgram;
/*
 * String Vs StringBuffer
 * 
 * String
 * 1.
 * 2.
 * 3.
 * StringBuffer
 * 1.
 * 2.
 * 3.
 * 
 */
public class StringBufferExample {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer();
		System.out.println(s);
		/*
		 * Classroom 	: StringBuffer
		 * Constructor 	: StringBuffer()
		 * s : Object of StringBugger Class
		 */
		
		/* Method 1: Capacity */
		System.out.println("The Capacity is: "+s.capacity());
		
		/*
		 * Here,
		 * StringBuffer is the class.
		 * s is the object of StringBuffer.
		 * We have not initialized s with any String.
		 * So, capacity of s will be default (16).
		 */
		
		StringBuffer sb = new StringBuffer("Thursday comes after");
		System.out.println("The String is: "+ sb);
		System.out.println("The Capacity is: "+sb.capacity());
				
		/*
		 * Here,
		 * StringBuffer is the class.
		 * sb is the object of StringBuffer initialized with "Thursday comes after".
		 * We have initialized sb with Thursday.
		 * So, capacity of s  will be defeat (16) + length(Thursday comes after)
		 * = 16 + 20 = 36.
		 */
		
		System.out.println("=====================================");
		StringBuffer x1 = new StringBuffer("");
		System.out.println(x1);
		System.out.println("The length of x : "+x1.length());
		System.out.println("The capacity of x : "+x1.capacity());
		x1.append("Hello");
		System.out.println(x1);
		System.out.println("The length of x : "+x1.length());
		System.out.println("The capacity of x : "+x1.capacity());
		x1.append(" Welcome to Classroom");
		System.out.println(x1);
		System.out.println("The length of x : "+x1.length());
		System.out.println("The capacity of x : "+x1.capacity());
		x1.append(" Welcome to Class room Welcome to Class room");
		System.out.println(x1);
		System.out.println("The length of x : "+x1.length());
		System.out.println("The capacity of x : "+x1.capacity());
		System.out.println("=====================================");
		
		
		/* Method 2: Length of StringBuffer - Available in String */
		System.out.println("The length of sb is : "+sb.length());
		
		/* Method 3: charAt(index) - Available in String*/
		StringBuffer b = new StringBuffer("Hello");
		System.out.println("The character at index 2 is: "+ b.charAt(0));
		/* Index starts from 0
		 * H0e1l2l3o4
		 */
		
		/* Method 4: setCharAt(index, character) [NEW]*/
		StringBuffer r = new StringBuffer("Hello");
		System.out.println("The StringBuffer r is (before modification): "+ r);
		r.setCharAt(4, 'z');
		System.out.println("The StringBuffer r is (after modification): "+ r);
		
		/* Method 5: setLength() */
		StringBuffer t = new StringBuffer("Hello");
		System.out.println("Before Modificaion: (Length) " + t.length());
		t.setLength(2);
		System.out.println("After Modification: (Length) " + t.length());
		System.out.println("StringBuffer After Modification: (Truncate & update) " + t);
		t.setLength(20);
		System.out.println("The content in t :"+ t);
		/*
		 * If the length of a string (2 here) is lesser than Set Length value (20)
		 * then those extra location(20-2=18 here) will be initialized with spaces.
		 */
		
		/*
		 * Method 6: getChars()
		 * Characters are copied from this sequence into the destination character array dst.
		 * The first character to be copied is at index srcBegin ;
		 * the last character to be copied is at index srcEnd-1.
		 * The total number of characters to be copied is srcEnd-srcBegin.
		 * The characters are copied into the sub-array of dst starting at index dstBegin
		 * and ending at index:
		   dstbegin + (srcEnd-srcBegin) - 1
		   
		   Parameters:
		   srcBegin :start copying at this offset.
		   srcEnd	:stop copying at this offset.
		   dst		:the array to copy the data into.
		   dstBegin	:offset into dst.
		 */
		StringBuffer x = new StringBuffer("01234567890123456");
		char w[] =new char[100];
		x.getChars(5, 10, w, 0);
		/*
		   Here we are copying from 5th index to (10-1) = 9th
		   index. And stored in character array w at
		   Starting index 0.
		 */
		for( int i=0; i<w.length; i++)
			System.out.print(w[i]+ " ");
		
		/*
		 * Functionality:
		 * Copy a certain portion of StringBuffer and
		 * Store it with in character array.
		 * 
		 */
		System.out.println();
		System.out.println();
		System.out.println("The length of w : "+ w.length);
		
		/* Method 7: append() */
		String a;
		int c = 42;
		StringBuffer q = new StringBuffer(40);
		a=q.append("c= ").append(c).append("!").toString();
		/*
		 * q.append("c= ").append(c).append("!").toString()
		 * => (c=42).append("!").toString()
		 * => (c=42!).toString()
		 * => c=42! As String
		 */
		System.out.println(a);
		
		//--------------------------------------------------//
		StringBuffer p = new StringBuffer("Classroom");
		p.append(" Java Class");
		System.out.println(p);
		
		String k = new String();
		k=p.toString();
		
		System.out.println(k);
		
		/*
		 
		 StringBuffer p = new StringBuffer("Classroom");
		 --p is a StringBuffer [ Nature : Mutable]
		 
		 p.append(" Java Class");
		 --" Java Class" will be appended (append : insert at the end.)
		 
		 String k = new String();
		 --Blank String
		 
		 k=p.toString();
		 --StringBuffer to String Conversion
		  
		 */
		
		/* Method 8: insert(index, String) */
		StringBuffer m = new StringBuffer("I JAVA");
		m.insert(2, "like ");
		System.out.println(m);
		
		/*
		 * We insert " like " at index 2 in "I JAVA".
		 * So, result will be "I like JAVA".
		 * 
		 */
		
		/* Method 9: replace() */
		StringBuffer f = new StringBuffer("This is JAVA class");
		//f.replace(0, f.length(), "This is end of Class");
		f.replace(8, 12, "Python");
		System.out.println(f);
		
		/* Method 10: reverse() */
		StringBuffer tt = new StringBuffer("Sunday");
		System.out.println(tt);
		tt.reverse();
		System.out.println(tt);
		/*
		 * Here, we have used reverse() method.
		 * In case of string buffer,
		 * string itself will be reversed and modified.
		 * 
		 */
		
		/* Method 11: delete() */
		StringBuffer d = new StringBuffer("Today is Sunday");
		d.delete(2, 5);
		/*
		 * Today is Sunday.
		 * 0123456789.....
		 * d.delete(start, end+1);
		 * start: 2
		 * end: 4
		   It will delete 2,3,4th characters.
		 */
		System.out.println(d);
		
		/* Method 12: deleteCharAt() */
		
		StringBuffer f1 = new StringBuffer("Today is Sunday.");
		f1.deleteCharAt(2);
		System.out.println(f1);
		
		/*
		 
		 delete() vs deleteCharAt()
		 * delete() takes 2 arguments.
		 * deleteCharAt() takes only 1 argument.
		 * 
		 * delete() : Used to delete more than one character mainly.
		 * deleteCharAt() : Used to delete particular character.
		 
		 */
		
		/* Method 13: compareTo() */
		StringBuffer a1 = new StringBuffer("Today is Sunday");
		StringBuffer a2 = new StringBuffer("Today isSunday");
		
		System.out.println(a1.compareTo(a2));
		
		/*
		 * StringBuffer1.compareTo(StringBuffer);
		 * a1: xcvbAqwer
		 * a2: xcvbaqYer
		 * Ascii(A) - Ascii(a) = 65-97 = -32 Neg
		 * a1: xcvba
		 * a2: xcvbA
		 * Ascii(a) - Ascii(A) = 97-65 = 32 Pos
		 
		 * Here,
		 * 0		=> Both are Equal
		 * Positive => Mismatch found in 1st string first
		 * Negative => Mismatch found in 2nd string first	 
		 */
		
		/* Method 14: isEmpty() */
		System.out.println("The value in a1 : "+a1);
		System.out.println(a1.isEmpty()); // if a1.length() = 0, then true else false
		/*
		 * It will check, the StringBuffer is empty or not.
		 * 
		 */
		
		/* Method 15: lastIndexof() ---Available in String */
		StringBuffer p1 = new StringBuffer("Today is Sunday");
		System.out.println(p1.lastIndexOf("day"));
		/*
		 * "Today is Sunday".lastIndexof("day")
		 * 
		 * Searching will be from right to left.
		 * Today is Sunday
		 * 012345678901234
		 * day : 2 to 4     day : 12 to 14
		 */
		System.out.println(p1.lastIndexOf("day", 6));
		// 6 denotes ending index
		
		/*
		 * "Today is Sunday".lastIndexof("day",6)
		 * 
		 * Searching will be from right(6th) to left(0th).
		 * Today i
		 * 0123456
		 * day : 2 to 4
		 */
		
		/* Method 16: indexOf() */
		System.out.println(p1.indexOf("day"));
		/*
		 * "Today is Sunday".indexOf("day")
		 * 
		 * Searching will be from left to right
		 * Today is Sunday
		 * 012345678901234
		 * day : 2 to 4     day : 12 to 14
		 */
		
		System.out.println(p1.indexOf("day", 6)); // 6 denotes starting index
		
		/*
		 * "Today is Sunday".indexOf("day",6)
		 * 
		 * Searching will be from left(6th) to right(End).
		 * is Sunday
		 * 678901234
		 * 
		 * day : 12 to 14
		 */
	
		
	}

}
