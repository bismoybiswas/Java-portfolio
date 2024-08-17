package CollectionProgram;
import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		/*
		 * TreeSet stores its element in a tree,
		 * they are automatically arranged in sorted order.
		 */
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		System.out.println(ts);
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(20);
		t.add(2);
		t.add(52);
		t.add(40);
		t.add(27);
		t.add(75);
		t.add(75); // Duplicate element not allowed
		System.out.println(t);
		System.out.println("First element " + t.first());
		System.out.println("Last element " + t.last());
		System.out.println("Total size of t: " + t.size());
		System.out.println("75 is present ? " + t.contains(75));
		System.out.println("Arranged in descending order : " + t.descendingSet());
		System.out.println(t.subSet(27, 75));
		/*
		 * Here 27 is included
		 * where 75 is excluded
		 */
		System.out.println("Remove First Element : " + t.pollFirst());
		System.out.println(t);
		System.out.println("Remove Last Element : " + t.pollLast());
		System.out.println(t);
		t.clear();
		System.out.println("Already Cleared " + t);

	}

}
