package Practice2;

import java.util.Scanner;

public class Task1 {
    
    public int id;
    public String name;
    public int yearOfStudy;
    
    public Task1(String name, int id, int yearOfStudy) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = yearOfStudy;
    }
    
    public void incrementYear() {
        ++yearOfStudy;
    }
    
    public String getName() {
        return name;
    }
    
    public int getID() {
        return id;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        
        System.out.print("Enter year of study: ");
        int yearOfStudy = scanner.nextInt();
        
        Task1 student = new Task1(name, id, yearOfStudy);
        
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getID());
        System.out.println("Year of Study: " + student.yearOfStudy);
        
        student.incrementYear();
        System.out.println("Updated Year of Study: " + student.yearOfStudy);
        
        scanner.close();
    }
}
