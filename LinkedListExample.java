package CollectionProgram;
import java.util.*;
public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Integer> L1 = new LinkedList<Integer>();
		L1.add(10);
		L1.add(20);
		L1.add(30);
		L1.add(40);
		L1.add(50);
		
		//Print the Linked List in a single line
		System.out.println("The Original Linked List : "+L1);
		L1.remove(0);
		//Print the Linked List in a single line
		System.out.println("Remove 10 : " + L1);
		L1.addFirst(10);
		//Print the Linked List in a single line
		System.out.println("Add 10 at First Position : " + L1);
		L1.addLast(60);
		//Print the Linked List in a single line
		System.out.println("Add 60 at Last Position : " + L1);
		
		L1.removeFirst();
		//Print the Linked List in a single line
		System.out.println("Remove First Position Element : "+ L1);
		
		L1.removeLast();
		//Print the Linked List in a single line
		System.out.println("Remove Last Position Element : "+ L1);
		
		System.out.println("Pick the first element : " + L1.getFirst());
		System.out.println("Pick the last element : " + L1.getLast());
		
		//Print the Linked List in a single line
		System.out.println("The Original Linked List : "+L1);
		
		System.out.println("The first element : " + L1.peek());
		System.out.println("The first element : " + L1.peekFirst());
		System.out.println("The last element : " + L1.peekLast());
		
		System.out.println(L1.poll());
		System.out.println(L1.pollFirst());
		System.out.println(L1.pollLast());
		//Print the Linked List in a single line
		System.out.println("The Original Linked List : "+L1);
		
		
		/*
		 * addFirst() or offerFirst()
		 * addLast() or add() or offerLast()
		 * 
		 * removeFirst() or poll() or pollFirst()
		 * removeLast() or peekLast()
		 * 
		 * getFirst() or peek() or peekFirst()
		 * getLast() or peekLast()
		 * 
		 */
		//To pick an element index wise
		System.out.println(L1.get(0));
		System.out.println("The current linkedlist : "+L1);
		L1.set(0, 5);
		System.out.println("The current linkedlist : "+L1);
		L1.add(100);
		System.out.println("The current linkedlist : "+L1);
		L1.add(200);
		System.out.println("The current linkedlist : "+L1);
		System.out.println(L1);
		L1.set(1, 25);
		System.out.println("The current linkedlist : "+L1);
		
		
		LinkedList<Integer> L2 = new LinkedList<Integer>();
		//System.out.println(L2.getFirst());
		/*
		 * If there is no value,
		 * then for removeFirst(),
		 * java.util.NoSuchElementException will occur.
		 * 
		 * in case of poll() ,
		 * null will be output
		 * 
		 */

	}

}
