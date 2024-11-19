package Problem2;

public class Person implements Dancable{
	private String name;
	private double joyLevel;
	private Position pos;
	
	public Person() {
	}
	

	public Person(String name, double joyLevel, Position pos) {
		super();
		this.name = name;
		this.joyLevel = joyLevel;
		this.pos = pos;
	}


	public String getName() {
		return name;
	}

	public double getJoyLevel() {
		return joyLevel;
	}

	public void move() {
		pos.x=5;
		pos.y=5;
		System.out.println("*"+name+ " on the dancefloor*");
	}
	public void dance() {
		joyLevel*=1.2;
        System.out.println(name + " is dancing with joy level: " + joyLevel);

	}
	
	
	
}