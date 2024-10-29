package Practice2;

public class Student {
	private String name;
	private int id;
	int yearOfStudy;
	static int numOfStudents;
	public Student() {
		yearOfStudy = 1;
		id = numOfStudents++;
	}
	public Student(String name) {
		this();
		this.name=name;
	}
	public Student(String name, int yearOfStudy) {
		this(name);
		this.yearOfStudy=yearOfStudy;
	}
	public String toString() {
		return name+", id: "+id;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public void incrementYearOfStudy() {
		yearOfStudy++;
	}
}