package problem3;

public class TestTemperature {
	public static void main(String[] args) {
		Temperature t1 = new Temperature(35);
		
		System.out.println(t1.getDegreesC());
		System.out.println(t1.getDegreesF());
		
		t1.set('F');
		
		System.out.println(t1.getScale());
	}
}
