package JavaBasic;
/*
 * Constructor:
 * It is used to initialize the data members of the objects of the class.
 * 
 * GarbageCollector:
 * It is called to free the memory allocation by the objects after its execution.
 * 
 * In c++, there is a concept of Destructor.
 * We have to call manually to destroy the occupied memory by the objects.
 * 
 * In Python, there is a concept of Destructor.
 * We call call manually to destroy the occupied memory by the objects or
 * it can be done by Python itself.
 * 
 * 
 */

public class GarbageCollectionExample {
		/*
		 * The finalize() method is invoked each time
		 * before the object is garbage collected.
		 */
		public void finalize() {
			System.out.println("Object is garbage collected.");
		}
		/*
		 * The garbage collector of JVM collects only those objects
		 * that are created by new keyword.
		 */
		static void method() {
			GarbageCollectionExample g4 = new GarbageCollectionExample();
		}
		public static void main(String[] args) {
			GarbageCollectionExample g1 = new GarbageCollectionExample();
			GarbageCollectionExample g2 = new GarbageCollectionExample();
			GarbageCollectionExample g3; // Garbage Collector will not work here.
			System.out.println("Setting null as reference.");
			g1 = null;
			g2 = null;
			g3 = null;
			GarbageCollectionExample.method();
			
			//The gc() is found in System Runtime Classes.
			System.out.println("Calling before GC.");
			System.gc();
			System.out.println("Calling after GC.");
		}

	}
