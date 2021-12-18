package PolymorphismDemo;

public class OverloadingApplication {

	public static void main(String[] args) {
		MethodOverloadingDemo obj = new  MethodOverloadingDemo();
		obj.sum(10, 20,30);
		obj.sum(10.5f, 24.5f);
		obj.sum(10, 24);
		
	}
}
