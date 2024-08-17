package StringBuilderProgram;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder s =new StringBuilder("Hello");
		s.append(" Hi");
		/* append : Insert at the end */
		System.out.println(s);
		
		/* append() */
		s.append(" Hello");
		System.out.println(s);
		
		// s.append("Hi").append("Hello");
		
		s.append("Sunday ").append("Monday");
		System.out.println(s);
		
		StringBuilder t = new StringBuilder("abcde");
		System.out.println(t.charAt(0));
		
		for(int i=0; i<t.length(); i++) {
			System.out.println(t.charAt(i));
		}
		
		/* codePointBefore() : Ascii of 0th Character 'H' of String builder s*/
		System.out.println(t.codePointBefore(1));
		
		
		System.out.println("Rishi"+"Banerjee");
		
		StringBuilder name = new StringBuilder();
		name.append("Rishi").append("Banerjee");
		System.out.println(name);
		
		name.insert(2, 'a');
		System.out.println(name);
		
		/*
		 	"RishiBanerjee".insert(2, 'a');
		 	RishiBanerjee
		 	0123456789012
		 	
		 	We will insert a at 2nd index.
		 	Ri   shiBanerjee
		 	01 2 3456789012
		 	Ri a shiBanerjee
		 	RiashiBanerjee
		 */
		
		System.out.println(name.isEmpty());
		
		StringBuilder d = new StringBuilder("Today");
		System.out.println(d.indexOf("day"));
		System.out.println(d.indexOf("day", 4));
		/* day is not found with in Today after 4th Character */
		System.out.println(d.lastIndexOf("day"));
		System.out.println(d.lastIndexOf("day", 4));
		
		/* How to convert StringBuilder to String */
		String y = d.toString();
		System.out.println(y);
		
		/* How to convert String to StringBuilder */
		StringBuilder k = new StringBuilder(y);
		System.out.println(k);
		
		/* StringBuilder reverse */
		System.out.println(k.reverse());
		
		/* StringBuilder replace */
		StringBuilder v = new StringBuilder("Today");
		v.replace(2,4,"done");
		System.out.println(v);
		
		/*
		 * v.replace(2,4,"done");
		 * "Today".replace(2,4,"done");
		 * To da y
		 * 01 23 4
		 * To done y
		 * 
		 * StringBuilder.replace(Start,End+1,"String");
		 */
		
		/* setCharAt */
		StringBuilder p = new StringBuilder("Today");
		p.setCharAt(4,'R');
		System.out.println(p);
		/*
		 * We are replacing a particular indexed character
		 */
		
		StringBuilder w = new StringBuilder("Today");
		StringBuilder r = new StringBuilder("Today");
		
		System.out.println(w.compareTo(r));
		System.out.println("Today".compareTo("TodaY"));
		System.out.println("TodaY".compareTo("Today"));
		
		r.delete(2, 4); /* delete 2 & 3 index character */
		//StringBuilder.delete(start, end+1)
		System.out.println(r);
		
		StringBuilder a = new StringBuilder("Today"); // a reference 100
		StringBuilder b = new StringBuilder("Today"); // b reference 200
		StringBuilder c = a; 						  // c = reference 100
		
		/* reference should be same */
		System.out.println(r.equals(r));
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.length());
	}

}
