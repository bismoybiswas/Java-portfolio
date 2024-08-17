package Static_Programs;

public class ObjectCount {
	static int count=0;
	ObjectCount(){
		count++;
	}
	
	static void display() {
		System.out.println("Total created : "+count);
	}
	public static void main(String[] args) {
		ObjectCount.display();
		ObjectCount obj1 = new ObjectCount();
		ObjectCount.display();
		ObjectCount obj2 = new ObjectCount();
		ObjectCount.display();
		ObjectCount obj3 = new ObjectCount();
		ObjectCount.display();
	}

}
