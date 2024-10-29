package problem2;

public class Bishop extends Piece{
	public Bishop() {
	}
	public Bishop(Color color, Position currentPosition) {
		super(color, currentPosition);
		this.setValue(3);
	}
	
	public boolean isLegalMove(Position a, Position b) {
		if(!super.isLegalMove(a, b)) return false;
		return Math.abs(b.getX() - a.getX() ) ==  Math.abs(b.getY() - a.getY() );
	}
	public String toString() {
		return (this.getColor()==Color.BLACK?"♝":"♗");
	}

}