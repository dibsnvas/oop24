package problem6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Create Animals
        Dog dog1 = new Dog("Buddy", 3);
        Dog dog2 = new Dog("Charlie", 5);
        Dog dog3 = new Dog("Max", 2);

        // Create Persons
        Employee person1 = new Employee("Alice", 30, "TechCorp");
        Employee person2 = new Employee("Bob", 25, "HealthInc");
        Employee person3 = new Employee("Charlie", 30, "EduWorld");

        // Assign Pets
        person1.addPet(dog1);
        person2.addPet(dog2);
        person3.addPet(dog3);

        // Test Friendly Interface
        System.out.println("Is " + dog1.getName() + " friendly? " + dog1.isFriendly());

        // Test Trainable Interface
        person1.train();

        // Test Comparable with Animals
        List<Animal> animals = new ArrayList<>();
        animals.add(dog1);
        animals.add(dog2);
        animals.add(dog3);

        System.out.println("\nAnimals before sorting:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        Collections.sort(animals);

        System.out.println("\nAnimals after sorting by age:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        // Test Comparable with Persons
        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        System.out.println("\nPersons before sorting:");
        for (Person person : persons) {
            System.out.println(person);
        }

        Collections.sort(persons);

        System.out.println("\nPersons after sorting by age and name:");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
