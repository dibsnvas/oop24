package problem6;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "Woof";
    }

    @Override
    public boolean isFriendly() {
        return true; // Dogs are usually friendly
    }
}
