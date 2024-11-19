package problem4;

import java.util.Vector;

public class Manager extends Employee {
    private Vector<Employee> team = new Vector<>();

    public Manager() {
    }

    public Manager(String name, double salary, String insuranceNumber, Vector<Employee> team) {
        super(name, salary, insuranceNumber);
        this.team = team;
    }

    public Vector<Employee> getTeam() {
        return team;
    }

    public void setTeam(Vector<Employee> team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return super.toString() + ", bonus: " + team.size();
    }

    @Override
    public int compareTo(Employee e) {
        int salaryComparison = super.compareTo(e);
        if (salaryComparison == 0 && e instanceof Manager) {
            Manager m = (Manager) e;
            if (this.team.size() > m.team.size()) return 1;
            if (this.team.size() < m.team.size()) return -1;
            return 0;
        }
        return salaryComparison;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Manager)) return false;
        Manager other = (Manager) obj;
        return team.equals(other.team);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Manager m = (Manager) super.clone();
        m.team = (Vector<Employee>) team.clone();
        return m;
    }
}
