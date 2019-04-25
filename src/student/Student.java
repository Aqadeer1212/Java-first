package student;

import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		/*
		 * Create a Student Database with the following attributes:
- New Student constructor that takes name and SSN in the arguments
- Automatically create an email ID based on the name
- Set a private static ID
- Generate a user ID that is combination of Static ID, random 4-digit number between 1000 and 9000, and last 4 of SSN
- Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
- Use encapsulation to set variables (phone, city, state)
		 * 
		 */
		Studentuser s1=new Studentuser("AbdulQadeer","1223412");
		
		// methods calling
		
		// set  methods
		s1.setPhone(1234567890);
		s1.setCity("Dublin");
		s1.setState("town centre");
		
		System.out.println(s1.getPhone());
		System.out.println(s1.getCity());
		System.out.println(s1.getState());
		// methods
		s1.enroll();
		s1.pay();
		s1.checkBalance();
		s1.toString();
		s1.showCourses();
		
		System.out.println("\n");
		//..........
		
		Studentuser s2=new Studentuser("Sherry", "102012");
		// methods calling
		
				// set  methods
				s2.setPhone(2374894);
				s2.setCity("London");
				s2.setState("abcasd");
				
				System.out.println(s2.getPhone());
				System.out.println(s2.getCity());
				System.out.println(s2.getState());
				
				// methods
				s2.enroll();
				s2.pay();
				s2.checkBalance();
				s2.toString();
				s2.showCourses();
		
	}

}

class Studentuser{
	
	private String name;
	private String SSN;
	private String email_ID;
	private static int id=100;
	private String userID;
	// to be set through encapsulation
	private int phone;
	private String city;
	private String state;

	
	// generate id = setid(); // staticid + 4 random digit number b/w 1000 and 9000 + last 4 of SSN
	
	Studentuser(String name, String SSN){
		this.name= name;
		this.SSN= SSN;
		id++;
		// calling method to set an email_id based on the name.
		make_email_ID(name);
		// calling method to set generate user ID
		GenerateID();
	}

	
	public static void make_email_ID(String name) {
		System.out.println("Your ID is: " + id);
		System.out.println("Your email_ID generated from an email is:  " + name +"@gmail.com");
	}
	public  void GenerateID() {
		int random= (int) (Math.random()*9000 + 1);
		userID= (id +"" + random+"" +SSN.substring(SSN.length()-4))  ;
		System.out.println("Your User ID is:  " + userID);
		
	}
	public void setPhone(int phone) {
		this.phone=phone;
	}
	public int getPhone() {
		return phone;
	}
	
	public void setState(String state) {
		this.state=state;
	}
	public String getState() {
		return state;
	}
	public void setCity(String city) {
		this.city=city;
	}
	
	public String getCity() {
		return city;
	}
	public void enroll() {
		System.out.println("Student Enrolled:");
	}
	public void pay() {
		System.out.println("your pay is:");
	}
	public void checkBalance() {
		System.out.println("your balance is:");
	}
	public String toString() {
		return("the string is:");
	}
	public void showCourses() {
		System.out.println("your courses are:");
	}
}
