package Practice2;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);

		    System.out.print("Enter the number of levels for the pyramid: ");
		    
		    int rows = input.nextInt();
		    
		    input.close();

		    for (int i = 1; i <= rows; ++i) {
		      for (int j = 1; j <= i; ++j) {
		        System.out.print("* ");
		      }
		      System.out.println();
		    }

	}

}
