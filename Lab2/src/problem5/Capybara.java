package problem5;

public class Capybara extends Animal {
    public Capybara(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "Murr";
    }
}
