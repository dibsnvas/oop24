package task;

public class Person implements CanHavePizza{
	private String name;
	private CreditCard card;
	private Pizza favoritePizza;
	public Person() {
		
	}
	public Person(String name, CreditCard card, Pizza favoritePizza) {
		this.name=name;
		this.card=card;
		this.favoritePizza=favoritePizza;
	}
	public String getName() {
		return name;
	}
	public CreditCard getCard() {
		return card;
	}	
	public Pizza getFavoritePizza() {
		return favoritePizza;
	}
	public Pizza getOrder() {
		return getFavoritePizza();
	}
	
	public void eatPizza(Pizza pizza) {
		System.out.println("Yummy!");
		
	}
	
	public String toString() {
		return name;
	}
	
	
}