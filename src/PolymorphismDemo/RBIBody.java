package PolymorphismDemo;

public class RBIBody {

	
	/*
	 * Polymorphism:
	 * poly = multiple/many
	 * morphism : forms
	 * 
	 * 2 Types:
	 * 1. Method Overriding: also called as dynamic polymorphism
	 * child class is overriding the same method present in parent class
	 * 
	 * 2. Method Overloading:
	 * 
	 */
	
	public void depositMoney() {
		System.out.println("People are depositing Money");
	}
	
	public void withdrawMoney() {
		System.out.println("People are withdrawing Money");
	}
	
	public void giveInterest() {
		System.out.println("RBI Interest rate is 4% pa");
	}
}
