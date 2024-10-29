package problem4;

import Practice2.Student;

public class TestGradebook {
	public static void main(String[] args) {
		Student s1 = new Student("Student A");
		Student s2 = new Student("Student B");
		Student s3 = new Student("Student C");
		Student s4 = new Student("Student D");
		Student s5 = new Student("Student E");
		Student s6 = new Student("Student F");
		Course pp1 = new Course("PP1", "Objective of this course is to teach students how to use basic programming principles for creating\n"
				+ "console and desktop applications", 4);
		Course pp2 = new Course("PP2", 4);
		Course oop = new Course("Objective Oriented Programming", "very cool course", 3, new Course[] {pp1, pp2});
		Gradebook gradebook = new Gradebook(oop, new Student[] {s1, s2, s3, s4, s5, s6});
		
		gradebook.inputGrades();
		gradebook.displayGradeReport();
		System.out.print(gradebook);
	}
}