package Controlflow;

import com.sun.tools.classfile.Annotation.element_value;

public class ControlFlowStatement {

	public static void main(String[] args) {
		/*
		 * watch videos
		 * 
		 * if user is enrolled allow him to watch videos else ask him to enroll
		 * 
		 * = is used for assignment == is ised for comparison
		 * 
		 */
		// 5 to 25, -3 to 4
		for (int i = -3; i <= 4; i++) {
			// i =1,y,e> 2, y, e > 3, y, e, 10, n
			// System.out.println(i);
		}

		System.out.println("Learning If");
		// if number = 1, print ajay
		// if number = 2, print Nikita
		// if number = 5, print Nidhi
		// else print Bipin

		int number = 5;
		if (number == 1) {
			System.out.println("Ajay");
		} else if (number == 2) {
			System.out.println("Nikita");
		} else if (number == 5) {
			System.out.println("Nidhi");
		} else {
			System.out.println("Bipin");
		}

		/*
		 * Print 1 to 10 if found 2, print ajay if found 4, print bipin if found 6, stop
		 * break is used to exit from the loop
		 */

		System.out.println("Learning for with if-else");
		for (int i = 1; i < 11; i++) {
			if (i == 2) {
				System.out.println("Ajay");
			} else if (i == 4) {
				System.out.println("Bipin");
			} else if (i == 6) {
				break;
			} else {
				System.out.println(i);
			}
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("Ajay");
			break;
		}

		// while loop is used if we dont know the limit
		System.out.println("Learning while loop");
		int counter = 11;
		while (counter <= 10) {
			System.out.println("Ajay");
			counter++;
		}

		System.out.println("Learning Do while");
		// if you want the task to be performed atleast for the first time
		// irrespective of the condition then use do while

		int printing = 11;
		do {
			System.out.println("Hello");
			printing++;
		} while (printing <= 3);

		System.out.println("Learning Switch");
		// if you have more than 3 conditions, go for switch

		int day = 2;
		switch (day) {
		default:
			System.out.println("Please enter number from 1-7");
			break;
		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;

			
		}

	}
}
