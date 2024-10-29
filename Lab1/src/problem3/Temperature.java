package problem3;

public class Temperature {
	private double value;
	private char scale;
	
	public Temperature() {
		this(0, 'C');
	}
	public Temperature(double value) {
		this(value, 'C');
	}
	public Temperature(char scale) {
		this(0, scale);
	}
	public Temperature(double value, char scale) {
		this.value = value;
		this.scale = scale;
	}
	public double getDegreesC() {
		if(this.scale == 'C') {
			return this.value;
		}
		return 5 * (this.value - 32)/9;
		
	}
	public double getDegreesF() {
		if(this.scale == 'F') {
			return this.value;
		}
		return 9*(this.value/5)+32;
	}
	public void set(char scale) {
		this.scale = scale;
	}
	public void set(double value) {
		this.value = value;
	}
	public void set (double value, char scale) {
		this.set(scale);
		this.set(value);
	}
	public char getScale() {
		return this.scale;
	}
	public static boolean equals(Temperature A, Temperature B) {
		return A.getDegreesC()==B.getDegreesC();
	}
	public boolean equals(Temperature A) {
		return equals(this, A);
	}
	
}
