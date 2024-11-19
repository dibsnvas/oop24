package Problem1;

public class Dombyra extends Instument {
    private String model;

    public Dombyra(String brand, String model) {
        super(brand);
        this.model = model;
    }

    @Override
    public void makeSound() {
        System.out.println("*Dombyra sounds*");
    }

    @Override
    public void play() {
        System.out.println("Playing the Dombyra!");
    }

    @Override
    public String toString() {
        return super.toString() + ", model: " + model;
    }
}
