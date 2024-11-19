package problem6;

public abstract class Animal implements Comparable<Animal>, Friendly {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract String getSound();

    @Override
    public int compareTo(Animal other) {
        // Default comparison by age
        return Integer.compare(this.age, other.age);
    }

    @Override
    public boolean isFriendly() {
        // Default behavior (override in subclasses if needed)
        return true;
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + "}";
    }
}
