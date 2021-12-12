package Basics;

import java.awt.Container;

public class ConstructorClass {

	/*
	 * Constructor: Always the same as class name to perform some pre-requisite
	 * steps, constructor is used A constructor is called wheneve an object is
	 * created There is one default constructor
	 * 
	 * A class can have multiple
	 * 
	 * 2 types: non paramterized parametrized
	 */

	public ConstructorClass() {
		System.out.println("I am in Constructor");
		// load the properties file
		// load the excel file or PF
	}

	public ConstructorClass(String message) {
		System.out.println("Message given is " + message);
	}

	public ConstructorClass(String message, int n) {
		System.out.println("Message given is " + message + " Number given is " + n);
	}

	public void getInfo() {
		System.out.println("Learning Constructor");

	}

	public void add(int num1, int num2) {
		System.out.println("Adding 2 numbers");
		int total = num1 + num2;
		System.out.println("Addition is " + total);
	}

	// add 2 numbers and no need to print, return me the total

	/*
	 * parts of a method 1. Access modifiers 2. static or non static 3. Return Type
	 * 4. Method Name
	 */
	public int addReturnTotal(int num1, int num2) {
		int total = num1 + num2;
		return total;
		//System.out.println("Hello"); -- unreachable code
	}
	
	public String getName(String name) {
		return "Hello " + name; 
	}
}
