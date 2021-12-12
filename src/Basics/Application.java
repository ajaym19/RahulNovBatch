package Basics;

public class Application {

	public static void main(String[] args) {
		//to call method of a class, we have to create object of that class
		//new keyword is used to create an object
		//whenever we create an object, a call to the constructor is made
		Students std1 = new Students();
		std1.studentName = "Ajay";
		std1.doExercies();
		std1.giveExams();
		System.out.println("Student 1 name "+ std1.studentName); 
		std1.schoolName = "IIT";
		System.out.println("Student 1 college name " +std1.schoolName);//iit
		
		Students std2 = new Students();
		System.out.println("Student 2 name "+std2.studentName);
		System.out.println("Student 2 college name "+std2.schoolName); //iit
		std2.schoolName = "IIM";
		System.out.println("Student 1 college name " +std1.schoolName);//iim
		System.out.println("Student 2 college name "+std2.schoolName); //iim
		
		
		std1.printCollegeName();
		std2.printCollegeName();
		
		
		Students.printCollegeName();
		
		
		/*
		 * Pending:
		 * Constructor
		 * Naming Conventions
		 * 
		 * Task:
		 * Create a logical class
		 * define some properties >> static and instance
		 * create some methods >> static and instance
		 * Create application class
		 * create an object and access static variables and static methods
		 * create an object and access non static variables and non static methods
		 * using class access static variables and static methods
		 * using class access non static variables and non static methods
		 * access or call non static variables and methods from static area
		 * access or call  static variables and methods from non static area
		 * access or call non static variables and methods from non static area
		 * access or call  static variables and methods from static area
		 */
		
	}
}
