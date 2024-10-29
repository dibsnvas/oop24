package practice1;
import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the initial balance: ");
        double initialValue = input.nextDouble();
        
        System.out.print("Enter the interest rate (in %): ");
        double interest = input.nextDouble();
        
        input.close();
        
        double newBalance = initialValue + initialValue * (interest / 100);
        
        System.out.printf("New Balance: %.2f%n", newBalance);
    }
}
