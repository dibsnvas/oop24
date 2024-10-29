package problem5;

public class Zebra extends Animal {
    public Zebra(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "Chirp";
    }
}
