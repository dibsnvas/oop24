package problem5;

public class TestDragonLunch {
	public static void main(String[] args) {
		DragonLunch dl = new DragonLunch();
		dl.willDragonEatOrNot();
		dl.kidnap(new Person(Gender.GIRL));
		dl.kidnap(new Person(Gender.BOY));
		dl.kidnap(new Person(Gender.BOY));
		dl.kidnap(new Person(Gender.GIRL));
		dl.kidnap(new Person(Gender.GIRL));
		dl.kidnap(new Person(Gender.GIRL));
		
		dl.willDragonEatOrNot();
	}
}