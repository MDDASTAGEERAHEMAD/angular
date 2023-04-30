package conditionalStatements;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("enter the grade");
		char grade = s.next().charAt(0);// gnoreCase();
		s.close();

		switch (grade) {

		case 'A':
			System.out.println("first calss pass");
			break;

		case 'B':
			System.out.println("Seconde calss pass");
			break;

		case 'C':
			System.out.println("third calss pass");
			break;

		default:
			System.out.println("fail");
			break;
		}

	}
}
