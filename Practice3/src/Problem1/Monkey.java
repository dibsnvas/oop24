package Problem1;

public class Monkey extends Animal{
	Food favoriteFood = Food.ORANGE;
	public Monkey() {
		super();
	}
	public Monkey(String name) {
		super(name);
	}
	public Monkey(String name, int age) {
		super(name, age);
	}
	public Monkey(String name, int age, Color color) {
		super(name, age, color);
	}
	public Monkey(String name, int age, Color color, Food food) {
		super(name, age, color);
		favoriteFood = food;
	}

}
