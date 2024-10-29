package practice1;
import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input number a: ");
        int a = input.nextInt();
        
        System.out.print("Input number b: ");
        int b = input.nextInt();
        
        System.out.print("Input number c: ");
        int c = input.nextInt();
        
        input.close();
        
        if (a == 0) {
            System.out.println("The value of 'a' cannot be zero.");
            return;
        }
        
                int discriminant = b * b - 4 * a * c;
        
                if (discriminant < 0) {
            System.out.println("Discriminant is lower than 0, cannot find real roots.");
            return;
        }
        
        double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        
        System.out.println("The values of x1 and x2 are: x1 = " + x1 + ", x2 = " + x2);
    }

}
