package Class.java;
class Voter{
	/*Data Member*/
	int id;
	String Name;
	String Address;
	
	/*Default Constructor*/
		Voter(){
			this.id = 100;
			this.Name = "Anonymous";
			this.Address = "Unknown";
		}
	/*
	 * 	When we are creating object of voter with out any argument,
	 * 	the default constructor will help you to initialize
	 * 	the data members of that object with some default value.
	 */
	/*Parameterized Constructor */
		Voter(int id, String Name, String Address){
			this.id = id;
			this.Name = Name;
			this.Address = Address;
		}
	/*Copy Constructor */
		Voter(Voter passingObject){
			this.id = passingObject.id;
			this.Name = passingObject.Name;
			this.Address = passingObject.Address;
		}
		void display() {
			System.out.println(this.id);
			System.out.println(this.Name);
			System.out.println(this.Address);
		}
}


public class Copy_Constructor {
	public static void main(String[] args) {
		Voter Pritam =new Voter();
		Pritam.display();
		/*
		 * Pritam.id = 100;
		 * Pritam.name = "Anonymous";
		 * Pritam.Address = "Unknown";
		 */
		Voter Pranay = new Voter(200, "Pranay","Uttarpara");
		
		/*
		 * Pranay.id = 200;
		 * Pranay.name = "Pranay";
		 * Pranay.Address = "Uttarpara";
		 * 
		 */
		Pranay.display();
		Voter Akash = new Voter(Pranay);
		/*
		 * Akash.id = Pranay.id = 200;
		 * Akash.name = Pranay.name = "Pranay";
		 * Akash.Address = Pranay.Address = "Uttarpara";
		 * 
		 */
		Akash.display();

	}

}
