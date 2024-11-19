package Problem1;

public abstract class Instument implements CanMakeSound {
    private String brand;

    public Instument(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void play();

    @Override
    public String toString() {
        return "Instrument brand: " + brand;
    }
}
