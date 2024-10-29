package Problem1;

public class Animal {
    String name;
    int age;
    Color color;

        public Animal() {
        age = 0;
        color = Color.UNDEFINED;
        name = "No Name";
    }

    public Animal(String name) {
        this();
        this.name = name;
    }

    public Animal(String name, int age) {
        this(name);
        this.age = age;
    }

    public Animal(String name, int age, Color color) {
        this(name, age);
        this.color = color;
    }

    @Override
    public String toString() {
        return name + "(" + age + ", " + color.toString() + ")";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color.toString();
    }
    
    public void feed() {
    	System.out.println(this + " just ate");
    }

    public void feed(Food food) {
        System.out.println(this + " just ate " + food);
    }
}
