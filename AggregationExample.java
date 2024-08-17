package InheritancePrograms;
class Address{
	int streetNum;
	String city;
	String state;
	String country;
	
	public Address(int streetNum, String city, String state, String country) {
		this.streetNum = streetNum;
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

/*
 * Here we have defined a class : Address
 * Class Address has the following Data members:
 * streetNum
 * city
 * state
 * country
 * 
 * We have defined a constructor to set the data members
 * at the time of object calling.
 * 
 * 
 */

class StudentClass{
	int rollNum;
	String studentName;
	Address studentAddr; 
	// Address : User defined Class
	// studentAddr : Object of User defined Class
	public StudentClass(int rollNum, String studentName, Address studentAddr) {
		this.rollNum = rollNum;
		this.studentName = studentName;
		this.studentAddr = studentAddr;
	}
}

/*
 	Here we have defined a class StudentClass.
 	StudentClass has the following properties.
 	1. rollNum (Integer)
 	2. studentName (String)
 ***3. studentAddr (Address)
 	Here we have defined an object of another class Address,
 	as a data member of the class StudentClass.
 	
 	It creates a special relation between the classes in JAVA.
 	This is known as Aggregation.
 	
 	It denotes:
 	StudentClass has a/an Address.
 	
 */
public class AggregationExample {

	public static void main(String[] args) {
		Address ad = new Address(10, "Kolkata", "WB", "India");
		/*
		 	Here we are creating an object of class Address ad.
		 	ad.streetNum = 10
		 	ad.city = "Kolkata"
		 	ad.state = "WB"
		 	ad.country = "India"
		 */
		StudentClass obj = new StudentClass (123, "Brijit", ad);
		/*
		 	Here we are creating an object of class StudentClass obj.
		 	obj.rollNum = 123
		 	obj.studentName = "Brijit"
		 	obj.studentAddr = ad
		 	
		 	As we know, ad contains the following.
		 	ad.streetNum = 10
		 	ad.city = "Kolkata"
		 	ad.state = "WB"
		 	ad.country = "India"
		 	
		 	--------------------------
		 	Now replacing ad by obj.StudentAddr, we will get :
		 	obj.studentAddr.streetNum = 10
		 	obj.studentAddr.city = "Kolkata"
		 	obj.studentAddr.state = "WB"
		 	obj.studentAddr.country = "India"
		 	
		 	
		 */
		System.out.println(ad.streetNum);
		System.out.println(ad.city);
		System.out.println(ad.country);
		System.out.println(ad.state);
		
		System.out.println(obj.rollNum);
		System.out.println(obj.studentName);
		System.out.println(obj.studentAddr);
		System.out.println(obj.studentAddr.streetNum);
		System.out.println(obj.studentAddr.city);
		System.out.println(obj.studentAddr.state);
		System.out.println(obj.studentAddr.country);
	}

}
