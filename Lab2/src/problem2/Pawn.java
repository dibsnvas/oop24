package problem2;

public class Pawn extends Piece{
	public Pawn() {
	}
	public Pawn(Color color, Position currentPosition) {
		super(color, currentPosition);
		this.setValue(1);
	}
	


	public boolean isLegalMove(Position a, Position b) {
		if(!super.isLegalMove(a, b)) return false;
		if(getColor() == Color.BLACK) {
			if(a.getY()==7) {
				return a.getX() == b.getX() && a.getY()-b.getY() <=2;
			}
			return a.getX() == b.getX() && a.getY()-b.getY() == 1;
		}
		if(a.getY()==2) {
			return a.getX() == b.getX() && b.getY() - a.getY() <=2;
		}
		return a.getX() == b.getX() && b.getY()-a.getY() == 1;
	}
	public String toString() {
		return (this.getColor()==Color.BLACK?"♟":"♙");
	}

}