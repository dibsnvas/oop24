package problem5;

public class Student extends Person {
    private String school;

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    @Override
    public String getOccupation() {
        return "Student at " + school;
    }
}
