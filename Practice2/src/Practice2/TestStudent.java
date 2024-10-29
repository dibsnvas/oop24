package Practice2;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student("Diana", 2);
		System.out.println(s1);
		System.out.println(s1.getName());
		System.out.println(s1.getId());
		s1.incrementYearOfStudy();
		System.out.println(s1);
		Student s2 = new Student("Arlan", 2);
		s2.incrementYearOfStudy();
		System.out.println(s2);
		
	}
}