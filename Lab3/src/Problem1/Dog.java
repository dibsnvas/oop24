package Problem1;

public class Dog implements CanMakeSound {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Gav-gav-gav");
    }

    @Override
    public String toString() {
        return "Dog: " + name;
    }
}
