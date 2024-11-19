package Problem1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<CanMakeSound> soundMakers = new ArrayList<>();

        soundMakers.add(new Dog("Madina"));
        soundMakers.add(new Dog("Amina"));

        soundMakers.add(new Dombyra("Yamaha", "Acoustic"));
        soundMakers.add(new Dombyra("Fender", "Electric"));

        for (CanMakeSound soundMaker : soundMakers) {
            soundMaker.makeSound();
        }
    }
}
