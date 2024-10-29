package problem2;

public class Queen extends Piece{
	public Queen() {
	}
	public Queen(Color color, Position currentPosition) {
		super(color, currentPosition);
		this.setValue(9);
	}
	
	public boolean isLegalMove(Position a, Position b) {
		if(!super.isLegalMove(a, b)) return false;
		Rook testRook = new Rook();
		Bishop testBishop = new Bishop();
		return testRook.isLegalMove(a, b) || testBishop.isLegalMove(a, b);
	}
	
	public String toString() {
		return (this.getColor()==Color.BLACK?"♛":"♕");
	}
	
}