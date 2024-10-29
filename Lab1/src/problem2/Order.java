package problem2;
import java.util.*;

public class Order {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Welcome to Diana's ice cream truck!");
		System.out.println("What flavor of ice cream do you want? (v-vanilla, c-chocolate):");
		String flavor = scanner.nextLine();
		
		System.out.println("What will be the weight of ice cream?: ");
		String input = scanner.nextLine();
		double weight = Double.valueOf(input);
		
		System.out.println("Any decorations?(s-syrup, t-toppings, n-none): ");
		String decoration = scanner.nextLine();
		
		IceCream newIceCream = new IceCream(flavor.charAt(0), weight, decoration.charAt(0));
		
		System.out.println("Price "+newIceCream.getPrice());
		
		scanner.close();
	}
}
