package task;

public class Test {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Diana's Pizzas");
        CanHavePizza p1 = new Person("Diana", new CreditCard(123, 200), Pizza.HAWAIIAN);
        CanHavePizza p2 = new Person("Madina", new CreditCard(423, 500), Pizza.MEXICAN);
        CanHavePizza c1 = new Cat("Aminaloh", "brown", Pizza.MARGARITA);
        CanHavePizza c2 = new Cat("Alimadura", "white", Pizza.HAWAIIAN);
        
        restaurant.servePizza(p1); 
        restaurant.servePizza(p2);
    	restaurant.servePizza(c1);
		restaurant.servePizza(c2);

        System.out.println(restaurant);
    }
}
