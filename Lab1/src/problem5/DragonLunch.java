package problem5;

import java.util.Vector;

public class DragonLunch {
	private Vector<Person> victims = new Vector<Person>();
	private int cntBoys = 0;
	private int cntGirls = 0;
	
	public DragonLunch() {
		
	}
	
	public void displayKidnapMessage(Person a) {
		System.out.println(a + " was kidnapped😭");
	}
	public void kidnap(Person person) {
		displayKidnapMessage(person);
		victims.add(person);
		if(person.getGender() == Gender.GIRL) {
			if(cntBoys>0) {
				cntBoys--;
			}else {
				cntGirls++;
			}
		}else {
			cntBoys++;
		}
	}
	public void willDragonEatOrNot() {
		if(cntBoys + cntGirls > 0) {
			System.out.println("Dragon had delicious lunch! Dragon ate " + cntGirls + " girl(s) and " + cntBoys + " boy(s).");
			cntGirls=0;
			cntBoys=0;
		}else {
			System.out.println("Dragon is starving;(");
		}
	}
}