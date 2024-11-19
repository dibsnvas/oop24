package problem6;

public class Employee extends Person {
    private String company;

    public Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    @Override
    public void train() {
        System.out.println(getName() + " is training for work at " + company + ".");
    }

    @Override
    public String toString() {
        return super.toString() + " (Employee at " + company + ")";
    }
}
