package Basics;

public class StringsDemo {

	public static void main(String[] args) {
		String name = "Ajay";
		System.out.println(name);
		name = name.concat("Mishra");
		System.out.println(name);
		
		int id = 5;
		System.out.println(id); //5
		id = id+10;
		System.out.println(id); //15
		
		//strings are immutable in java
		
		StringBuffer buffer = new StringBuffer("Ajay");
		System.out.println(buffer); //Ajay
		buffer.append("Mishra");
		System.out.println(buffer); //Ajay Mishra
		System.out.println(buffer.length());
		System.out.println(buffer.reverse());
		
		/*
		 * Mt vs NMT
		 * MT is faster compared to NMT
		 * NMT is safer compared to MT
		 * NMT is thread safe compared to MT
		 */
		
		/*
		 * Reverse a string
		 * 1. using inbuilt methods
		 * 2. use own logic
		 * 3. Define a string and print the third character of the string
		 * 4. Practise String Builder
		 */
		
		
				
	}
}
