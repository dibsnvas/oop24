package problem6;

import java.util.ArrayList;
import java.util.List;

public abstract class Person implements Comparable<Person>, Trainable {
    private String name;
    private int age;
    private List<Animal> pets = new ArrayList<>();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void addPet(Animal pet) {
        pets.add(pet);
    }

    public void removePet(Animal pet) {
        pets.remove(pet);
    }

    public boolean hasPets() {
        return !pets.isEmpty();
    }

    @Override
    public int compareTo(Person other) {
        // Compare by age, then by name if ages are equal
        int ageComparison = Integer.compare(this.age, other.age);
        if (ageComparison != 0) {
            return ageComparison;
        }
        return this.name.compareTo(other.name);
    }

    @Override
    public void train() {
        System.out.println(name + " is training!");
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "', pets=" + pets + "}";
    }
}
