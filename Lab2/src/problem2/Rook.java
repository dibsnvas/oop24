package problem2;

public class Rook extends Piece{
	public Rook() {
	}
	public Rook(Color color, Position currentPosition) {
		super(color, currentPosition);
		this.setValue(5);
	}
	
	public boolean isLegalMove(Position a, Position b) {
		if(!super.isLegalMove(a, b)) return false;
		return b.getX() == a.getX() || a.getY()==b.getY();
	}
	
	public String toString() {
		return (this.getColor()==Color.BLACK?"♜":"♖");
	}


}