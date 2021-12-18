package PolymorphismDemo;

public class MethodOverloadingDemo {

	/*
	 * Method Overloading
	 * Same method with different signatures
	 * this can be achieved in 2 ways
	 * 1. Different number of parameters
	 * 2. Same number of parameters but with diff data type
	 * 
	 * Note: By changing the return type?
	 * No we cannot
	 * 
	 */
	
	public void sum(int num1, int num2) {
		System.out.println("Adding 2 int numbers");
	}
	
	public void sum(float num1, float num2) {
		System.out.println("Adding 2 float numbers");
	}
	
	public void sum(int num1, int num2, int num3) {
		System.out.println("Adding 3 int numbers");
	}
	
//	public int sum(int num1, int num2, int num3) {
//		System.out.println("Adding 3 int numbers");
//		int sum = num1+num2+num3;
//		return sum;
//	}
	
	
	
	
}
