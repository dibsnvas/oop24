package Problem2;

import java.util.Scanner;
import java.util.Vector;

public class University {
	public static void main(String[] args) {
		Vector<Person> persons = new Vector<Person>();
		Scanner scanner = new Scanner(System.in);
		String input, input2;
		while(true) {
			System.out.println("Q-to quit, A-to add, S-to show");
			input = scanner.nextLine();
			if(input.charAt(0) == 'Q') {
				break;
			}
			if(input.charAt(0) == 'A') {
				System.out.println("1-to add Person, 2-to add Student, 3-to add Staff");
				input = scanner.nextLine();
				System.out.println("enter name:");
				String name = scanner.nextLine();
				System.out.println("enter address:");
				String address = scanner.nextLine();
				if(input.equals("2")) {
					System.out.println("enter program:");
					String program = scanner.nextLine();
					System.out.println("enter year:");
					input2 = scanner.nextLine();
					int year = Integer.valueOf(input2);
					System.out.println("enter fee:");
					input2 = scanner.nextLine();
					double fee = Double.valueOf(input2);
					persons.add(new Student(name, address, program, year, fee));
				}else if(input.equals("3")) {
					System.out.println("enter school:");
					String school= scanner.nextLine();
					System.out.println("enter pay:");
					input2 = scanner.nextLine();
					double pay = Double.valueOf(input2);
					persons.add(new Staff(name, address, school, pay));
				}else {
					persons.add(new Person(name, address));
				}
			}else {
				System.out.println(persons);
			}
		}
		scanner.close();
	}

}