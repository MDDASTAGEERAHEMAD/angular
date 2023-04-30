package conditionalStatements;

public class MainEncapsulation {

	public static void main(String[] args) {

		Encapsulation e = new Encapsulation();

		e.setName("dastageer");
		// System.out.println(e.getName());

		e.setAge(34);
		// System.out.println(e.getAge());

		e.setAccNumbaer(565.87);
		// System.out.println(e.getAccNumbaer());

		System.out.println("Name : " + e.getName());

		System.out.println("age : " + e.getAge());

		System.out.println("Account Number : " + e.getAccNumbaer());
	}
}
