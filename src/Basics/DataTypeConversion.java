package Basics;

public class DataTypeConversion {

	public static void main(String[] args) {
		/*
		 * Ur project
		 * int e;
		 * 
		 * 
		 * External project
		 * long empID;
		 * short empID;
		 * 
		 * Bucket Concept
		 * Bucket 1 >> 3L 
		 * Bucket 2 >> 5L
		 * Bucket1 to Bucket2 >> Yes
		 * Bucket2 to Bucket1 >> No >> water loss
		 * 
		 * byte >> short >> int >> long >> float >> double
		 * char
		 * String
		 * 
		 */
		
		//ur project
		int i; //declaration
		short empId;
		
		
		//another project
		short s = 50;
		int id = 4575;
		
		//store another project variables to ur variable
		i = s;
		System.out.println("The value of s is " + s);
		System.out.println("The value of i is "+ i);
		
		empId = (short) id;
		
		byte b1 = 1;;
		int i2 = 345;
		b1 = (byte) i2;
		i2 = b1;
		
		
		float f1;
		double d1 = 34.54;
		f1 = (float) d1;
		
		int i3 = (int) f1; 
		i3 = (int) d1; 
		
		//char to int
		//it stores the ascii value of the character
		char c1 = 'b';
		int i4 = c1;
		System.out.println("The value of c1 is "+c1);
		System.out.println("The value of i4 is "+i4);
		
		//int to char
		int i5 = 9756;
		char c2 = (char) i5;
		System.out.println("The value of i5 is "+i5);
		System.out.println("The value of c2 is "+c2);
		
		//see the loss
		double d3 = 45.95;
		int i7 = (int)d3;
		System.out.println("Original value "+d3);
		System.out.println("New value "+i7);
		
		//every primitive data type has corresponding wrapper class
		//int >> Integer
		//float >> Float
		
		//int to string
		int i8 = 56;
		String s1 = Integer.toString(i8);
		System.out.println("Integer values "+i8);
		System.out.println(i8+10); //66
		System.out.println("String values "+s1);
		System.out.println(s1+10);
		
		System.out.println("Learning the Output");
		System.out.println(10+20); //30
		System.out.println("10+20"); //10+20
		//appending
		System.out.println("Ajay "+"Mishra");
		System.out.println(10+1+1); //12
		System.out.println(10+ "Ajay");//10Ajay
		System.out.println(10+2+"Ajay");//12Ajay
		System.out.println("Ajay"+10);//Ajay10
		System.out.println("Ajay"+1+2);//Ajay3
		System.out.println("Ajay"+"M"+10);//AjayM10
		//Ajay1+2 >> Ajay12
		System.out.println(1+2+"Ajay"+3+4);//
		
		//String to int
		String s3 = "120";
		int i9 = Integer.parseInt(s3);
		System.out.println("String values "+s3);
		System.out.println(s3+10); //12010
		System.out.println("Integer values "+i9);
		System.out.println(i9+10); //130
		
		String s4 = "Ajay";
		int i0 = Integer.parseInt(s4);
		
		//double to String
		
		
		
		
	}
}
