package problem4;

import java.util.Vector;

public class Course {
	private String name;
	private String description;
	private int numberOfCredits;
	private Course[] prerequisites;
	
	public Course() {
		this.description = "no description";
		this.prerequisites = new Course[]{};
	}
	public Course(String name, int numberOfCredits) {
		this();
		this.name = name;
		this.numberOfCredits = numberOfCredits;
	}
	public Course(String name, String description, int numberOfCredits) {
		this(name, numberOfCredits);
		this.description = description;
	}
	public Course(String name, String description, int numberOfCredits, Course[] prerequisites) {
		this(name, description, numberOfCredits);
		this.prerequisites = prerequisites;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public int getNumberOfCredits() {
		return numberOfCredits;
	}
	
	public String toString(){
		Vector<String> prerequisitesNames = new Vector<String>();
		for(Course prerequisite: prerequisites) {
			prerequisitesNames.add(prerequisite.getName());
		}
		return ("Course name: " + name + "\n" + "Description: " + description + "\n" + "Credits: " + numberOfCredits + "\n" + "Prerequisites: " + prerequisitesNames + "\n");
	}
	
}