package problem4;

import Practice2.Student;

public class Grade {
	private double point;
	private Student student;
	private Gradebook gradebook;
	
	public Grade() {
		
	}
	public Grade(double point) {
		this.point = point;
	}
	public Grade(double point, Student student, Gradebook gradebook) {
		this(point);
		this.student = student;
		this.gradebook = gradebook;
	}
	
	public double getPoint() {
		return point;
	}
	public String toString() {
		return point + " (" + student + ")";
	}
}