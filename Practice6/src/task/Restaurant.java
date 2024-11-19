package task;


public class Restaurant {
	private int profit;
	private String name;
	private final double PRICE = 15;
	
	public Restaurant() {
		
	}
	public Restaurant(String name) {
		this.name = name;
	}
	
	public void processPayment(CreditCard card) {
		card.withdraw(PRICE);
		profit+=PRICE;
	}
	
	public void servePizza(CanHavePizza eater) {
	    Pizza pizza = Pizza.MARGARITA; 
	    
	    if (eater instanceof Person) {
	        pizza = ((Person)eater).getOrder();
	    } else if (eater instanceof Cat) {
	    	pizza = ((Cat)eater).getFavoritePizza();
	    }
	    
	    eater.eatPizza(pizza); 
	    
	    if (eater instanceof Person) {
	        processPayment(((Person)eater).getCard());
	    }
	}

	
	public String toString() {
		return "Restaurant \"" + name + "\", total profit:" + profit + "$";
	}
}