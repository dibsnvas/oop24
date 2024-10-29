package problem4;
import java.util.*;

import Practice2.Student;

public class Gradebook {
	private Course course = new Course();
	private Student[] students = new Student[] {};
	private Vector<Grade> grades = new Vector<Grade>();
	private Grade maxGrade = new Grade(-1);
	private Grade minGrade = new Grade(200);
	private double sumOfGrades;
	
	{
		displayMessage();
	}
	public Gradebook() {
		
	}
	public Gradebook(Course course) {
		this.course = course;
	}
	public Gradebook(Course course, Student[] students) {
		this(course);
		this.students = students;
	}
	
	public String toString() {
		return "About this gradebook:\n" + course + "Current grades: " + grades + "\n";
	}
	
	public void updateMaxGrade(Grade newGrade) {
		if(newGrade.getPoint() > maxGrade.getPoint()) {
			maxGrade = newGrade;
		}
	}
	public void updateMinGrade(Grade newGrade) {
		if(newGrade.getPoint() < minGrade.getPoint()) {
			minGrade = newGrade;
		}
	}
	public void inputGrades() {
	    System.out.println("Input grades for students. This will overwrite current grades! (press Q to quit):");
	    Scanner scanner = new Scanner(System.in);

	    Vector<Grade> newGrades = new Vector<Grade>();
	    sumOfGrades = 0;

	    for (Student student : students) {
	        System.out.print(student + ": ");
	        
	        // Check for input and ensure it's a valid double
	        while (true) {
	            String input = scanner.nextLine(); // Read input as a string
	            
	            if (input.equalsIgnoreCase("Q")) {
	                System.out.println("Exiting input.");
	                scanner.close(); // Close the scanner if quitting
	                return; // Exit the method if user quits
	            }
	            
	            try {
	                Double point = Double.parseDouble(input); // Try parsing the input to a double
	                Grade newGrade = new Grade(point, student, this);
	                newGrades.add(newGrade);
	                updateMaxGrade(newGrade);
	                updateMinGrade(newGrade);
	                sumOfGrades += point;
	                break; // Exit loop if input is valid
	            } catch (NumberFormatException e) {
	                System.out.print("Invalid input. Please enter a valid grade: ");
	            }
	        }
	    }

	    grades = newGrades; // Update grades
	}

	public double getClassAverage() {
		return sumOfGrades/grades.size();
	}
	public void displayMessage() {
		System.out.println("Welcome to the grade book!\nIt's a tool for changing and monitoring grades.");
	}
	public void displayGradeReport() {
		if(grades.size()<1) {
			System.out.println("There is no enough data!");
			return;
		}
		System.out.println("Class average point: " + getClassAverage() + ".\n" + "Lowest grade is " + minGrade + ".\n" + "Highest grade is " + maxGrade + ".\n");
		outputBarChart();
		System.out.print("\n");
	}
	public void outputBarChart() {
		int[] barChart = new int[11];
		for(Grade grade: grades) {
			barChart[(int)grade.getPoint()/10]++;
		}
		for(int i=0; i<=10; i++) {
			if(i==0) {
				System.out.print("00-09: ");
			}else if(i==10) {
				System.out.print("100: ");
			}else{
				System.out.print(String.format("%d-%d: ", i*10, i*10+9));
			}
			for(int j=0; j<barChart[i]; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	
}