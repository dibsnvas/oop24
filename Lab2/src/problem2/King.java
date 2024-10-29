package problem2;

public class King extends Piece{
	public King() {
	}
	public King(Color color, Position currentPosition) {
		super(color, currentPosition);
	}
	
	
	public boolean isLegalMove(Position a, Position b) {
		if(!super.isLegalMove(a, b)) return false;
		return Math.abs(b.getX() - a.getX() )<=1 && Math.abs(a.getY()-b.getY()) <= 1;
	}
	
	public String toString() {
		return (this.getColor()==Color.BLACK?"♚":"♔");
	}

}