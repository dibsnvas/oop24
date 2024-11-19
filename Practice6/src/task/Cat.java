package task;

public class Cat implements CanHavePizza{
	private String name;
	private String color;
	private Pizza favoritePizza;
	public Cat() {
		
	}
	public Cat(String name, String color, Pizza favoritePizza) {
		this.color=color;
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	 public Pizza getFavoritePizza() {
	        return favoritePizza;
	    }
	
	public void joySounds() {
		System.out.println("Meow-Meow;3");
	}
	public void sadSounds() {
		System.out.println("Meow:(");
	}
	public void eatPizza(Pizza pizza) {
		if(pizza==favoritePizza) joySounds();
		else sadSounds();
	}
	
	public String toString() {
		return name + ", "+color + "colored cat"; 
	}

}