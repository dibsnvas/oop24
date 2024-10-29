package Labka1;
import java.util.Scanner;

public class Analyzer {
	public static void main(String[] args) {
		Data userData = new Data();
		Scanner scanner = new Scanner(System.in);
		String input;
		while(true) {
			System.out.println("Enter number (Q to quit):");
			input = scanner.nextLine();
			if(input.equals("Q")) {
				break;
			}
			userData.add(Double.valueOf(input));
		}
		System.out.println("Average = " + userData.average());
		System.out.println("Maximun = " + userData.max());
		scanner.close();
	}
}
