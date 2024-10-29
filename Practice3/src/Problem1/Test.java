package Problem1;

public class Test {
    static void doSmth(Animal a) {
        if (a instanceof Monkey) {
            System.out.println("Favorite food: " + ((Monkey) a).favoriteFood);
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Some animal", 2);
        System.out.println(animal);
        animal.feed();

        Monkey mon = new Monkey("Madina", 2, Color.BROWN, Food.PEACH);
        System.out.println(mon);
        mon.feed();
        mon.feed(Food.ORANGE);
        mon.feed(Food.PEACH);   
        doSmth(mon);
    }
}
