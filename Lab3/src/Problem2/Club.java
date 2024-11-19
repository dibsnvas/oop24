package Problem2;

import java.util.Vector;

public class Club {

	public static void main(String[] args) {
		Vector<Moveable> furniture = new Vector<Moveable>();
		Vector<Dancable> guests = new Vector<Dancable>();
		
		Moveable t1 = new Table("wood", new Position(5, 3) );
		Moveable t2 = new Table("wood", new Position(1, 3) );
		Moveable t3 = new Table("wood", new Position(0, 3) );
		Moveable t4 = new Table("wood", new Position(5, 4) );
		
		Dancable p1 = new Person("Alima", 50, new Position(0, 0));
		Dancable p2 = new Person("Diana", 60, new Position(0, 0));
		Dancable p3 = new Person("Madina", 70, new Position(0, 0));
		
		furniture.add(t1);
		furniture.add(t2);
		furniture.add(t3);
		furniture.add(t4);
		
		guests.add(p1);
		guests.add(p2);
		guests.add(p3);
		
		for(Moveable table: furniture) {
			table.move();
		}
		for(Dancable guest: guests) {
			guest.move();
		}
		for(Dancable guest: guests) {
			guest.dance();
		}

	}

}