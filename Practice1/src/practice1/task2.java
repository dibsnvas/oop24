package practice1;
import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input number: ");
		int number = input.nextInt();
		input.close();
		System.out.println(number*number);
		System.out.println(number*4);
		System.out.println(number*Math.sqrt(2));
	}

}
