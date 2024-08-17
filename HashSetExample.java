package CollectionProgram;
import java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		/*
		 * HashSet Features:
		 * 1. It contains unique elements
		 * 2. It is not ordered
		 */
		hs.add("Sunday");
		hs.add("Monday");
		hs.add("Tuesday");
		hs.add("Sunday");
		hs.add("Sunday");
		hs.add("Sunday");
		hs.add("Sunday");
		System.out.println(hs);
		//------------------------------------------------//
		System.out.println(hs.contains("Sunday"));
		System.out.println(hs.contains("Friday"));
		/*
		 	hs contains "Sunday" ? true/false
		 */
		//------------------------------------------------//
		System.out.println("HashSet contains total "+hs.size() + " element");
		hs.remove("Sunday");
		System.out.println("HashSet contains total "+hs.size() + " element");
		System.out.println(hs);
		System.out.println("HashSet is empty? " + hs.isEmpty());
		hs.clear();
		System.out.println(hs);
		System.out.println("HashSet is empty? " + hs.isEmpty());

	}

}
