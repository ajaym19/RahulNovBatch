package Basics;

public class ConstructorApp {

	public static void main(String[] args) {
		ConstructorClass obj1 = new ConstructorClass("Object 1");
		ConstructorClass obj2 = new ConstructorClass("Object 2");
		ConstructorClass obj3 = new ConstructorClass();
		ConstructorClass obj4 = new ConstructorClass("Ajay", 2);
		obj1.add(10, 20);
		int total = obj1.addReturnTotal(12, 13);
		System.out.println(total);
		System.out.println(obj1.addReturnTotal(1, 2));
		String name = obj1.getName("Ajay");
		System.out.println(name);
	}
}
