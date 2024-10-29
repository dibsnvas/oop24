package practice1;
import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
		String str = input.nextLine();
		input.close();
		int n = str.length();
		for(int i = 0; i < n/2; ++i) {
			if(str.charAt(i) != str.charAt(n-i-1)) {
				System.out.print("No");
				return;
			}
		}
		System.out.print("Yes");
	    }
}
