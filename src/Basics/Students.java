package Basics;

public class Students {
	
	//object has? properties,behaviors
	String studentName;
	int studentId;
	String subject;
	char gender;
	int mobileNumber;
	static String schoolName;
	
	/*
	 * Types of Variables:
	 * 1. Global :any variable declared inside the class but outisde a method
	 * 		Instance
	 * 		Static
	 * 2. Local
	 */
	
	/*
	 * Methods:
	 * 1. Access Modifiers
	 * 2. static vs non-static
	 * 3. return type
	 * 4. method name
	 */
	
	public void attendClass() {
		System.out.println("Students are attending classes");
	}
	
	public void doExercies() {
		System.out.println("Students are doing exerice");
	}
	
	public void giveExams() {
		studentId = 5;
		int i = 10;
		schoolName = "IIT";
		System.out.println("Students are giving exams");
		//doExercies();
		//showCollegeName();
	}
	
	public static void showCollegeName() {
		schoolName = "IIT";
		staticmore();
		Students s1 = new Students();
		//s1.giveExams();
		//studentId = 5;
		//i = 5; not allowed
	}
	
	public static void staticmore() {
		System.out.println("Hello");
	}
	
	public static void printCollegeName() {
		System.out.println("The common School Name is " + schoolName);
	}
	
	//for any method, if you want to access only static variables
	//then make the method as static
	
}
