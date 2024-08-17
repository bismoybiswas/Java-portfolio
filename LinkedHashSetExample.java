package CollectionProgram;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
import java.util.LinkedHashSet;
public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		
	
		
		/*
		 * In HashSet :
		 * 1. Unique Elements
		 * 2. Unordered
		 * 
		 * In LinkedHashSet :
		 * 1. Unique Elements
		 * 2. Ordered
		 */
		
		System.out.println(set);
		Iterator<String> str = set.iterator();
		while(str.hasNext()) {
			System.out.println(str.next());
		}
		while(str.hasNext()) {
			System.out.println(str.next());
		}
		while(str.hasNext()) {
			System.out.println(str.next());
		}
		while(str.hasNext()) {
			System.out.println(str.next());
		}
		while(str.hasNext()) {
			System.out.println(str.next());
		}
		while(str.hasNext()) {
			System.out.println(str.next());
		}
		
		Class<? extends LinkedHashSet> cls =set.getClass();
		// get all fields of the class
		Field[] fields = cls.getDeclaredFields();
		// print the name and type of each field
		for (Field field : fields) {
			System.out.println(field.getName() + " - " + field.getType());
		}
		Method[] methods = cls.getDeclaredMethods();
		
		// print the name and return type of each method
		for (Method method : methods) {
			System.out.println(method.getName() + " - " + method.getReturnType());
		}

	}

}
