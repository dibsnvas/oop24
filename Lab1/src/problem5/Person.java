package problem5;

public class Person {
	private String name;
	private Gender gender;
	
	public Person() {
		name = "No name";
	}
	public Person(Gender gender) {
		this();
		this.gender = gender;
	}
	public Person (String name, Gender gender) {
		this(gender);
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public String toString() {
		if(gender == Gender.GIRL) {
			return name+"(G)";
		}
		return name + "(B)";
	}
}
