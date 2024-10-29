package problem2;

public abstract class Piece {
	boolean isMoved=false;
	private Color color;
	private Position currentPosition;
	private int value;
	public Piece() {
		
	}
	public Piece(Color color, Position currentPosition) {
		this.color = color;
		this.currentPosition = currentPosition;
	}
	
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	public Position getCurrentPosition() {
		return currentPosition;
	}
	public void setCurrentPosition(Position currentPosition) {
		this.currentPosition = currentPosition;
	}
	
	public abstract String toString();
	
	public boolean isLegalMove(Position a, Position b) {
		if(a.equals(b)) return false;
		return true;
	};
	
	public void setIsMoved(boolean isMoved) {
		this.isMoved = isMoved;
	}
	
	public boolean isNotMoved() {
		return isMoved==false;
	}
}