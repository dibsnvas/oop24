package practice1;
import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the score: ");
        int score = scanner.nextInt();

        String[] grades = {"F", "D", "D+", "C-", "C", "C+", "B-", "B", "B+", "A-", "A"};

        String grade;
        if (score <= 50) {
            grade = grades[0]; 
        } else if (score >= 95) {
            grade = grades[10]; 
        } else {
            int index = (score - 51) / 5 + 1;
            grade = grades[index];
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
