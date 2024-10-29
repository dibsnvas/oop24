package problem2;

public class Knight extends Piece{
	public Knight() {
	}
	public Knight(Color color, Position currentPosition) {
		super(color, currentPosition);
		this.setValue(3);
	}
	
	public boolean isLegalMove(Position a, Position b) {
		if(!super.isLegalMove(a, b)) return false;
		return (Math.abs(b.getX() - a.getX()) == 2 && Math.abs(b.getY() - a.getY()) == 1) ||  (Math.abs(b.getX() - a.getX()) == 1 && Math.abs(b.getY() - a.getY()) == 2);
	}
	public String toString() {
		return (this.getColor()==Color.BLACK?"♞":"♘");
	}

}