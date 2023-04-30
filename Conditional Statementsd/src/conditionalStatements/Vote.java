package conditionalStatements;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("enter the name");

		String name = s.next();

		System.out.println("enter the age");

		int age = s.nextInt();
		s.close();
		if (age >= 18) {

			System.out.println(name + " is elegible to vote");
		}

		else {
			System.out.println(name + "not eligible for vote");

		}

	}

}
