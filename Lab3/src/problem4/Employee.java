package problem4;

import java.util.Date;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    private double salary;
    private Date hireDate;
    private String insuranceNumber;

    {
        this.hireDate = new Date();
    }

    public Employee() {
    }

    public Employee(String name, double salary, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.insuranceNumber = insuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary: " + salary + ", hire date: " + hireDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Employee other = (Employee) obj;
        return salary == other.salary &&
                insuranceNumber.equals(other.insuranceNumber) &&
                hireDate.equals(other.hireDate);
    }

    @Override
    public int compareTo(Employee o) {
        if (this.salary > o.salary) return 1;
        if (this.salary < o.salary) return -1;
        return 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Employee e = (Employee) super.clone();
        e.hireDate = (Date) hireDate.clone();
        return e;
    }
}
