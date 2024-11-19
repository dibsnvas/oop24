package Problem2;

public class Table implements Moveable{
	private String material;
	private Position pos;
	public Table() {
	}
	public Table(String material, Position pos) {
		this.material=material;
		this.pos=pos;
	}
	public void move() {
		pos.x=0;
		pos.y=0;
		System.out.println("*table was moved to the side*");
	}
	
}