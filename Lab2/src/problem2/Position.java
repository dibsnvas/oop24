package problem2;

public class Position {
	private char x;
	private int y;
	public Position() {
		
	}
	public Position(char x, int y) {
		this.x = x;
		this.y = y;
	}
	public Position(String s) {
		this(((s.toUpperCase().charAt(0)<'A' || s.toUpperCase().charAt(0)>'H')?'A':s.toUpperCase().charAt(0)), (s.toUpperCase().charAt(1)-'0' < 1 || s.toUpperCase().charAt(1)-'0' > 8)?'1':s.toUpperCase().charAt(1) - '0');	
	}
	public char getX() {
		return x;
	}
	public void setX(char x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public boolean equals(Object o) {
		if(o==null) return false;
		if(this==o) return true;
		if(this.getClass()!=o.getClass()) return false;
		return x==((Position)o).getX() && y==((Position)o).getY();
	}
	
	public String toString() {
		return Character.toString(x)+y;
	}
	
	
}