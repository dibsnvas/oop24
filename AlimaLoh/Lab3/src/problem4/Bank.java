package problem4;

import java.util.Collections;
import java.util.Vector;

public class Bank {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee("Frank", 200000, "1111");
        Employee e2 = new Employee("Daniel", 240000, "1112");
        Employee e3 = new Employee("Tyler", 200000, "1113");
        Employee e4 = new Employee("SZA", 300000, "1114");

        Vector<Employee> team1 = new Vector<>();
        Vector<Employee> team2 = new Vector<>();
        team1.add(e1);
        team1.add(e2);
        team1.add(e3);
        team2.add(e4);
        team2.add(e3);

        Employee m1 = new Manager("Brent", 200000, "1115", team1);
        Employee m2 = new Manager("Kendrick", 200000, "1116", team2);

        Vector<Employee> employees = new Vector<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(m1);
        employees.add(m2);

        System.out.println("Employees before:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        Collections.sort(employees);
        System.out.println("\nEmployees after sorting by salary:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        Collections.sort(employees, new NameComparator());
        System.out.println("\nSorted by name:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        Collections.sort(employees, new HireDateComparator());
        System.out.println("\nSorted by hire date:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("\nCloning Employee e4:");
        Employee e5 = (Employee) e4.clone();
        System.out.println(e5);

        Vector<Employee> team3 = new Vector<>();
        team3.add(e5);

        System.out.println("\nCloning Manager m1 and setting new team:");
        Manager m3 = (Manager) ((Manager) m1).clone();
        m3.setTeam(team3);
        System.out.println(m3);
    }
}
