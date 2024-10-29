package Practice2;

public class TestTIme {
	public static void main(String[] args) {
		Time time = new Time(30,7,59);
		time.setTime(00, 43, 10);
		System.out.println(time.toUniversal());
		System.out.println(time.toStandard());
		
		Time time2 = new Time(5,39,15);
		System.out.println(time2.toUniversal());
		System.out.println(time2.toStandard());
		
		Time sumOfTimes = Time.add(time, time2);
		System.out.println(sumOfTimes.toUniversal());
		System.out.println(sumOfTimes.toStandard());
		
	}
}