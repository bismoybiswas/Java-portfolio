package CollectionProgram;
import java.util.Iterator;
import java.util.PriorityQueue;
public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> num = new PriorityQueue<>();
		num.add(10);
		num.add(12);
		num.add(1);
		
		System.out.println("Result :: ");
		System.out.println(num);
		
		Iterator<Integer> itr = num.iterator();
		if(itr.hasNext()) {
			System.out.println(itr.next()+ " ");
		}
		
		System.out.println("\n"+num.size());
		
		if(itr.hasNext()) {
			System.out.println(itr.next()+ " ");
		}
		System.out.println(num.isEmpty());
		
		if(itr.hasNext()) {
			System.out.println(itr.next()+ " ");
		}
		System.out.println(num);
		num.clear();
		System.out.println(num);
	}

}
